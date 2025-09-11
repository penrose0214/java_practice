package com.ohgiraffers.level01.basic.student.model.dto;

public class StudentDTO {
    int grade;
    int classroom;
    String name;
    int kor;
    int eng;
    int math;

    // 아래의 기본 생성자는 묵시적으로 생성할 수도 있고, 아래와 같이 주석 처리를 할 수도 있다.
    public StudentDTO() {
    }

    public String getInformation(){

        return ("학년=" + grade + " 반=" + classroom + " 이름=" + name
                        + " 국어=" + kor + " 영어=" + eng + " 수학=" + math);
    }
}
