package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Hap {
    ArrayList<Integer> arr;
    int size;
    Hap(int n){
        this.size = n;
        arr = new ArrayList<>();
        System.out.println("Enter the elements in heap");
        for(int i = 0; i < this.size; i++){
            Scanner in = new Scanner(System.in);
            int value = in.nextInt();
            arr.add(i, value);
        }
    }
    private void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int max = i;
        if(left < size && this.arr.get(max) < this.arr.get(left)){
            max = left;
        }
        if(right < size && this.arr.get(max) < this.arr.get(right)){
            max = right;
        }
        if(max != i){
            Collections.swap(arr, max, i);
            heapify(max);
        }
    }
    public void buildheap(){
        for (int i = size/2-1; i > -1; i--) {
            heapify(i);
        }
    }
    public int getMax(){
        return arr.get(0);
    }
    public int getLeft(int i){
        int left = 2*i+1;
        if(left >= size){
            return -1;
        }
        return arr.get(left);
    }
    public int getRight(int i){
        int right = 2*i+2;
        if(right >= size){
            return -1;
        }
        return arr.get(right);
    }
    public void insert(int value){
        this.size+=1;
        this.arr.add(value);
        int i = size-1;

        while(i > 0){
            int parent = i/2-1;
            if(parent < size && this.arr.get(parent) < this.arr.get(i)){
                Collections.swap(this.arr, parent, i);
                i = parent;
            }else{
                break;
            }
        }
    }
    public void delete(){
        int last = this.arr.get(size-1);
        this.size-=1;
        this.arr.set(0, last);
        heapify(0);
    }
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(this.arr.get(i)+" ");
        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Hap x = new Hap(6);
        x.buildheap();
	x.insert(110);
        x.delete();
        x.print();
    }
}

