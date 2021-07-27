package tailoredQueue;
public interface MyQueue<E>{
	public void add(E element);
	public E remove();
	public int size();
}