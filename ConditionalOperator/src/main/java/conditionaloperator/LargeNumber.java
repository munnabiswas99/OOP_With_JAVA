
package conditionaloperator;
import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int num1,num2,large;
        
        System.out.println("Enter Two Integer Number: ");
        
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        large = (num1>num2) ? num1:num2;
        
        System.out.println("The large Number is = "+large);
        
    }
}
