package pl.coderslab.unittestskrajeew05.example1;


public class Calculator {
    public double add(double a, double b){
        return a+b;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        if(Math.abs(b)<.000000001){
            throw new IllegalArgumentException("Division by zero");
        }
        return a/b;
    }

    public boolean greater(int a, int b){
        return a>b;
    }
}
