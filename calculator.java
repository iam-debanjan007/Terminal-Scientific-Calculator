import java.lang.Math;
import java.io.*;

public class calculator {
    public static void main(String[] args) throws IOException, InterruptedException {
        String c, n, x;
        double a, b, add, div, sub, mul, fct=1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\n         Scientific Calculator \n Enter your choice to perform an action:  \n" );
            System.out.println("Enter 1 for Addition(+) \n 2 for Subtraction(-) \n 3 for Multiplication(x) \n 4 for Division(÷) \n 5 for Sin \n 6 for Cos \n 7 for Tan\n 8 for Power(^)\n 9 for Pi(π) \n 10 for RootOver(√) \n 11 for Factorial(x!) \n 0 for Exit \n=> ");
            x = br.readLine();
            int s = Integer.parseInt(x);
            switch (s) {
                case 1 -> {
                    System.out.println("\n Enter 1st number: ");                                                                                                                                                                //Made with love by Debanjan Mukherjee :D
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println(" Enter 2nd number: ");
                    n = br.readLine();
                    b = Double.parseDouble(n);
                    add = a + b;
                    System.out.println("The addition of the numbers: " + a + "+" + b + " = " + add);
                }
                case 2 -> {
                    System.out.println("\n Enter 1st number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println(" Enter 2nd number: ");
                    n = br.readLine();
                    b = Double.parseDouble(n);
                    sub = a - b;
                    System.out.println("The Subtraction of the numbers: " + a + "-" + b + " = " + sub);
                }
                case 3 -> {
                    System.out.println("\n Enter 1st number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println(" Enter 2nd number: ");
                    n = br.readLine();
                    b = Double.parseDouble(n);
                    mul = a * b;
                    System.out.println("The Subtraction of the numbers: " + a + "x" + b + " = " + mul);
                }
                case 4 -> {
                    System.out.println("\n Enter 1st number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println(" Enter 2nd number: ");
                    n = br.readLine();
                    b = Double.parseDouble(n);
                    div = a / b;
                    System.out.println("The Subtraction of the numbers: " + a + "÷" + b + " = " + div);                                                                                         //Made with love by Debanjan Mukherjee :D
                }
                case 5 -> {
                    System.out.println("\n Enter the number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println("Sin("+a+")= "+Math.sin(a));
                }
                case 6 -> {
                    System.out.println("\n Enter the number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println("Cos("+a+")= "+Math.cos(a));

                }
                case 7 -> {
                    System.out.println("\n Enter the number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println("Tan("+a+") = "+Math.tan(a));
                }
                case 8 -> {
                    System.out.println("\n Enter the number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println("Enter ^ :");                                                                                                                              //Made with love by Debanjan Mukherjee :D
                    n = br.readLine();
                    b=Double.parseDouble(n);
                    System.out.println(a+"^"+b+"= "+Math.pow(a, b));
                }
                case 9 -> {
                    System.out.println("\n Enter the number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    b= a*3.141592653589793238462643383279502884197;
                    System.out.println(a+"π = "+b);
                }
                case 10 ->{
                    System.out.println("\n Enter the number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println(" √"+a+" = "+Math.pow(a, 0.5));
                }
                case 11 -> {
                    System.out.println("\n Enter the number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    for(int i=1;i<=a;i++){
                        fct=fct*i;
                    }
                    System.out.println(a+"! = "+fct);
                }
                case 0 -> {
                        System.out.println("\n Exiting Program...");
                        System.exit(0);
                }
                default -> System.out.println("Enter valid choice!");
            }
            Thread.sleep(2000);
        }
    }
}
//Made with love by Debanjan Mukherjee :D
