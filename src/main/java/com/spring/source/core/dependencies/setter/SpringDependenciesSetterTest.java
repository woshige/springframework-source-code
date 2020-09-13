package com.spring.source.core.dependencies.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunlichao
 */
public class SpringDependenciesSetterTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-dependencies-setter.xml");
        SimpleMovieLister bean = context.getBean(SimpleMovieLister.class);
        System.out.println(bean.toString());
    }
}
