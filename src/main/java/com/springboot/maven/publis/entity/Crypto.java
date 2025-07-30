package com.springboot.maven.publis.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Crypto {
    private String coin;
    private String wallet;
    private String network;
}
