
public class SwappingWithoutString {

	public static void main(String[] args) {
		int first=12,second=23;
		System.out.println("before swapping the number....");
		System.out.println("first number is :"+first);
		System.out.println("second number is :"+second);
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println("after swapping the number....");
		System.out.println("first number is :"+first);
		System.out.println("second number is :"+second);

	}

}
