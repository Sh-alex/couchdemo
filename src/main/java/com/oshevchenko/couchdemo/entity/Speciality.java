package com.oshevchenko.couchdemo.entity;

import com.couchbase.client.java.repository.annotation.Field;

public class Speciality {

    @Field
    private String code;

    @Field
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
