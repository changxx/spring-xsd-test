package com.changxx.spring;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * StudentBeanDefinitionParser
 *
 * @author changxiangxiang
 * @date 16/4/2
 */
public class StudentBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Student.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        builder.addPropertyValue("id", element.getAttribute("id"));
        builder.addPropertyValue("name", element.getAttribute("name"));
        builder.addPropertyValue("age", element.getAttribute("age"));
    }
}
