# 자바 패키지


#### 학습할 것

[1. package 키워드](#package-키워드)

[2. import 키워드](#import-키워드)

[3. 클래스패스](#클래스패스)

[4. CLASSPATH 환경변수](#CLASSPATH-환경변수)

[5. -classpath 옵션](#-classpath-옵션)

[6. 접근지시자](#접근지시자)

---
### package 키워드
1. package 란?
   - 비슷한 성격의 자바 클래스들을 모아 넣는 자바의 디렉토리
   - 패키지 클래스를 사용하기 위해서는 import 키워드 사용
```java
package assignment7.number;

public class NumberOne {
}
```
```java
package assignment7.number;

public class NumberTwo {
}
```
2. 패키지의 장점
   - 클래스의 분류가 용이함
   - 패키지가 다르다면 동일한 클래스명 사용가능
   
3. 패키지 명명규칙
   - 영어 소문자
   - 예약어 사용불가
   - java.~  : 자바 기본 패키지
   - javax.~ : 자바 확장 패키지
   - org.~   : 비영리단체(오픈소스) 패키지
   - com.~   : 영리단체(회사) 패키지
   
---
### import 키워드
1. import 란?
   - 다른 패키지의 클래스를 사용하기 위한 키워드
   
```java
import assignment7.number.NumberOne; //number패키지의 NumberOne 클래스만
import assignment7.number.*; //number패키지의 클래스 전부
```

2. static import
```java
import static java.lang.Math.abs;

int i = abs(-3);  //Math.abs(-3); //클래스명없이 바로사용
```

---
### 클래스패스
1. 클래스패스란?
   - JVM이 프로그램을 실행할 때, 클래스파일을 찾는 데 기준이 되는 파일 경로
   - .java 파일을 컴파일하면 .class 파일(바이트코드)로 변환
   - .class파일의 명령을 실행하기위해서 .class파일을 찾을때 classpath에 지정된 경로를 사용

2. 클래스패스를 지정하는 방법
   - CLASSPATH 환경변수를 사용
   - -classpath 옵션을 사용

---
### CLASSPATH 환경변수
- 윈도우 시스템 변수 설정을 통해 지정
- JVM이 시작될 때 해당 디렉토리가 호출되면 클래스들을 JVM에 로드

---
### -classpath 옵션
- 컴파일시 파일 경로를 지정해주는 옵션
```
javac -classpath(cp) path(파일 절대 경로):
```

---
### 접근지시자 
5주차 참고
