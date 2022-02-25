package print_sequence_using_3_threads;

public class SequenceGenerator_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SequenceGenerator sequenceGenerator=new SequenceGenerator();
       Thread t1=new Thread(new SequenceGeneratorTask(sequenceGenerator, 1) , "T1");
       Thread t2=new Thread(new SequenceGeneratorTask(sequenceGenerator, 2) , "T2");
       Thread t3=new Thread(new SequenceGeneratorTask(sequenceGenerator, 0) , "T3");
       Thread t4=new Thread(new SequenceGeneratorTask(sequenceGenerator, 3) , "T4");
    
        t1.start();
        t2.start();
        t3.start();
        t4.start();
       
	}

}
