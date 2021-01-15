package com.javalivestudy.assignment9;

public class assignment9 {
    public static void main(String[] args) {

        int n=0;

        try{
            n = 5/0;
            n = 5;
        }
        catch (Exception e){
            System.out.println("잘못된계산"); //잘못된계산 출력
        }
        finally {
            System.out.println(n); //0 출력 (무조건실행)
        }
    }
}
