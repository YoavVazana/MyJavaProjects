import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int digit = 1; digit != 0; digit = in.nextInt()) {
            System.out.println("0.End Program\n1.Factorial\n2.Boom Game\n3.Amicable Numbers\n4.Narcissistic number\nplease enter a digit(0-4)\n");
            digit = in.nextInt();
            if (digit >= 0 && digit <= 4) {
                int num1;
                int num2;
                int check;
                if (digit == 1) {
                    System.out.println("please insert number(between 0 and 15)");
                    num1 = in.nextInt();
                    num2 = num1;
                    check = num1;
                    if (num1 > 0 && num1 <= 15) {
                        while(check >= 1) {
                            num2 *= check--;
                        }
                    } else {
                        System.out.println("Input error");
                    }

                    System.out.println(num1 + "! = " + num2);
                } else if (digit == 2) {
                    System.out.println("Please enter a number (between 10 and 50)");
                    num1 = in.nextInt();

                    for(num2 = num1; num2 >= 1; --num2) {
                        if (num2 % 5 != 0) {
                            System.out.println(num2);
                        } else {
                            System.out.println("Boom!");
                        }
                    }
                } else if (digit == 3) {
                    System.out.println("Please enter a positive number");
                    num1 = in.nextInt();
                    if (num1 < 1) {
                        System.out.println("Error");
                    }

                    System.out.println("Please enter another positive number");
                    num2 = in.nextInt();
                    if (num1 < 1) {
                        System.out.println("Error");
                    }

                    check = 0;
                    int j = num1;

                    while(j > 1) {
                        --j;
                        if (num1 % j == 0) {
                            check += j;
                        }
                    }

                    if (check == num2) {
                        System.out.println("These numbers are a pare of amicable numbers");
                    } else {
                        System.out.println("These numbers are NOT a pare amicable numbers!");
                    }
                }
            } else {
                System.out.println("Invalid menu input");
            }

            System.out.println("0.End Program\n1.Factorial\n2.Boom Game\n3.Amicable Numbers\n4.Narcissistic number\nplease enter a digit(0-4)\n");
        }

        System.out.println("See you");
    }
}


