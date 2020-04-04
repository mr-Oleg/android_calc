package com.example.lab1_mobile;

import java.util.ArrayList;
import java.util.List;

class ConsumtionStack {
    private int size;
    private String[] stackArray;
    private int top;

    public ConsumtionStack(int size) {
        this.size = size;
        stackArray = new String[size];
        top = -1;
    }

    public void push(String element) {
        stackArray[++top] = element;
    }

    public String pop() {
        return stackArray[top--];
    }

    public String peek() {
        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public boolean isContain(String val){
        int counter = top;
        while(counter>=0){
            if(stackArray[counter].equals(val)){
                return true;
            }
            counter--;
        }
        return false;
    }

    public List<String> getAll(){
        List<String> strings = new ArrayList<>();
        int counter = top;
        while(counter>=0){
            strings.add(stackArray[counter]);
            counter--;
        }
        return strings;
    }
}
