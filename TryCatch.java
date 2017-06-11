//try catch//throw//finaaly
import java.io.*;
import java.util.Scanner;
public class TryCatch{
	public static void main(String args[]){
	try{
	
	Scanner abc = new Scanner(System.in);
	System.out.println("enter ur number:");
	int i = abc.nextInt();
	System.out.println("the number is:" +i);
		}
	catch(Exception a){
		System.out.println("ur number is invalid");
	}
	
	}	
}