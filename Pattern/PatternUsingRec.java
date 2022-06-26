package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
/*
triangle1

* * * * *
* * * *
* * *
* *
*

triangle2

*
* *
* * *
* * * *

 */
public class Try {
    public static void main(String[] args){
        triangle2(4,0);
    }
    public static void triangle1(int i , int j){
        if(i == 0) return;
        if(j >= i){
            System.out.println();
            triangle1(i-1,0);
            return;
        }else {
            System.out.print("*" + " ");
            triangle1(i, j + 1);
        }
    }
    public static void triangle2(int i , int j){
        if(i <= 0 ){
            return;
        }
        if(j<i){
            triangle2(i,j+1);
            System.out.print("*"+" ");
        }else {
            triangle2(i-1,0);
            System.out.println();
        }
    }


}

