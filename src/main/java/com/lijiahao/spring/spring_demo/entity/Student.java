package com.lijiahao.spring.spring_demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Integer stuID;
    private String stuName;
    private String stuPhone;
    private String stuAddress;

    public void setStuID(Integer stuID) {
        this.stuID = stuID;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public Integer getStuID() {
        return stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public String getStuAddress() {
        return stuAddress;
    }
}
