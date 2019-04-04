import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Input number A");
        Double A = scan.nextDouble();
        System.out.println("Input number B");
        Double B = scan.nextDouble();
        System.out.println("Input symbol:");
        switch (scan.next()){
            case "+":{
                System.out.println(calculator.sum(A, B));
                break;
            }
            case "-":{
                System.out.println(calculator.substraction(A, B));
                break;
            }
            case "*":{
                System.out.println(calculator.multiplication(A, B));
                break;
            }
            case "/":{
                System.out.println(calculator.division(A, B));
                break;
            }
        }
    }

    public Double sum(Double a, Double b){
        return (a + b);
    }

    public Double substraction(Double a, Double b){
        return (a - b);
    }

    public Double multiplication(Double a, Double b){
        return (a * b);
    }

    public Double division(Double a, Double b){
        if(b.equals(0)) return null;
        return (a / b);
    }

}
