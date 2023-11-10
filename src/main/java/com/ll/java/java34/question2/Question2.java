package com.ll.java.java34.question2;

import com.ll.java.java40.question1.전사;
import com.ll.java.java40.question1.칼;
import com.ll.java.java40.question1.활;

public class Question2 {
    public static void main(String[] args) {
        전사2 a전사 = new 전사2();
        a전사.이름 = "카니";
        a전사.나이 = 22;
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 22살 전사 카니(이)가 칼(으)로 공격합니다.

        a전사.이름 = "초코";
        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 22살 전사 초코(이)가 활(으)로 공격합니다.
    }
}
