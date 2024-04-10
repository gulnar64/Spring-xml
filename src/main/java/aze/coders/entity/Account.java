package aze.coders.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Data
public class Account {
    private String account;
    //    @Autowired
//    @Qualifier("customer")
    private User user;
    //    @Autowired
    private Currency currency;

//    @Autowired
//    public Account(@Qualifier("customer") User user, Currency currency) {
//        this.user = user;
//        this.currency = currency;
//    }

    @Autowired
    @Qualifier("customer")
    public void setUser(User user) {
        this.user = user;
    }

    @Autowired
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @PostConstruct
    public void startMethod() {
        System.out.println("Start accocunt");
    }

    @PreDestroy
    public void finishMethod() {
        System.out.println("End accocunt");
    }


}
