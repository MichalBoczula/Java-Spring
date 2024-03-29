package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
class Calculator {

    private final Display display;

    public Calculator(Display display) {
        this.display = display;
    }
    double add(double a, double b){
        display.displayValue(a+b);
        return a+b;
    }
    double sub(double a, double b){
        display.displayValue(a-b);
        return a-b;
    }
    double mul(double a, double b){
        display.displayValue(a*b);
        return a*b;
    }
    double div(double a, double b){
        display.displayValue(a/b);
        return a/b;
    }

}
