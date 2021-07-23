package intDinamicArrays;
/**
* this is the class that contains the main method being this
* used to test the class.
* @package intDinamicArrays: that includes all classes and 
* interfaces that perform a dynamic array.
* @implements DynamicArray, Interface that contains the methods 
*	needed to operate the escential of an array data structure.
* @author  Hector Jose Vurchio Hurtado
* @version 1.0
* @since   2021-07-21 
*/
public class IntArray implements DynamicArray{
	private int point; 
	private int capacity; 
	private int[] myArray; 
	public IntArray(){
		this.point = 0;
		this.capacity = 1;
		this.myArray = new int[capacity];
	}
	@Override
	public void push(int element){
		if(point == capacity){expand();}
		myArray[point] = element;
		point ++;		
	}
	@Override
	public int pop(){
		point --;
		int elm;
		if(this.point >= 0){
			elm = this.myArray[point];
			myArray[point] = Integer.MIN_VALUE;
			double quotient = (double)point/(double)capacity;
			if(quotient <= 0.5){shrink();}
		}else{
			elm = Integer.MIN_VALUE;
			point++;
		}
		return elm;		
	} 
	@Override
	public boolean isEmpty(){
		if(this.point == 0){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public int size(){
		return this.point;
	} 
	/**
	* Method to grows the capacity of the array uppon request
	*/
	private void expand(){
		int newCapacity = 2*capacity;
		int[] myNewArray = new int[newCapacity];
		for(int i=0;i<capacity;i++){
			myNewArray[i] = myArray[i];
		}
		myArray = myNewArray;
		capacity = newCapacity;
	}
	/**
	* Method to reduce the capacity of the array uppon request
	*/
	private void shrink(){
		int newCapacity = point+1;
		int[] myNewArray = new int[newCapacity];
		for(int i=0;i<newCapacity;i++){
			myNewArray[i] = myArray[i];
		}
		myArray = myNewArray;
		capacity = newCapacity;
	}
	public int getCapacity(){
		return this.capacity;
	}
}