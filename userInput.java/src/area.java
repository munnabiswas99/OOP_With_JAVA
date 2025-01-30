import java.util.Scanner;

public class area {
    /**
     * @param args
     */
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int base,hight;
        double area;

        System.out.print("Enter Base and Hight of the triangle : ");
        base = input.nextInt();
        hight = input.nextInt();

        area = .5*base*hight;

        System.out.println("Area = "+area);

        
    }
    
}
