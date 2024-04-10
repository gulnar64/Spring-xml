package aze.coders;

import aze.coders.entity.Account;
import aze.coders.entity.Rate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        //Account account = (Account) applicationContext.getBean("account");
        //Account account = applicationContext.getBean("account", Account.class);
        Account account = applicationContext.getBean ("account", Account.class);
        account.getUser().method();
        System.out.println(account);
    }
}