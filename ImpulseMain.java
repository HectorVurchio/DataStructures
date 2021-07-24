package tailoredArrays;
import java.util.ArrayList;
/**
* this is the class that contains the main method being this
* used to test the class.
* @package tailoredArrays: that includes all classes and 
* interfaces that perform a generic array.
* @author  Hector Jose Vurchio Hurtado
* @version 1.0
* @since   2021-07-21 
*/
public class ImpulseMain{
	public static void main(String[] args){
		ArrayExpand<MyClass> arrExp = new ArrayExpand<>();
		//ArrayList<MyClass> arrExp = new ArrayList<>();
		arrExp.add(new MyClass(1520,"Hector Vurchio"));
		arrExp.add(new MyClass(1521,"Laura Addonizio"));
		arrExp.add(new MyClass(1522,"Rocco Vurchio"));
		arrExp.add(new MyClass(1523,"Nelly Freduk"));
		arrExp.add(new MyClass(1524,"Antonio Addonizio"));
		arrExp.add(new MyClass(1525,"Valentina Addonizio"));
		arrExp.add(new MyClass(1526,"Luis Fernandez"));
		arrExp.add(new MyClass(1527,"Natalia Fernandez"));
		arrExp.add(new MyClass(1528,"Arianna Addonizio"));
		arrExp.add(new MyClass(1529,"Karen Solano"));
		arrExp.add(new MyClass(1530,"Natalie Solano"));
		for(int i = 0;i < arrExp.getSize();i++){
		//for(int i = 0;i<arrExp.size();i++){
			MyClass mc = arrExp.getValue(i);
			//MyClass mc = arrExp.get(i);
			System.out.println(mc.getId()+" "+mc.getName());
		}		
	}	
}



class MyClass implements ArrayElement<MyClass>{
	private int id;
	private String name;
	MyClass(int id,String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public MyClass error(){
		return new MyClass(Integer.MIN_VALUE,"Error Name");
	}
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
}

/*
javac -d . *.java

java tailoredArrays.ImpulseMain

*/