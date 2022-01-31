package simple_calculator;
import java.util.*;
public class simpleCalculator {
           public static void main(String args[]) {
        	   
        	   Scanner sc = new Scanner(System.in);
        	   System.out.println("Enter First number: ");
        	   double first=sc.nextDouble();
        	   
        	   System.out.println("Enter operator: ");
        	   char operator = sc.next().charAt(0);
        	   
        	   System.out.println("Enter Second number: ");
        	   double second=sc.nextDouble();
        	   
        	   double result =0;
        	   
        	   switch(operator) {
        	   
        	   case '+': 
        		   result=first+second;
        		   break;
        		   
        	   case '-':
        		   result=first-second;
        		   break;
        		   
        	   case '*':
        		   result=first*second;
        		   break;
        		   
        	   case '/':
        		   result=first/second;
        		   break;
        		   
        		   default:
        			   System.out.println("Error! Operator is not correct.");
        	   }
        	   
        	   System.out.printf("%.1f%c%.1f=%.1f",first,operator,second,result);
        	   sc.close();
        	   
           }
	
}
