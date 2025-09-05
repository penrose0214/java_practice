package com.ohgiraffers.level02.normal;

import java.util.*;
import java.lang.*;

public class RandomMaker {
    public static int randomNumber(int min, int max){
        Random random = new Random();
        return (random.nextInt((max - min) + 1) + min);
    }
    public static String randomUpperAlphabet(int length){

        String result = "";
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int rand = (random.nextInt(26) + 97);
            result += Character.toString(rand);
        }
        return result;
    }
    public static String rockPaperScissors(){
        double randomdouble = Math.random();
        int k = (int)(randomdouble * 100) % 3;

        if (k == 0){
            return "가위";
        }
        else if (k == 1){
            return "바위";
        }
        else return "보";
    }

    public static String tossCoin(){
        double randomdouble = Math.random();
        int k = (int)(randomdouble * 100) % 2;

        if (k == 0){
            return "앞면";
        }
        else return "뒷면";
    }
}
