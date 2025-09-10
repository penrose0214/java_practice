package com.ohgiraffers.ps.basic.greedy;


import java.util.Scanner;

public class safeboat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of people: ");
        int num = scanner.nextInt();
        System.out.println("weight list : ");
        int[] weight =  new int[num];
        System.out.println("limit : ");
        int limit = scanner.nextInt();


    }


    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;

            // total people number as count
            int peopleCount = people.length;
            int[] newPeople = new int[people.length];
            boolean[] visited = new boolean[people.length];

            int minWeight = 240;
            int minWeightPos = 0;
            int remainingLimit = limit;

            // for every while loop,
            while (peopleCount != 0){
                // for every for loop,
                for (int i = 0; i < people.length; i++){
                    if (visited[i] == true){
                        continue;
                    }
                    else if (minWeight >= people[i]) {
                        // store minimum weight and its position within the array
                        minWeight = people[i];
                        minWeightPos = i;
                    }
                }

                // if remainingLimit is negative count, do the following...
                // 1. set remainingLimit to limit - minWeight (supposed that limit is always > limit)
                // 2. answerCount++
                if (remainingLimit < minWeight){
                    remainingLimit = limit - minWeight;
                    answer++;
                    if (peopleCount == 1){
                        answer++;
                    }
                }
                else if (remainingLimit == minWeight){
                    remainingLimit = limit;
                    answer++;
                }
                else {
                    remainingLimit -= minWeight;
                }
                // initialization
                peopleCount--;
                visited[minWeightPos] = true;
                minWeight = 240;
            }
            return answer;
        }
    }
}