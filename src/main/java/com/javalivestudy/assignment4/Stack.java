package com.javalivestudy.assignment4;

public class Stack {

    private int[] arr;
    private int size;
    private int top;

    public Stack(int size) {
        arr = new int[size];
        this.size = size;
        top = 0;
    }

    public void push(int data){
        if(top<size){
            arr[top] = data;
            top++;
        }
        else {
            System.out.println("error : 스택 사이즈 초과");
        }
    }

    public int pop(){
        if(top==0){
            System.out.println("error : 스택에 데이터 없음");
            return -1;
        }
        else {
            top--;
            return arr[top];
        }
    }

    public void printStack(){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
