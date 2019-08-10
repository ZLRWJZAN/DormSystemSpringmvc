package com.ps.dorm.domain;

import org.springframework.stereotype.Repository;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/10 15:41
 */
@Repository
public class DormDo {
    private BuidingDo buidingDo;
    private int id;
    private int number;
    private String buidName;
    private int currentPeople;
    private int maxPeople;


    public BuidingDo getBuidingDo() {
        return buidingDo;
    }

    public void setBuidingDo(BuidingDo buidingDo) {
        this.buidingDo = buidingDo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBuidName() {
        return buidName;
    }

    public void setBuidName(String buidName) {
        this.buidName = buidName;
    }

    public int getCurrentPeople() {
        return currentPeople;
    }

    public void setCurrentPeople(int currentPeople) {
        this.currentPeople = currentPeople;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    @Override
    public String toString() {
        return "DormDo{" +
                "buidingDo=" + buidingDo +
                ", id=" + id +
                ", number=" + number +
                ", buidName='" + buidName + '\'' +
                ", currentPeople=" + currentPeople +
                ", maxPeople=" + maxPeople +
                '}';
    }
}
