package tailoredQueue;
/**
* Interface with the basic Queues operations
* @author Hector Jose Vurchio Hurtado
* @version 1
* @since 07/26/2021
* @see https://www.linkedin.com/in/hector-vurchio/
*/
public interface MyQueue<E>{
	public void add(E element);
	public E remove();
	public int size();
}