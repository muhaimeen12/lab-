
public class Armstrong {

	public static void main(String[] args) {
        int number=375,remainder,originalNumber,result=0;
        originalNumber=number;
        
        while(originalNumber!=0) {
        	remainder=originalNumber%10;
        	result +=Math.pow(remainder,3);
        	originalNumber/=10;
        	
        }
        if(result==number)
        System.out.println(result+" is a armstrong number");
        
        else
        	System.out.println(result+" is not a armstrong number");
        
	}

}
