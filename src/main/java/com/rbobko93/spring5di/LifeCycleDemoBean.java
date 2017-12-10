package com.rbobko93.spring5di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware{

    public LifeCycleDemoBean() {
        System.out.println("## I am in the LifeCycleBean constructor");
    }

    @Override
    public void destroy(){
        System.out.println("## The LifeCycleBean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## The LifeCycleBean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## The LifeCycleBean name is: " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## The LifeCycleBean application context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The Post construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## The pre destroy method has been called");
    }

    public void beforeInit(){
        System.out.println("## - Before init - called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init - called by Bean Post Processor");
    }
}
