package ru.manxix69.calculator.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.manxix69.calculator.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String greeting() {
        return calculatorService.greeting();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam(name = "num1", required = false) String n1, @RequestParam(name = "num2", required = false) String n2) {
        return calculatorService.plus(n1,n2);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam(name = "num1", required = false) String n1, @RequestParam(name = "num2", required = false) String n2) {
        return calculatorService.minus(n1,n2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(name = "num1", required = false) String n1, @RequestParam(name = "num2", required = false) String n2) {
        return calculatorService.multiply(n1,n2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(name = "num1", required = false) String n1, @RequestParam(name = "num2", required = false) String n2) {
        return calculatorService.divide(n1,n2);
    }

}
