package com.javalivestudy.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {

    @Test
    void push() {

    }

    @Test
    void pop() {
        ListNodeStack listNodeStack = new ListNodeStack();
        assertEquals(-1,listNodeStack.pop());
        //스택이 비었을때 pop하면 -1 반환

        listNodeStack.push(1);
        listNodeStack.push(2);
        listNodeStack.push(3);
        listNodeStack.push(4);

        assertEquals(4,listNodeStack.pop()); //pop한 노드의 데이터 반환
        listNodeStack.print(); // 1 2 3 출력
    }

    @Test
    void print() {
        ListNodeStack listNodeStack = new ListNodeStack();
        listNodeStack.push(1);
        listNodeStack.push(2);
        listNodeStack.push(3);
        listNodeStack.push(4);

        listNodeStack.print(); // 1 2 3 4 출력
    }
}