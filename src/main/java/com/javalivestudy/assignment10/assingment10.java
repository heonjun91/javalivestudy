package com.javalivestudy.assignment10;

public class assingment10 {
    public static void main(String[] args) {
        //Thread Class로 쓰레드 구현
        ThreadClass t1 = new ThreadClass();

        //Runnable Interface로 쓰레드 구현
        Runnable r = new RunnableInterface();
        Thread t2 = new Thread(r);

        //쓰레드 1 실행
        t1.start();

        //쓰레드 2 실행
        t2.start();
    }
}

class ThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Class 사용");
    }
}

class RunnableInterface implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable Interface 사용");
    }
}
