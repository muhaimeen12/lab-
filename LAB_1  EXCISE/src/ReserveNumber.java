import java.util.Scanner;
public class ReserveNumber {

	public static void main(String[] args) {
       int num=0;
       int reversenum=0;
       System.out.println("enter the number");
       Scanner in=new Scanner(System.in);
       num=in.nextInt();
       while(num!=0) {
    	   reversenum=reversenum*10;
    	   reversenum=reversenum+num%10;
    	   num/=10;
    	   
       }
       System.out.println("reverse of the number is "+reversenum);
	}

}
