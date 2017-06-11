import java.util.Scanner;
public class ConditionIfelseif{
	public static void main(String args[]){
	Scanner abc=new Scanner(System.in);
	System.out.println("input ur number:");
	int i=abc.nextInt();
	if(i<5){
	System.out.println("the num is less than 5");
	}
	else if(i>5){
	System.out.println("the num is more than 5");
	}
	else{
	System.out.println("the num is equal to 5");
	}
}
}