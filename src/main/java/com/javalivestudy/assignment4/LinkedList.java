package com.javalivestudy.assignment4;

import javax.swing.text.Position;

public class LinkedList {

    private ListNode head;

    public LinkedList(ListNode head) {
        this.head = head;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position){
        ListNode tempNode= head;

        if(position<1){
            //추가실패
            System.out.println("position은 0보다 커야함");
            return null;
        }

        for(int i=0; i<position; i++){
            if(tempNode.getNextNode()==null){ // position > size 이면 제일 뒤로 추가
                break;
            }
            tempNode = tempNode.getNextNode();
        }

        nodeToAdd.setNextNode(tempNode.getNextNode());
        tempNode.setNextNode(nodeToAdd);

        return nodeToAdd;
    }

    public ListNode remove(ListNode head, int positionToRemove){
        ListNode nodeToRemove = head;
        ListNode prevNode = null;

        if(positionToRemove <1){
            //삭제실패
            System.out.println("position은 0보다 커야함");
            return null;
        }

        for(int i=0; i<positionToRemove; i++){
            if(nodeToRemove.getNextNode()==null){
                //삭제실패
                System.out.println("해당 위치에 삭제할 노드가 없음");
                return null;
            }
            prevNode = nodeToRemove;
            nodeToRemove = nodeToRemove.getNextNode();
        }

        prevNode.setNextNode(nodeToRemove.getNextNode());

        return nodeToRemove;
    }

    public boolean contains(ListNode head, ListNode nodeTocheck){
        ListNode tempNode = head;

        while(true){
            if(tempNode.equals(nodeTocheck)) {
                return true;
            }
            else{
                if(tempNode.getNextNode()==null){
                    return false;
                }
                tempNode = tempNode.getNextNode();
            }
        }
    }

}
