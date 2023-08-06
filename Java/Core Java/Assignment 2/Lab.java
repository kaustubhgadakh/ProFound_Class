/*
    7. Create a class Book which describes its Book_title and Book_price. Use getter and
        setter Methods to get & set the Books description. Implement createBook and
        showBook methods to create and display Book Information. Write a separate class
        BookInfo to access the Book class
 */

//1. WAP to check whether a person is eligible for voting
/*
import java.util.Scanner;
public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for voting.");
        } else {
            System.out.println("You are not eligible for voting");
        }
    }
}
*/

//2. WAP to check whether a given year is a LEAP year
/*
import java.util.Scanner;
public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter year: ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
          } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
          } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
          } else {
            System.out.println(year + " is not a leap year.");
          }
    }
}
*/

//3. WAP to find the factorial of a number?
/*
import java.util.Scanner;
public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter factorial No.: ");
        int num = sc.nextInt();
        int fact = 1;

        for(int i=num; i>0; i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }
} 
*/
//4. WAP to find whether a given number is an Armstrong number
/*
import java.util.Scanner;
public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter Number: ");
        int num = sc.nextInt();
        int temp, total = 0;

        int number = num;

        while (number != 0) {
            temp = number % 10;
            total = total + temp * temp * temp;
            number = number/10;
        }
        if (total == num) {
            System.out.println(num + " is an Armstrong Number");
        } else {
        System.out.println(num + " is not an Armstrong Number");
        }
    }
}
*/

//5. WAP to reverse the given number
/*
import java.util.Scanner;
public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter Number: ");
        int num = sc.nextInt();
        int rev = 0;
        
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }
}
*/

//6. Generate the Fib… series 1 1 2 3 5 8 13
import java.util.Scanner;
public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter Number: ");
        int num = sc.nextInt();
        int a = 0;        
        int b = 1;

        int count = 0;

        while (count < num) {
            System.out.print(a+ " ");

            int temp = b + a;
            a = b;
            b = temp;
            count++;
        }
    }
}