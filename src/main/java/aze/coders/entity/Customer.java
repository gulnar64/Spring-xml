package aze.coders.entity;

import org.springframework.stereotype.Component;

@Component
public class Customer implements User {
    @Override
    public void method() {
        System.out.println("Customer");
    }
}
