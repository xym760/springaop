package com.nxist.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xym760
 * @Date: 2019/6/6 10:39
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        //创建IOC容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取容器中的bean
        ArithmeticCalculator arithmeticCalculator= (ArithmeticCalculator) applicationContext.getBean(ArithmeticCalculator.class);
        //使用bean
        int result=arithmeticCalculator.add(3,6);
        System.out.println("result:"+result);
        result=arithmeticCalculator.div(12,0);
        System.out.println("result:"+result);
    }
}
