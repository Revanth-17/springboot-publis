package com.springboot.maven.publis.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Address {
    private String address;
    private String city;
    private String state;
    private String stateCode;
    private String postalCode;

    @Embedded
    private Coordinates coordinates;

    private String country;
}
