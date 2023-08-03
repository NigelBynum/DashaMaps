package com.github.zipcodewilmington.MyLinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNodeTest {

    @Test
    void setNextTest() {
        //Given
        MyNode node1 = new MyNode("Nigel", 1);
        MyNode node2 = new MyNode("Lee", 3);

        //When & //Then
        Assert.assertEquals(node1, node2);
    }

    @Test
    void EqualTest() {
        //Given
        MyNode node1 = new MyNode("Nigel", 10);
        MyNode node2 = new MyNode("Nigel", 10);

        //When & //Then
        Assert.assertEquals(node1, node2);
    }

    @Test
    void addTest() {
        //Given
        MyLinkedList mll = new MyLinkedList("Yoda");
        String expectedKey = "Joe";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);
        //When
        mll.add(expectedKey,expectedValue);
        MyNode actual = mll.getHead().getNext();

        //When & //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    void SizeTest() {
        //Given
        MyLinkedList mll = new MyLinkedList("Yoda");
        int expected = 2;
       mll.add("joe", 6);
        //When
       int actual = mll.size();

        //When & //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    void getTest() {
        //Given
        MyLinkedList mll = new MyLinkedList("Yoda");
        String expectedKey = "Joe";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);
        //When
        mll.add(expectedKey,expectedValue);
        MyNode actual = mll.get(expectedKey);

        //When & //Then
        Assert.assertEquals(expected, actual);
    }
}