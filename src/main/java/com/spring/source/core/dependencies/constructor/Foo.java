package com.spring.source.core.dependencies.constructor;

import com.spring.source.core.dependencies.constructor.Bar;
import com.spring.source.core.dependencies.constructor.Biz;

/**
 * @author sunlichao
 * the construtor arguments resolution
 */
public class Foo {

    /**
     * Constructor arguments resolution match occurs using arguments's type
     * If no potential ambiguity exists in the constructor arguments of the Bean definition,then the order
     * in which the constructor arguments ard defined in a bean definition is a order in which those arguments
     * are supplied to appropriate constructor when the bean is being instantiated
     * @param bar
     * @param biz
     */
    public Foo(Bar bar, Biz biz){
    }
}
