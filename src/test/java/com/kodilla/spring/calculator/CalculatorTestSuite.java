package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultTest = calculator.add(2,2);
        //Then
        Assert.assertEquals(4, resultTest, 0.01);
    }
    @Test
    public void testSub(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultTest = calculator.sub(5,2);
        //Then
        Assert.assertEquals(3, resultTest, 0.01);
    }
    @Test
    public void testMul(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultTest = calculator.mul(3,2);
        //Then
        Assert.assertEquals(6, resultTest, 0.01);
    }
    @Test
    public void testDiv(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultTest = calculator.div(10,2);
        //Then
        Assert.assertEquals(5, resultTest, 0.01);
    }

}