package com.ohgiraffers.practice.classes;

// 객체 배열 실습
public class Car {
    String carName;
    int speed;

    public Car(String carName, int speed) {
        this.carName = carName;
        this.speed = speed;
    }

    public void driveMaxSpeed(){
        System.out.println("Car name: " + this.carName + ", " + "Drive Max Speed : " + this.speed);
    }
}
