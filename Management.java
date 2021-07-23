package intDinamicArrays;
import javax.swing.JOptionPane;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.time.Instant;
import java.time.Duration;
/**
* this is the class that contains the main method being this
* used to test the class.
* @package intDinamicArrays: that includes all classes and 
* interfaces that perform a dynamic array.
* @author  Hector Jose Vurchio Hurtado
* @version 1.0
* @since   2021-07-21 
*/
public class Management{
	/**
	* This static method calculates the precentage of heap 
	* memory used by an object.
	* @return percentage of heap memory used.
	*/
	static long percHeapMemoryUsed(){
		MemoryMXBean memoryBean = 
			ManagementFactory.getMemoryMXBean();
		MemoryUsage heapUsage = memoryBean.getHeapMemoryUsage();
		int mbConvers = 1024 * 1024;
		long usedMemory = heapUsage.getUsed()/mbConvers;
		long maxMemory = heapUsage.getMax()/mbConvers;
		long percentageUsed = 
			(long)(100.0*((1.0*usedMemory)/(1.0*maxMemory)));
		return percentageUsed;
	}
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null,"Ready to Start");
		Instant start = Instant.now(); //get initial time
		int i = 0;
		IntArray arr = new IntArray();
		long memoryUsed;
		while(true){
			arr.push(i);
			memoryUsed = Management.percHeapMemoryUsed();
			System.out.println("memory used %: "+
						memoryUsed+"  Element #: "+i);
			i++;
			if(memoryUsed > 95 || i == 1000000){
				Instant end = Instant.now(); //get ending time
				JOptionPane.showMessageDialog(null,"List Cleared");
				System.out.println("Initial Time "+start.toString());
				System.out.println("ending time "+end.toString());
				Duration timeElapsed = Duration.between(start,end);
				long millis = timeElapsed.toMillis();
				System.out.println("time elapsed "+millis+" miliseconds");
				break;
			}
		}
	}
}

/*

javac -d . *.java

java intDinamicArrays.Management

*/