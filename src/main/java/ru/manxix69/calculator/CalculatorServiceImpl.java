package ru.manxix69.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }


    @Override
    public String plus(String d1, String d2) {
        if (d1 == null || d2 == null) {
            return "Не все параметры для вычисления переданы!";
        } else {
            double d = valueOf(d1) + valueOf(d2);
            return Double.toString(d);
        }
    }

    @Override
    public String minus(String d1, String d2) {
        if (d1 == null || d2 == null) {
            return "Не все параметры для вычисления переданы!";
        } else {
            double d = valueOf(d1) - valueOf(d2);
            return Double.toString(d);
        }
    }

    @Override
    public String multiply(String d1, String d2) {
        if (d1 == null || d2 == null) {
            return "Не все параметры для вычисления переданы!";
        } else {
            double d = valueOf(d1) * valueOf(d2);
            return Double.toString(d);
        }
    }

    @Override
    public String divide(String d1, String d2) {
        if (d1 == null || d2 == null) {
            return "Не все параметры для вычисления переданы!";
        } else if (valueOf(d2) == 0.0) {
            return "На ноль делить нельзя!";
        } else {
            double d = valueOf(d1) / valueOf(d2);
            return Double.toString(d);
        }
    }

    @Override
    public double valueOf(String s) {
        return Double.valueOf(s);
    }
}
