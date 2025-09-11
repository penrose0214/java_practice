package com.ohgiraffers.level01.basic.student.model.dto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO[] student = new StudentDTO[10];

        int count = 0;
        double average = 0;

        Scanner input = new Scanner(System.in);

        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        while (true){
            student[count] = new StudentDTO();
            System.out.println("학년 :" );
            student[count].grade = input.nextInt();

            System.out.println("반 : ");
            student[count].name = input.next();

            System.out.println("이름 :");
            student[count].name = input.next();

            System.out.println("국어 점수 : ");
            student[count].kor = input.nextInt();

            System.out.println("영어 점수 : ");
            student[count].eng = input.nextInt();

            System.out.println("수학 점수 : ");
            student[count].math = input.nextInt();

            // 한 명씩 추가 될 때마다 카운트함
            count++;

            // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
            System.out.println("계속 추가할 겁니까? (y/n) : ");
            if (input.next().charAt(0) == 'n'){
                break;
            }
        }

        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        for (int i = 0; i < student.length; i++) {
            average = ((double)student[i].kor + (double)student[i].eng + (double)student[i].math) / 3;
            System.out.println(student[i].getInformation() + " 평균=" + average);
        }
    }
}
