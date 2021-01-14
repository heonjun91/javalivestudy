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
    - 일반예외 : 컴파일 시점에 발생하는 예외
    - 실행예외 : 프로그램 실행시에 발생하는 예외   
    
    
2. 예외 처리 방법
    1. try..catch..finally
        - try : 실제 코드가 들어가는 곳(예외가 발생할 가능성이 있는 코드)
        - catch : 예외 발생 시 처리할 코드
        - finally : 예외처리와 상관없이 무조건 수행되는 코드
        - 실행순서
            + 예외 발생 : try -> catch -> finally
            + 예외 미발생 : try -> finally
    ```java
    

    ```
    2. throws
    3. throw
    
---
### 자바가 제공하는 예외 계층 구조


---
### Exception과 Error의 차이는?


---
### RuntimeException과 RE가 아닌 것의 차이는?


---
### 커스텀한 예외 만드는 방법
