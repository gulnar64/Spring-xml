package aze.coders.entity;

import org.springframework.stereotype.Component;

@Component
public class Employer implements User{
    public void method() {
        System.out.println("Employer");
    }
}
