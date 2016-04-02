package com.changxx.spring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * MyNamespaceHandler
 *
 * @author changxiangxiang
 * @date 16/4/2
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("student", new StudentBeanDefinitionParser());
    }
}
