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
    }

    @Test
    void contains() {
    }
}