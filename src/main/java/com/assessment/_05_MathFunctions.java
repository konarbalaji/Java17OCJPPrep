package com.assessment;

public class _05_MathFunctions {
    public static void addToInt(int x, int amountToAdd){
        x = x+amountToAdd;
    }

    public static void main(String[] args) {
        var a= 15;
        var b = 10;
        _05_MathFunctions.addToInt(a,b);
        System.out.println(a);
    }
}
