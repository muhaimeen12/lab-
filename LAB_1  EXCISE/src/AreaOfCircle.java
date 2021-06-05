import java.util.Scanner;
public class AreaOfCircle {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the radius: ");
		double radius=sc.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("area of the circle"+area);
		double circumference=Math.PI*radius*radius;
		System.out.println("area of the circumference"+circumference);
      
      
	}

}
