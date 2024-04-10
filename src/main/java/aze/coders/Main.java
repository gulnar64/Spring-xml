package aze.coders;

import aze.coders.entity.Account;
import aze.coders.config.SpringConfig;
import aze.coders.entity.Currency;
import aze.coders.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
//        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        //Account account = (Account) applicationContext.getBean("account");
//        //Account account = applicationContext.getBean("account", Account.class);
//        applicationContext.registerShutdownHook();
//        Account account1 = applicationContext.getBean ("account", Account.class);
//        Account account2 = applicationContext.getBean ("account", Account.class);
//        account1.getUser().method();
//        System.out.println(account1);
//        System.out.println(account2);
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Account account = applicationContext.getBean ("account", Account.class);
        account.setAccount("AZE1545115");
        account.getCurrency().setCode("AZN");
        System.out.println(account);
        applicationContext.registerShutdownHook();
    }
}