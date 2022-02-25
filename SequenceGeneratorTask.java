package print_sequence_using_3_threads;

public class SequenceGeneratorTask implements Runnable {
    private SequenceGenerator sequenceGenerator;
	private int remainder;

    public SequenceGeneratorTask(SequenceGenerator sequenceGenerator, int remainder) {
		super();
		this.sequenceGenerator = sequenceGenerator;
		this.remainder = remainder;
	}
    
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.sequenceGenerator.print(this.remainder);
	}

}
