package com.ohgiraffers.level01.basic;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        Calculator test = new Calculator();
        System.out.println("메소드 호출 확인");

        System.out.println("1부터 10까지의 합은 " + test.sum1to10());

        // 메소드로 정의해서 간단하게 바꿀 수 있음
        System.out.println("a 입력: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("b 입력:");
        int b = input.nextInt();

        System.out.println("두 수 중에 큰 수는 " + test.checkMaxNumber(a,b));
        System.out.println(a + "와" + b + "의 합은 : " + test.sumTwoNumber(a, b));
        System.out.println(a + "와" + b + "의 차는 : " + test.minusTwoNumber(a, b));
    }
}
