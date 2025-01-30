import java.util.Scanner;

public class userInput {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1,n2,result;
    double div;
    System.out.print("Enter two number: ");
   
    n1=input.nextInt();
    n2=input.nextInt();
    result=n1+n2;
    div=(double)n1/n2;
    System.out.println("Result = "+result);
    System.out.printf("div = %.2f",div);


        
   
        
    }

    
}