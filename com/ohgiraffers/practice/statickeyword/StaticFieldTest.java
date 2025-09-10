package com.ohgiraffers.practice.statickeyword;

public class StaticFieldTest {
    private int nonStaticCount; // instance var
    private static int staticCount; // static var

    public void increaseNonStaticCount(){
        // statickeywor의 주소 값을 통해 접근
        this.nonStaticCount++;
    }

    public void increaseStaticCount(){
        // 아래는 오류 발생: static 멤버 변수는 이 클래스의 인스턴스 주소값을 통해서 접근하지 않음
        // compile error 는 발생하지 않지만, warning으로 뜸
        this.staticCount++;

        // 옯바른 방식
        // 클래스의 명을 사용해서 접근 -> 따라서 클래스 변수라고도 함
        StaticFieldTest.staticCount++;
    }

    public int getnonstaticCount(){
        return nonStaticCount;
    }

    public static int getStaticCount(){
        return staticCount;
    }

    // 오류 발생
    // instance 변수는 객체가 생성된느 시점에 생성
    // static은 먼저 static 공간에 (객체가 생성되기 이전 시점에) 생성되기 때문에 오류 발생
    /*
    public static int getStaticCount3(){
        return this.staticCount;
    }
    */
}
