package print_sequence_using_3_threads;

//object level locking example 

public class SequenceGenerator {
	 public int PRINT_NUMBERS_UPTO=10;
	 static int  number=1;
	 
	 public void print(int remainder) {
		 
	    	while (number < PRINT_NUMBERS_UPTO-2) {
	    		//System.out.println(Thread.currentThread().getName() + " -------" +number);		    
	    		synchronized (this) {
			                while (number % 4 != remainder) { // wait for numbers other than remainder
			                    try {
			                        wait();
			                    } catch (InterruptedException e) {
			                        e.printStackTrace();
			                    }
			                }
			                System.out.println(Thread.currentThread().getName() + " " +number);
			                number++;
			                notifyAll();
			    }
	        }
	    } 
}
