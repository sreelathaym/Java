package com.java.core.collections;

import java.util.ArrayList;
import java.util.List;

public class RingBuffer {
    private List<Integer> buffer;
    private final int capacity;
    private int head;
    private int tail;
    private boolean isFull=false;

    public RingBuffer(int capacity) {
        this.capacity = capacity;
        this.head=0;
        this.tail=0;
        this.buffer=new ArrayList<>(capacity);

        for(int i=0;i< capacity;i++){
            buffer.add(null);
        }
    }
    //add element to the buffer
    public void add(int element){
        this.buffer.set(tail,element);
        tail=(tail+1)%capacity;
        if(isFull){
            head= (head+1)%capacity;
        }
        if(head == tail){
            isFull=true;
        }
    }

    //poll element from the buffer
    public Integer poll(){
        if(isEmpty()){
        return null;
    }
        int polledElement= buffer.get(head);
        buffer.set(head,null);
        head=(head+1)%capacity;
        isFull=false;
        return polledElement;
    }

    private boolean isEmpty() { return (!isFull && head==tail);}
    public void printBuffer(){
        System.out.println("Biffer: [");
        for(int i=0;i<capacity;i++){
            System.out.println(buffer.get(i)+" ");
            if(i<capacity -1){
                System.out.println(" ");
            }else {
                System.out.println("]");
            }

        }
    }

    public static void main(String[] args) {
        RingBuffer ringBuffer=new RingBuffer(5);
        ringBuffer.poll();
        ringBuffer.add(10);
        ringBuffer.add(20);
        ringBuffer.add(30);
        ringBuffer.add(40);
        ringBuffer.add(50);
        ringBuffer.printBuffer();
        ringBuffer.add(60);
        ringBuffer.add(70);
        ringBuffer.printBuffer();
        ringBuffer.poll();
        ringBuffer.poll();
        ringBuffer.poll();
        ringBuffer.poll();
        ringBuffer.poll();
        ringBuffer.printBuffer();






    }

}
