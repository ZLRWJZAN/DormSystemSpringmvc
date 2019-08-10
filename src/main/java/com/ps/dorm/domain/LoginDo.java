package com.ps.dorm.domain;

import org.springframework.stereotype.Repository;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/13 11:00
 */
@Repository
public class LoginDo {
    private String number;
    private String password;
    private String code;
    private String mailCode;
    private String input;

    public LoginDo(){

    }

    public LoginDo(String number, String password, String code, String mailCode, String input) {
        this.number = number;
        this.password = password;
        this.code = code;
        this.mailCode = mailCode;
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMailCode() {
        return mailCode;
    }

    public void setMailCode(String mailCode) {
        this.mailCode = mailCode;
    }

    @Override
    public String toString() {
        return "LoginDo{" +
                "number='" + number + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                ", mailCode='" + mailCode + '\'' +
                ", input='" + input + '\'' +
                '}';
    }
}
