package com.ps.dorm.domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;


/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/10 15:37
 */
@Repository
public class BuidingDo {
    @NotNull(message = "ID不能为空")
    private Integer id;

    @Length(min=1,max=3, message="姓名长度不对啊,小老弟")
    @NotNull(message = "姓名不能为空")
    private String buidName;

    @Length(min=1,max=3,message="地址长度不对啊,小老弟")
    private String address;

    @NotNull(message = "性别不能为空")
    private Integer buidSex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuidName() {
        return buidName;
    }

    public void setBuidName(String buidName) {
        this.buidName = buidName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBuidSex() {
        return buidSex;
    }

    public void setBuidSex(int buidSex) {
        this.buidSex = buidSex;
    }

    @Override
    public String toString() {
        return "BuidingDo{" +
                "id=" + id +
                ", buidName='" + buidName + '\'' +
                ", address='" + address + '\'' +
                ", buidSex=" + buidSex +
                '}';
    }
}
