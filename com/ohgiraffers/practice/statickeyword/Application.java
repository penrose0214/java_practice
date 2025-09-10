package com.ohgiraffers.practice.statickeyword;

public class Application {
    public static void main(String[] args) {
        StaticFieldTest sft1 = new StaticFieldTest();
        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();
        System.out.println(sft1.getnonstaticCount());

        // public static으로 getStaticCount()로 선언하지 않으면 안됨
        System.out.println(StaticFieldTest.getStaticCount());
    }
}
