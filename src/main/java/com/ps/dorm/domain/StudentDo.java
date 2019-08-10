package com.ps.dorm.domain;

import org.springframework.stereotype.Repository;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/10 15:43
 */
@Repository
public class StudentDo {
    private BuidingDo buidingDo;
    private DormDo dormDo;
    private int id;
    private String stuName;
    private int stuSex;
    private int dormId;
    private String love;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public BuidingDo getBuidingDo() {
        return buidingDo;
    }

    public void setBuidingDo(BuidingDo buidingDo) {
        this.buidingDo = buidingDo;
    }

    public DormDo getDormDo() {
        return dormDo;
    }

    public void setDormDo(DormDo dormDo) {
        this.dormDo = dormDo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuSex() {
        return stuSex;
    }

    public void setStuSex(int stuSex) {
        this.stuSex = stuSex;
    }

    public int getDormId() {
        return dormId;
    }

    public void setDormId(int dormId) {
        this.dormId = dormId;
    }

    @Override
    public String toString() {
        return "StudentDo{" +
                "buidingDo=" + buidingDo +
                ", dormDo=" + dormDo +
                ", id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuSex=" + stuSex +
                ", dormId=" + dormId +
                ", love='" + love + '\'' +
                ", count=" + count +
                '}';
    }
}
