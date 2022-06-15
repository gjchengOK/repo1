package com.guo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@ToString
@AllArgsConstructor
//@Component
//@ConfigurationProperties(prefix = "pet")
public class Pet {
    @Value("${pet.name}")
    private String name;
    public  Pet(){
    }

}
