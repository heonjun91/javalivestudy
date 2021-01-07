# 자바 인터페이스


#### 학습할 것

[1. 인터페이스](#인터페이스)

[2. 정의하는 방법](#정의하는-방법)

[3. 구현하는 방법](#구현하는-방법)

[4. 레퍼런스를 통해 구현체를 사용하는 방법](#레퍼런스를-통해-구현체를-사용하는-방법)

[5. 상속](#상속)

[6. Default Method 자바 8](#Default-Method-자바-8)

[7. static Method 자바 8](#static-Method-자바-8)

[8. private Method 자바 9](#private-Method-자바-9)

---
### 인터페이스
자바에서는 클래스를 통한 다중 상속은 지원하지 않음
하지만 다중 상속의 이점을 버릴 수는 없기에 자바에서는 인터페이스라는 것을 통해 다중 상속을 지원
1. 인터페이스(interface)란 ?
   - 다른 클래스를 작성할 때 기본이 되는 틀을 제공
   - 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상 클래스를 의미
   - 자바 8부터 상수, 추상메소드 뿐만 아니라 디폴트메소드, 정적메소드도 포함
   
2. 인터페이스의 장점
   - 대규모 프로젝트 개발 시 일관되고 정현화된 개발을 위한 표준화 가능
   - 클래스의 작성과 인터페이스의 구현을 동시에 진행 -> 개발 시간을 단축
   - 클래스와 클래스 간 인터페이스로 연결 -> 클래스마다 독립적인 프로그래밍이 가능
---
### 정의하는 방법
```java
public interface 인터페이스명{
    //상수
    타입 상수명 = 값; //컴파일때 자동으로 public static final
    
    //추상메소드
    타입 메소드명(매개변수, ...); //컴파일때 자동으로 public abstract
    
    //디폴트메소드
    default 타입 메소드명(매개변수, ...);
    
    //정적메소드
    static 타입 메소드명(매개변수, ...);
}
```

```java
public interface Animal{
    void feed();
}
```


---
### 구현하는 방법
- 추상 클래스와 마찬가지로 자신이 직접 인스턴스를 생성할 수 없음.
- 인터페이스가 포함하고 있는 추상 메소드를 구현해줄 클래스를 작성해야함.
```java
class 클래스명 implements 인터페이스명 { ... }
```
```java
public interface Animal{
    void feed();
}

public class Cat implements Animal{
    public void feed(){
        System.out.println("생선꺼억");
    }
}

public class Dog implements Animal{
    public void feed(){
        System.out.println("뼈다귀꺼억");
    }
}

public class assignment8{
   public static void main(String[] args) {
      Cat c = new Cat();
      Dog d = new Dog();
      
      c.feed();
      d.feed();
   }
}
```
---
### 레퍼런스를 통해 구현체를 사용하는 방법
```java
public interface Animal{
   void feed();
}

public class Cat implements Animal{
   public void feed(){
      System.out.println("생선꺼억");
   }
}

public class Dog implements Animal{
   public void feed(){
      System.out.println("뼈다귀꺼억");
   }
}

public class assignment8{
   public static void main(String[] args) {
      Animal cat = new Cat(); //인터페이스 Animal을 Cat을 통해 레퍼런스화
      Dog d = new Dog();
      
      cat.feed();
      d.feed();
   }
}
```

---
### 상속
- 인터페이스는 인터페이스로부터만 상속을 받을수 있다.
- 다중 상속 가능
- 여러개의 인터페이스를 상속받은 인터페이스를 클래스에 적용할땐 모든 메서드를 구현
```java
interface A{...}
interface B{...}
interface C{...}

//인터페이스는 다중 상속이 가능
interface D extends A, B, C{
}

```
---
### Default Method 자바 8
- 오버라이딩 하지 않으면 인터페이스에서 제공된 메소드를 사용
- 오버라이딩 필요한 것만 재정의
```java
public interface Animal {
  
   default boolean isThinking() {
      return false;
   }
}
public class Cat implements Animal{
   
}
public class Human implements Animal {
   @Override
   public boolean isThinking() {
      return true;
   }
}

public class assignment8 {
   public static void main(String[] args) {
      Human human = new Human();
      Cat cat = new Cat();
      human.isThinking(); //true
      cat.isThinking(); //false
      
   }
}
```


---
### static Method 자바 8
- 인터페이스에서 제공해주는 메소드를 사용
- interface명.메소드명 으로 호출

```java
public interface Animal{
   void feed();
   
   static void print(){
      System.out.println("동물인터페이스");
   }
}

public class assignment8{
   public static void main(String[] args) {
       Animal.print(); //"동물인터페이스"
   }
}
```

---
### private Method 자바 9

1. 특성
   - 메소드 body가 있고 abstract이 아님
   - static or non-static
   - 구현 클래스와 인터페이스가 상속되지 않음
   - 인터페이스에서 다른 메소드를 호출 할 수 있음