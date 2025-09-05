package com.ohgiraffers.ps.basic.stackqueue;

// import all java APIs
import java.util.*;

public class p1 {
    public int[] solution(int []arr) {

        // stack array 선언 및 초기화
        int x = 0;
        int index = 0;

        // 입력 받은 array를 순회하면서...
        for (int i = 0; i < arr.length; i++){

            // stack의 top과 연속해서 중복되는 원소인지 확인
            if (x != arr[i]){
                x = arr[i];
                arr[index] = arr[i];
                index++;
            }
            // 예외 처리
            else if (x == 0 && index == 0) {
                arr[index] = x;
                index++;
            }
        }
        // resize the original array
        int[] answer = Arrays.copyOf(arr, index);

        // int array형 출력 가능
        return answer;
    }
}
