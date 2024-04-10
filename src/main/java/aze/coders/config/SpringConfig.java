package aze.coders.config;

import aze.coders.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("aze.coders.entity")
public class SpringConfig {
//    @Bean("account")
//    @Scope("prototype")
//    public Account getAccount(@Qualifier("customer") User user, Currency currency) {
//        Account account = new Account(user, currency);
//        account.setAccount("AZE1763134");
//        return account;
//    }


//    @Bean("currency)
//    public Currency getCurrency() {
//        Currency currency = new Currency(15, "AZN");
//        currency.setName("Azerbaycan manati");
//        Map<String, Rate> rates = new HashMap<>();
//        rates.put("AZN", getRate06042024());
//        rates.put("AZN", getRate07042024());
//        currency.setRates(rates);
//        return currency;
//    }

//    @Bean
//    public Rate getRate06042024() {
//        Rate rate = new Rate("06.04.2024");
//        rate.setRate(1.7025);
//        return rate;
//    }
//
//    @Bean
//    public Rate getRate07042024() {
//        Rate rate = new Rate("07.04.2024");
//        rate.setRate(1.70);
//        return rate;
//    }
//
//    @Bean
//    public User getCustomer() {
//        return new Customer();
//    }
//
//    @Bean
//    public User getEmployer() {
//        return new Employer();
//    }
}
