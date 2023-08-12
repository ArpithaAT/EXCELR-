package creating_thread;

class ExtendingThread extends Thread
{
	
	public void run()
	{
		System.out.println("extending thread class thread started running...!!!!");
	}
}


public class Extending_thread {

	public static void main(String[] args) {
		

		ExtendingThread t1 = new ExtendingThread();
		t1.start();
		
    
	}

}
