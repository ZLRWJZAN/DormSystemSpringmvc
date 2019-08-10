package com.ps.dorm.domain;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/17 10:28
 */
@Repository
public class ResultDo<T> implements Serializable {
    private T body;
    private int code=200;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
