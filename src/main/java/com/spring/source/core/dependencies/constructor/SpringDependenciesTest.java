package com.spring.source.core.dependencies.constructor;

import com.spring.source.core.dependencies.constructor.ExampleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunlichao
 */
public class SpringDependenciesTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-dependencies.xml");
        ExampleBean bean = context.getBean(ExampleBean.class);
        System.out.println(bean.toString());
    }
}
