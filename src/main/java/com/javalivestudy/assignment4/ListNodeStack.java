package com.javalivestudy.assignment4;

public class ListNodeStack {

    private ListNode head;
    private ListNode top;

    public ListNodeStack() {
        head = new ListNode(0,null);
        top = head;
    }


    public void push(int data){
        ListNode newNode = new ListNode(data, null);

        top.setNextNode(newNode);
        top = newNode;
    }

    public int pop(){
        ListNode tempNode = head;
        if(top==head){
            System.out.println("스택이 비어있음");
            return -1;
        }
        while(tempNode.getNextNode()!=top)
        {
            tempNode = tempNode.getNextNode();
        }
        ListNode popedNode = top;
        top = tempNode;
        top.setNextNode(null);

        return popedNode.getData();
    }

    public void print(){
        ListNode tempNode = head;
        while(tempNode.getNextNode()!=null){
            System.out.println(tempNode.getNextNode().getData());
            tempNode = tempNode.getNextNode();
        }
    }
}
