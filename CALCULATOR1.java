/* write a program to make a calculator */
import java.util.*;

public class CALCULATOR1 {

public static void main(String[] args){
int num1, num2, result;
char a;

Scanner calc =new Scanner(System.in);
System.out.println("Enter your number");

num1 =calc.nextInt();

System.out.println("Enter your 2nd number");

num2 =calc.nextInt();

System.out.println("Enter operation to be performed");

a= calc.next().charAt(0);

switch (a) {

case '+':
result = num1 + num2;
System.out.println(result);
break;

case '-':
result= num1- num2;
System.out.println(result);
break;

case '*':
result = num1 *num2;
System.out.println(result);
break;

case '/':
result = num1 / num2;
System.out.println(result);
break;

default:
System.out.println("check karr");
break;
}
}
}