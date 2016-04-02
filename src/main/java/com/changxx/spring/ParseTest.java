package com.changxx.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ParseTest
 *
 * @author changxiangxiang
 * @date 16/4/2
 */
public class ParseTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        Student p = (Student) ctx.getBean("12");
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }

}
