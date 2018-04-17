package com.oshevchenko.couchdemo.entity;

import com.couchbase.client.java.repository.annotation.Field;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;
import org.springframework.lang.Nullable;

import javax.validation.Valid;
import java.util.List;

@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    @Id
    @Field
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private String id;
    
    @Field
    private String type = "user";

    @Field
    private String name;

    @Field
    @Nullable
    private String surname;

    @Field
    @Nullable
    private String patronymic;

    @Field
    @Nullable
    private String sex;

    @Field
    private Speciality speciality;

    @Field
    private String role;

    @Field
    @Valid
    private List<Subject> subjects;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
