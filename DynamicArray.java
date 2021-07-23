package intDinamicArrays;
/**
* Interface that contains the methods needed to operate
* the escential of an array data structure.
* Abstract methods:
* 		push => add elements at the end of the array
*		pop => take an element stored at the end
*		isEmpty => returns true if the array is empty,
*					false otherwise.
* 		size => returns the size of the array.
* @package intDinamicArrays: that includes all classes and 
* interfaces that perform the array.
* @author  Hector Jose Vurchio Hurtado
* @version 1.0
* @since   2021-07-21 
*/
public interface DynamicArray {
	public void push(int element); 
	public int pop(); 
	public boolean isEmpty(); 
	public int size(); 
}