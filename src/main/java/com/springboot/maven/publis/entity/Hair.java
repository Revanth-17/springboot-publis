package com.springboot.maven.publis.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Hair {
    private String color;
    private String type;
}

