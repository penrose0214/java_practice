package com.ohgiraffers.practice.polymorphism01;

public class Tiger extends Animal {
    // Animal 클래스를 상속하여 호랑이가 override
    public void cry(){
        System.out.println("호랑이가 울음소리를 냅니다. 어흥!");
    }

    public void bite() {
        System.out.println("호랑이가 물어뜯습니다~ 앙");
    }


}

