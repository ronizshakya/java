public class HCOE extends Thread{
public void run()

			{
				for(int i=0;i<5;i++)

				{
					try{
						Thread.sleep(1000);
					}
					catch(Exception e){
						System.out.println(e);
					}
						System.out.println("hello worl");
					try{
						Thread.sleep(2000);
					}
					catach(Exception e){
						System.out.println(e);
					}
						System.out.println("nepal");
					}	
					
				}
			}
			public static void main(String args[]) throws Exception
			{
				HCOE obj1 = new HCOE();
				Thread obj2 = new Thread(obj1);
				Thread obj3 = new Thread(obj1);
				obj2.start();
				obj3.start();
			run();
			}
				
		}