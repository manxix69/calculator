package ru.manxix69.calculator;

public interface CalculatorService {
    double valueOf(String s);
    String plus(String d1, String d2);
    String minus(String d1, String d2);
    String multiply(String d1, String d2);
    String divide(String d1, String d2);
    String greeting();
}
