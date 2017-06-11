//to take input and display it
import java.util.Scanner;//java.util.Scanner is a package to import/scan
public class TakingInput{
public static void main(String args[]){
	Scanner xyz = new Scanner(System.in);//scanner is a class to take input.xyz is object for scanner.xyz le input linxa ra new Scanner le naya value linxa.system.in scanner ko functon jasle hamro value scanner xyz ma lagxa  
	System.out.println("input ur value: ");
	String abc=xyz.nextLine(); //yele chai whole line lai linxa ra string haru sabai lai linxa integer charater sabai..
	System.out.println("the inputed value is:"+abc);

}
	
}