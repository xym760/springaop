package com.nxist.spring.aop.helloworld;

/**
 * @Author: xym760
 * @Date: 2019/6/5 10:34
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
//        ArithmeticCalculator arithmeticCalculator = null;
//        arithmeticCalculator = new ArithmeticCalculatorLoggingImpl();

        ArithmeticCalculator target = new ArithmeticCalculatorImpl();
        ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
        System.out.println(proxy.getClass().getName());
        int result = proxy.add(1, 2);
        System.out.println("--->" + result);

        result = proxy.div(4, 2);
        System.out.println("--->" + result);

    }
}
