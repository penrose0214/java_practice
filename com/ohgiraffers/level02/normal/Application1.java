package com.ohgiraffers.level02.normal;

public class Application1 {
    public static void main(String[] args) {

        /* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */

        // 국어 점수
         double Korean = 80.5;

        // 수학 점수
        double math = 50.6;

        // 영어 점수
        double english = 70.8;

        // 총점
        double sum = Korean + math + english;

        // 총점과 평균 출력
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + (sum) / 3);



    }
}
