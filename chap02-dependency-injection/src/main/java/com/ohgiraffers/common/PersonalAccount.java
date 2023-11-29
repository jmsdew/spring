package com.ohgiraffers.common;

public class PersonalAccount implements Account{

    private final int bankCode;
    private final String accNo;
    private int balance;

    public PersonalAccount(int bankCode, String accNo) {
        this.bankCode = bankCode;
        this.accNo = accNo;
    }

    public int getBankCode() {
        return bankCode;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String getBalance() {
        return this.accNo + "계좌의 현재 잔액은 " + this.balance + " 원 입니다.";
    }

    @Override
    public String deposit(int money) {
        String str="";
        if(money>0){
            this.balance += money;
            str = money+" 원이 입금 되었습니다.";
        }else {
            str = "금액이 잘못 입금 되었습니다.";
        }

        return str;
    }

    @Override
    public String withDraw(int money) {

        String str = "";
        if(this.balance>=money){
            this.balance -= money;
            str = money+" 원이 출금 되었습니다.";
        }else {
            str = this.balance+"현재 잔액이 " + money + " 보다 작습니다.";
        }
        return str;
    }

    @Override
    public String toString() {
        return "PersonalAccount{" +
                "bankCode=" + bankCode +
                ", accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}
