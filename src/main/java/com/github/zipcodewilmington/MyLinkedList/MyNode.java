package com.github.zipcodewilmington.MyLinkedList;
import java.util.Objects;
public class MyNode {
    MyPair data;
    MyNode next;

    public MyNode(String key, Integer value) {
        data = new MyPair(key,value);
        next = null;
    }

    public MyPair getData() {
        return data;
    }

    public void setData(MyPair data) {
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
