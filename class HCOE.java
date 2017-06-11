public class HCOE extends Thread{
public void run()
			{
				System.out.println("hello worl");
			}
			public static void main(String args[]) throws Exception
			{
				HCOE obj1 = new HCOE();
				Thread obj = new Thread(obj1);
				
				obj.start();
			}
				
		}