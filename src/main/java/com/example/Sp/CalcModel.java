package com.example.Sp;

public class CalcModel {
    private double arg1;
    private double arg2;
    private String operation;

    public String result = "";

    public void setArg1(double arg1) {
        this.arg1 = arg1;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public void setArg2(double arg2) {
        this.arg2 = arg2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getArg1() {
        return this.arg1;
    }

    public double getArg2() {
        return this.arg2;
    }

    public String getOperation() {
        return this.operation;
    }

    public String getResult() {
        return this.result;
    }


}
