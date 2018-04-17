package com.oshevchenko.couchdemo.entity;

import com.couchbase.client.java.repository.annotation.Field;
import org.hibernate.validator.constraints.Range;

public class Subject {

    @Field
    private String name;

    @Field
    @Range(min=1, max=5)
    private Integer mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
