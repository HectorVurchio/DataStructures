package intDinamicArrays;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;
/**
* This is a class to measure the amount of memory
* taken up by an object.
* @package intDinamicArrays: that includes all classes and 
* interfaces that perform a dynamic array.
* @author  Hector Jose Vurchio Hurtado
* @version 1.0
* @since   2021-07-21 
*/
public class ObjectWeight{
	/**
	* Method to get the shallow size of an object
	* @return String object, a report over the shallow size
	*/
	public String scaleShallow(Object object){
		return ClassLayout.parseInstance(object).toPrintable();
	}
	/**
	* Method to get the deep size of an object
	* @return Stirng object,a report over the deep size
	*/
	public String scaleDeep(Object object){
		return GraphLayout.parseInstance(object).toPrintable();
	}
}

/*
javac -classpath jol-cli-latest.jar *.java  

java -cp .;jol-cli-latest.jar ObjectWeight  

*/