package com.ohgiraffers.practice.classes;

public class Main {

    public static void main(String[] args) {
        MemberDTO member1 = new MemberDTO();
        member1.setNumber(1);
        member1.setName("John");
        member1.setAge(25);
        member1.setHeight(180.4);
        member1.setWeight(82.5);
        member1.setIsActivated(true);

        System.out.println("회원번호 : " + member1.getNumber());
        System.out.println("회원명 : " + member1.getName());
        System.out.println("나이 : " + member1.getAge());
        System.out.println("성별 : " + member1.getGender());
        System.out.println("키 : " + member1.getHeight());
        System.out.println("몸무게 : " + member1.getWeight());
        System.out.println("회원활성화상태 : " + member1.getActivated());

        // 객체 배열 실습
        Car[] carArray = new Car[3];
        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("부가티", 450);
        carArray[2] = new Car("람보르기니", 600);

        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }

        System.out.println(" ");

        // 가변인자 테스트
        ParameterTest parameter = new ParameterTest();
        parameter.testVariableLengthParameter();
        parameter.testVariableLengthParameter("coding");
        parameter.testVariableLengthParameter("coding", "baseball");
        parameter.testVariableLengthParameter(new String[] {"coding", "baseball"});
    }
}
