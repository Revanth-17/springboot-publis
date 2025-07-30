package com.springboot.maven.publis.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Company {
    private String department;
    private String name;
    private String title;

    @Embedded
    private Address address;
}

