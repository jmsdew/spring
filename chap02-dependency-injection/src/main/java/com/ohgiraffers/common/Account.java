package com.ohgiraffers.common;

public interface Account {   // 계좌에 들어가야 할 내용을 인터페이스로 넣어주고 상속받아 개인 계좌로 구현함

    String getBalance();   // 잔액
    String deposit(int money);  // 입금
    String withDraw(int money);  // 출금

}
