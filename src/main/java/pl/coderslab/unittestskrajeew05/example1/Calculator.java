package pl.coderslab.unittestskrajeew05.example1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public double eval(String mathExpression){
        Pattern pat = Pattern.compile("^([0-9]+)([-+*\\/][0-9]+)+$");
        Matcher mat = pat.matcher(mathExpression);

        if(!mat.matches()){
            throw new IllegalArgumentException("Expression cannot be parsed");
        }

        double result = Double.parseDouble(mat.group(1));
        // todo iterate tokens and calculate
        for(int i=2; i<=mat.groupCount(); i++){
            System.out.println(mat.group(i));
        }
        return result;
    }

    public long factorial(int n) {
        throw new RuntimeException("not implemented");
    }
}
