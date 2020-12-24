package com.javalivestudy.assignment4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack = new Stack(3);

    @Test
    void push() {
        stack.push(1);
        stack.printStack();
        stack.push(2);
        stack.printStack();
        stack.push(3);
        stack.printStack(); //3까지 push OK
        stack.push(4); //스택 사이즈 초과시
        stack.printStack(); //dont push
    }

    @Test
    void pop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3,stack.pop()); //pop()시 pop한 값 3을 반환


    }


}