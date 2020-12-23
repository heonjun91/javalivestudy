package com.javalivestudy.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void add() {
        ListNode head = new ListNode(0,null);
        LinkedList list = new LinkedList(head);

        ListNode newNode = new ListNode(1,null);

        //position이 size보다 클경우 null 반환 (추가 실패)
        assertNull(list.add(head,newNode,0));

        //추가 성공시 추가한 노드 반환
        assertEquals(newNode,list.add(head,newNode,1));
    }

    @Test
    void remove() {
        ListNode head = new ListNode(0,null);
        LinkedList list = new LinkedList(head);

        //position : head -> 1 -> 2-> 3-> 4-> 5 세팅
        //data     : head -> 10->20->30->40->50 세팅
        for(int i=0; i<5; i++){
            ListNode newNode = new ListNode((i+1)*10, null);
            list.add(head,newNode,i+1);
        }

        //position 2 인 노드를 삭제, 삭제된 노드의 데이터값(20)이 맞는지 확인
        assertEquals(20,list.remove(head,2).getData());

        //new position : head -> 1 -> 2-> 3-> 4-> 5 세팅
        //new data     : head -> 10->30->40->50->null 세팅


        //삭제실패 (position>0) , null반환
        assertNull(list.remove(head,0));

        //삭제실패 (하나가 삭제됐으므로 position 5엔 해당노드가 없음)
        assertNull(list.remove(head,5));
    }

    @Test 
    void contains() {
        // todo...
    }
}