package intDinamicArrays;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;
public class ObjectWeight{
	public String scaleShallow(Object object){
		return ClassLayout.parseInstance(object).toPrintable();
	}
	public String scaleDeep(Object object){
		return GraphLayout.parseInstance(object).toPrintable();
	}
}

/*
javac -classpath jol-cli-latest.jar *.java  

java -cp .;jol-cli-latest.jar ObjectWeight  

*/