package com.ohgiraffers.level01.basic;

import java.util.*;

public class Calculator {

    public void checkMethod(){
        return;
    }
    public int sum1to10(){
        int sum = 0;
        for (int i = 0; i < 10; i++){
            sum += 1;
        }
        return sum;
    }
    public int checkMaxNumber(int a, int b){
        if ((a < b) | (a == b)){
            return b;
        }
        else return a;
    }
    public int sumTwoNumber(int a, int b){
        return a + b;
    }
    public int minusTwoNumber(int a, int b){
        return  Math.abs(a - b);
    }

}
