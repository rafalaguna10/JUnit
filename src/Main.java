import java.util.Scanner;

public class Main {

    public void insideCalc(){

        Arithmetic_calc calc = new Arithmetic_calc();

        System.out.print("Choose Two numbers: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Choose a fuction: \naddition (A), div(D), multiplication (M), Square (S), pow (P)");
        char Func = sc.next().charAt(0);
        switch (Func){
            case 'A':
                System.out.print(a + " + "+b+" = ");
                System.out.println(calc.addition(a,b));
                break;
            case 'D':
                System.out.print(a + " / "+b+" = ");
                System.out.println(calc.div(a,b));
                break;
            case 'M':
                System.out.print(a + " * "+b+" = ");
                System.out.println(calc.mul(a,b));
                break;
            case 'S':
                System.out.print(a + " root is : ");
                System.out.println(calc.squareRoot(a));
                System.out.print(b + " root is: ");
                System.out.println(calc.squareRoot(b));
                break;
            case 'P':
                System.out.print(a + " ^ "+b+" = ");
                System.out.println(calc.pow(a,b));
                break;
            default:
                System.out.println("Wrong Value");
                break;
        }

    }

    public void insideGrader(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me an Int grade in range(0-100)");
        int grade = sc.nextInt();
        Grader gr = new Grader();

        System.out.println("Your number grade "+grade+" equals to the letter grade: "+gr.grader(grade));
    }

    public static void main(String[] args) {

        System.out.println("What do you want to use? (Write a single UPPERCASE letter)");
        System.out.print("(A) Calculator");
        System.out.print("(B) Grader: ");

        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        Main obj1 = new Main();
        Main obj2 = new Main();

        if (letter == 'A'){
            obj1.insideCalc();
        }
        else if (letter == 'B'){
            obj2.insideGrader();
        }
        else{
            throw new IllegalArgumentException("Illegal Letter");
        }
    }
}