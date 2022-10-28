
import java.util.Scanner;
public class Basic_Calculator_Castillo_Riceo0 {
   public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    
    char operator;
    Double number1, number2, result;
    String answer;
     do {
        System.out.print("Enter first number:");
        number1 = sn.nextDouble();
        System.out.print("Enter second number:");
        number2 = sn.nextDouble();
    
        System.out.println(" ");
        System.out.println("Choose your function:");
        System.out.println("+ - * /");
        System.out.println(" ");
        System.out.print("Type here:");
        operator = sn.next().charAt(0);

        switch (operator) {
        case '+':
          result = number1 + number2;
          System.out.println(" ");
          System.out.println(number1 + " + " + number2 + " = " + result);
          break;

        case '-':
          result = number1 - number2;
          System.out.println(" ");
          System.out.println(number1 + " - " + number2 + " = " + result);
          break;

        case '*':
          result = number1 * number2;
          System.out.println(" ");
          System.out.println(number1 + " * " + number2 + " = " + result);
          break;

        case '/':
          result = number1 / number2;
          System.out.println(" ");
          System.out.println(number1 + " / " + number2 + " = " + result);
          break;

        default:
          System.out.println(" ");
          System.out.println("Invalid operator!");
          sn.close();
          break;
    }
     System.out.println("do you want to Solve Again? Y/N");
     answer = sn.next();
      
    }
    while (answer.equals("Y"));
      
   System.out.println("Program has ended!");
     sn.close();
 } 
} 
