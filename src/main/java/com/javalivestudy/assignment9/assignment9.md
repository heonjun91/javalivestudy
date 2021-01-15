# 자바 예외 처리


#### 학습할 것

[1. 예외 처리 방법](#예외-처리-방법)

[2. 자바가 제공하는 예외 계층 구조](#자바가-제공하는-예외-계층-구조)

[3. Exception과 Error의 차이는?](#Exception과-Error의-차이는)

[4. RuntimeException과 RE가 아닌 것의 차이는?](#RuntimeException과-RE가-아닌-것의-차이는)

[5. 커스텀한 예외 만드는 방법](#커스텀한-예외-만드는-방법)



---
### 예외 처리 방법
1. 예외 처리(Exception Handling) 란?
    - 프로그램이 처리되는 동안 특정한 문제가 일어났을 때 처리를 중단하고 다른 처리를 하는 것   
    - 일반예외(Exception) : 컴파일 시점에 발생하는 예외, 컴파일러가 개발자에게 예외처리 하라고 알려줌
    - 실행예외(Runtime Exception) : 프로그램 실행시에 발생하는 예외, 개발자의 경험에 의해 예외처리 해야함   
    
    
2. 예외 처리 방법
    1. try , catch , finally(옵션)
        - try : 실제 코드가 들어가는 곳(예외가 발생할 가능성이 있는 코드)
        - catch : 예외 발생 시 처리할 코드
        - finally : 예외처리와 상관없이 무조건 수행되는 코드
        - 실행순서
            + 예외 발생 : try -> catch -> finally
            + 예외 미발생 : try -> finally   
    
    2. throws
           
       
    3. throw

```java
public class assignment9 {
    public static void main(String[] args) {

        int n=0;

        try{
            n = 5/0; // 예외 발생
            n = 5; //실행안됨
        }
        catch (Exception e){
            //예외 처리
            System.out.println("잘못된계산"); //잘못된계산 출력
        }
        
        finally {
            System.out.println(n); //0 출력 (무조건실행)
        }
    }
}
```
    
---
### 자바가 제공하는 예외 계층 구조


---
### Exception과 Error의 차이는?
1. Exception
    - 실행시에 발생하는 비정상적인 조건
    - ex) 파일 읽기시 파일이 없음, 0으로 나누기(ArithmeticException)
2. Error
    - 자바 어플리케이션의 동작 환경에서 어떤 문제가 생긴 것
    - ex) 메모리 부족, 운영체제 문제

---
### RuntimeException과 RE가 아닌 것의 차이는?


---
### 커스텀한 예외 만드는 방법
