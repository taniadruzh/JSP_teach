package com.annotation.demo;

import org.springframework.stereotype.Component;

@Component
public class FortuneSrviceImpl implements FortuneService {

    @Override
    public String getFortune() {
        return " you have a big fortune";
    }
}
