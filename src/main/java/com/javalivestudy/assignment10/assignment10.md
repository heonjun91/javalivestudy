# 자바 멀티쓰레드


#### 학습할 것

[1. Thread 클래스와 Runnable 인터페이스](#Thread-클래스와-Runnable-인터페이스)

[2. 쓰레드의 상태](#쓰레드의-상태)

[3. 쓰레드의 우선순위](#쓰레드의-우선순위)

[4. Main 쓰레드](#Main-쓰레드)

[5. 동기화](#동기화)

[6. 데드락](#데드락)



---
### Thread 클래스와 Runnable 인터페이스
1. 프로세스(Process)
    - 메모리를 할당받아 실행중인 프로그램
    - Thread를 이용하면 한 프로세스 내에서 두가지 이상의 일을 동시에 할 수 있다.
    
2. 쓰레드(Thread)
    - 프로세스 내에서 실행되는 하나의 단위
    - JVM에 의해 하나의 프로세스가 발생, main()안의 실행문들이 하나의 스레드
    - main()이외의 또다른 스레드를 만드려면 Thread 클래스 상속 / Runnable 인터페이스 구현
    - 동시에 여러개의 요청을 처리하여 속도를 빠르게 하기위해 사용 (멀티쓰레드)
    
3. Thread 클래스로 구현
```java
public class assingment10 {
    public static void main(String[] args) {
        //Thread Class로 쓰레드 구현
        ThreadClass t1 = new ThreadClass();

        //쓰레드 1 실행
        t1.start();
        
    }
}

class ThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Class 사용");
    }
}
```

4. Runnable 인터페이스로 구현
   - 상속이 가능하기 때문에 주로 사용
```java
public class assingment10 {
    public static void main(String[] args) {
        //Runnable Interface로 쓰레드 구현
        Runnable r = new RunnableInterface();
        Thread t2 = new Thread(r);

        //쓰레드 2 실행
        t2.start();
    }
}

class RunnableInterface implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable Interface 사용");
    }
}
```


---
### 쓰레드의 상태



---
### 쓰레드의 우선순위



---
### Main 쓰레드



---
### 동기화



---
### 데드락