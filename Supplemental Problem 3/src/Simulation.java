import java.util.List;
import java.util.concurrent.BlockingQueue;


public class Simulation extends Thread {
	
	private final BlockingQueue<PrintRequest> queue;
	List<Queue<PrintRequest>> queues = 
			new ArrayList<Queue<PrintRequest>>;
	for (int i = 0; i < 10; ++i) {
		queues.add(new Printer<PrintRequest>());
	}


}//class Simulation
