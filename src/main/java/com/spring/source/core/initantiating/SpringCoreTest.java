package com.spring.source.core.initantiating;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunlichao
 */
public class SpringCoreTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-core.xml");
        context.getBean(JpaAccountDao.class);
    }
}
