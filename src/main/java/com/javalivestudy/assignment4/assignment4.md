# 자바 제어문


#### 학습할 것

[1. 선택문](#선택문)

[2. 조건문](#조건문)

[3. 반복문](#반복문)

---

### 선택문
변수에 일치하는 경우의 값에 따라 실행문을 제어
```java
switch(score){
    
    case "A" : //score 값이 "A" 이면
        sout("학점 최우수");
        break; //break가 없을 경우 모든 경우를 출력해버림
        
    case "B" : 
    case "C" :   
        sout("학점 보통"); //score 값이 "B"나 "C" 이면 출력
        break;
        
    case "F" :
        sout("학점 저조");
        break;
        
    default :    
}

```

---
### 조건문
조건식의 값이 참인지 거짓인지에 따라 실행문을 제어
```java
if(score>=90)      //90점 이상이면 A
    sout("A"); 
else if(score>=80) //90미만이고 80점이상이면 B
    sout("B");
else               //그렇지않으면(80미만이면) F
    sout("F");
```




---
### 반복문
특정 실행문을 여러번 반복실행 할 수 있도록 제어
```java
for(int i=0; i<3; i++){ //i가 0부터 시작하여
            // 3미만일때까지 1씩 증가시키면서 반복실행
    sout(i); // 0 , 1 , 2 출력
}
//위와 같은 반복문
int i= 0;
while(i<3){
    sout(i);
    i++;
}
```
```java
//향상된 for문
int[] Arr= new int[]{ 1,2,3 };
for(int i: Arr) //배열 크기만큼 반복하여 항목을 순서대로 출력
    sout(i); // 1 , 2 , 3 출력
```

```java
//무한 반복
for(;;){}
while(true){}
```

```java

for(int i=0; i<3; i++){ 
    for(int j=0; j<3; j++){ 
        if (j == 1){ 
            break;  // 가장 가까운 반복문 종료
        } 
    } 
}
```

```java
Loop1 :
for(int i=0; i<3; i++){
    for(int j=0;j<3;j++){
        if(j==1){
            break Loop1; //Loop1 반복문 종료
        }
    }
}
```

```java
for(int i=0; i<10; i++){ 
    if(i==2){ 
        continue;  // 밑에 구문을 실행하지 않고 다음 반복(i=3)으로 넘어감
    } 
    System.out.println(i);  //0,1,3,4,5,6,7,8,9 출력
}
```