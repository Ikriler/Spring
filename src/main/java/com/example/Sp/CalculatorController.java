package com.example.Sp;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String calculateFormGet(Model model) {
        model.addAttribute("calculator", new CalcModel());
        return "calculator";
    }

    @GetMapping("/calculatorR")
    public String calculateFormResultGet(@ModelAttribute("calculator") CalcModel calcModel, Model model) {
        double a = calcModel.getArg1();
        double b = calcModel.getArg2();
        double result;

        switch (calcModel.getOperation()) {
            case "add":
                result = a + b;
                break;
            case "del":
                result = a - b;
                break;
            case "mul":
                result = a * b;
                break;
            case "div":
                result = a / b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + calcModel.getOperation());
        }
        calcModel.setResult(String.valueOf(result));

        return "calculator";
    }

    @PostMapping("/calculator")
    public String calculateFormResult(@ModelAttribute CalcModel calcModel, Model model) {
        double a = calcModel.getArg1();
        double b = calcModel.getArg2();
        double result;

        switch (calcModel.getOperation()) {
            case "add":
                result = a + b;
                break;
            case "del":
                result = a - b;
                break;
            case "mul":
                result = a * b;
                break;
            case "div":
                result = a / b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + calcModel.getOperation());
        }

        calcModel.setResult(String.valueOf(result));

        model.addAttribute("calculator", calcModel);
        return "calculator";
    }

}
