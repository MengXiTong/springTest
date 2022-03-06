package net.biancheng.c;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class InitHelloTest implements BeanPostProcessor, Ordered {
    @Override
    public int getOrder() {
        return 5;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("A Before : " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("A After : " + beanName);
        return bean;
    }
}
