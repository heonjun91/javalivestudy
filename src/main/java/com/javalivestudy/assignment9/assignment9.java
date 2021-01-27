package com.javalivestudy.assignment9;

public class assignment9 {
    public static void main(String[] args) {

        System.out.println(1); //정상 실행
        int[] number = {1,2,3};

        try {
            System.out.println(number[3]); //예외발생 -> catch구문으로 이동
            System.out.println(number[1]/0); //실행되지않음
        } catch (ArrayIndexOutOfBoundsException e){//자식먼저
            System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage()); //어떤에런지 메시지
            //e.printStackTrace(); //에러 정보 전달
        } catch (ArithmeticException e) {//자식
            System.out.println("ArithmeticException");
        } catch (Exception e){ //부모
            System.out.println("Exception");
        }
        finally {
            System.out.println(3); //무조건 실행
        }


    }
}
