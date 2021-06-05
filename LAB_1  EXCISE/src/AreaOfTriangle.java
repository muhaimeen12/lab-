
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the length of rectangle");
       double height=scan.nextDouble();
       System.out.println("enter the base of rectangle");
       double base=scan.nextDouble();
       double area=(base*height)/2;
       System.out.println("the area of rectangle is "+area);
       
	}

}
