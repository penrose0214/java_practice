package com.ohgiraffers.practice.classes;

public class ParameterTest {
    // 가변 인자
    // 인자로 전달하는 값의 개수가 정해져 있지 않는 경우 활용된다

    public void testVariableLengthParameter(String ...str){
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
