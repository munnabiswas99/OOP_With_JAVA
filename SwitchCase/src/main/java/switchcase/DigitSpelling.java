
package switchcase;
import java.util.Scanner;


public class DigitSpelling {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer number from 1 to 5: ");
        
        num = input.nextInt();
        
        switch(num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                    System.out.println("The number is not avilabile from 1 to 5");
            
        }
    }
    
}
