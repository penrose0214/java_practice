package com.ohgiraffers.practice.statickeyword;

public class FinalFieldTest {

    // non static field에 final 키워드를 사용하는 경우
    // 초기 인스턴스 생성 시 기본 값 0이 필드에 들어가게 되는데
    // 값 변경이 불가능해지므로 선언과 동시에 초기화 해줘야 한다.
    private final int NON_STATIC_COUNT = 1;
    // private final int NON_STATIC_COUNT = 1;

    // 1. 지역변수: 초기화 이후 값 변경 불가
    // 2. 매개변수: 호출 시 전달한 값 변경 불가
    // 3. 인스턴스 변수: 인스턴스 생성 초기화 이후 값 변경 불가
    // 4. 클래스 변수 (static): 프로그램이 시작된 이후에 값 변경 불가
    //=====================================================
    // 5. non-static 메소드: 메소드 재작성 (오버라이딩) 불가
    // 6. static 메소드:
    // 7. 클래스:

}
