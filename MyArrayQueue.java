package tailoredQueue;
/**
* Class that collects objects in a FIFO principle.
* @implements MyQueue, Interface with the basic
* Queues operations.
* @author Hector Jose Vurchio Hurtado
* @version 1
* @since 07/26/2021
* @see https://www.linkedin.com/in/hector-vurchio/
*/
public class MyArrayQueue<E> implements MyQueue<E>{
	private int leading;
	private int trailing;
	private int capacity; 
	private Object[] elements; 
	public MyArrayQueue(){
		this.leading = -1;
		this.trailing = -1;
		this.capacity = 1;
		this.elements = new Object[capacity];
	}
	@Override
	public void add(E element){
		if(elements.length == 1 
					&& elements[0] == null){
			leading = 0;
			trailing = 0;
		}else{
			trailing++;
		}
		if(trailing == capacity){expand();}
		elements[trailing] = element;
	}
	@Override
	@SuppressWarnings("unchecked")
	public E remove(){
		if(leading == trailing && capacity == 1){
			if(elements[leading] == null){
				return null;
			}else{
				E elm = (E)elements[leading];
				elements[leading]=null;
				return elm;
			}
		}else{
			E elm = (E)elements[leading];
			elements[leading]=null;
			leading++;
			double quotient = (1.0)*size()/capacity; 
			if(quotient == 0.5){shrink();}
			return elm;
		}
	}
	@Override
	public int size(){
		if(leading == trailing && capacity == 1){
			if(elements[leading] == null){
				return 0;
			}else{
				return 1;
			}
		}else{
			return trailing - leading + 1;	
		}
	}
	/**
	* This methods expands the array so that its capacity grows
	*/
	private void expand(){
		int s = size();
		Object[] tempArr;
		if(s < capacity){
			tempArr = new Object[capacity];
			for(int i = leading; i < capacity; i++){
				tempArr[i-leading] = elements[i];
			}
			leading = 0;
			trailing = s - 1;
		}else{
			int newCap = 2 * capacity;
			tempArr = new Object[newCap];
			for(int i = 0; i < capacity;i++){
				tempArr[i] = elements[i];
			}
			capacity = newCap;
		}
		elements = tempArr;
	}
		/**
	*This method reduce the array's capacity
	*/
	private void shrink(){
		int s = size();
		Object[] tempArr = new Object[s];
		for(int i = leading;i<=trailing;i++){
			tempArr[i-leading] = elements[i];
		}
		elements = tempArr;
		capacity = s;
		leading = 0;
		trailing = s - 1;
	}
}