import java.util.Scanner;
public class AreaOfSquare {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the length of square");
       double side=scan.nextDouble();
       double area=side*side;
       System.out.println("the area of square is "+area);
       
	}

}
