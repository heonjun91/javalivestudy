# 자바 클래스


#### 학습할 것

[1. 클래스 정의하는 방법](#클래스-정의하는-방법)

[2. 객체 만드는 방법 (new 키워드 이해하기)](#객체-만드는-방법-new-키워드-이해하기)

[3. 메소드 정의하는 방법](#메소드-정의하는-방법)

[4. 생성자 정의하는 방법](#생성자-정의하는-방법)

[5. this 키워드 이해하기](#this-키워드-이해하기)

---
### 클래스 정의하는 방법
Class 란?
- 변수(데이터, 속성)와 메서드(행위)를 가지고 있는 집합
- 객체를 생성하기 위한 틀이다.
- class키워드로 정의하고, new연산자를 통해서 인스턴스(객체)를 생성

```java
public class classEx(){
    private int a; // 변수
    
    public int setA(){  // 메서드
        return a;
    }
}
```

---
### 객체 만드는 방법 (new 키워드 이해하기)
new 란? 
- 클래스 타입의 인스턴스(객체)를 생성해주는 역할
- 객체 생성 과정
  1. new 연산자를 통해 메모리(Heap 영역)에 데이터를 저장할 공간을 할당
  2. 그 공간의 참조값을 객체에게 반환
  3. 생성자를 호출

```java
classEx ex1 = new classEx();
```

---
### 메소드 정의하는 방법
접근제한자 접근범위 ?
  - public    : 같은 클래스, 같은 패키지, 자식 클래스 , 그 외
  - protected : 같은 클래스, 같은 패키지, 자식 클래스
  - private   : 같은 클래스
  - default   : 같은 클래스, 같은 패키지
```java
public int setA(){  // 메서드
    return a;
}
```


---
### 생성자 정의하는 방법
```java
public Class classEx{
      private int a;
      
      //기본 생성자
      public void classEx(){}

      //매개변수를 가진 생성자
      public void classEx(int a){
            this.a = a;
      }
}
```
```java
class classExTest{
  public static void main(String[] args){
    classEx e1 = new classEx(); //기본 생성자 사용
    classEx e2 = new classEx(1); //매개변수 생성자 사용
  }
}
```

---
### this 키워드 이해하기
+ this ? 객체 자신을 가리키는 키워드
```java
public Class classEx{
      private int a;
      
      public void classEx(int a){
          this.a = a; //클래스 자기자신의 멤버 a에 a값을 할당
      }
}
```   
+ this() ? 자신이 속한 클래스의 생성자
```java
public Class classEx{
    public classEx(){
        sout("기본생성자");    
    }
    
    public void classEx(int a){
        this(); //기본생성자 실행 
                //반드시 생성자의 최상단에 사용
    }
}
```   
+ super , super() ? 부모 클래스 , 부모클래스의 생성자 
