package com.ohgiraffers.level04.advanced;


import java.util.Scanner;

public class Application2 {
    /* 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서
     * 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
     *
     * A를 3만큼 밀면 D가 되고, z를 1만큼 밀면 a가 됩니다.
     * 또한 공백문자는 변경되지 않습니다.
     *
     * 문자열 1개를 입력 받고, 얼마나 문자를 밀지 알려주는 0보다 큰 정수를 1개 입력 받아
     * 암호문을 작성하는 프로그램을 만들어보세요
     * 단, 숫자가 27인 경우는 1칸을 밀게 됩니다. (알파벳은 26글자 이기 때문)
     *
     * -- 입력 예시 --
     * 문자열을 입력하세요 : a B z
     * 숫자를 입력하세요 : 4
     *
     * -- 출력 예시 --
     * e F d
     *
     * -- 입력 예시 --
     * 문자열을 입력하세요 : a B z
     * 숫자를 입력하세요 : 27
     *
     * -- 출력 예시 --
     * b C a
     * */
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("문자열을 입력하세요 : ");
            String input = scanner.nextLine();
            System.out.println("숫자를 입력하세요 : ");
            int x = scanner.nextInt() % 26;
            int tmp = 0;
            String result = "";

            for (int i = 0; i < input.length(); i++) {
                // 공백 건너뛰기
                if (input.charAt(i) == ' ') {
                    result += ' ';
                } else {
                    tmp = (int) input.charAt(i) + x;
                    if (tmp > 122) {
                        tmp = tmp - 122 + 96;
                    } else if (tmp > 90 && tmp < 97) {
                        tmp = tmp - 90 + 41;
                    }
                    result += (char) tmp;
                }
            }
            System.out.println(result);
        }
    }
}
