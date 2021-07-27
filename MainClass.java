package tailoredQueue;
public class MainClass{
	public static void main(String[] args){
		MyArrayQueue<String> maq = new MyArrayQueue<>();
		maq.add("One");
		maq.add("Two");
		maq.add("Three");
		maq.add("four");
		maq.add("Five");
		maq.add("Six");
		maq.add("Seven");
		maq.add("Eight");
		maq.add("Nine");
		maq.add("Ten");
		maq.add("Eleven");
		maq.add("Twelve");
		maq.add("Thirteen");
		maq.add("Fourteen");
		maq.add("Fifteen");
		System.out.println("Size after add the elements: "+maq.size());
		System.out.println("Elements in queue ");
		String obj;
		while(true){
			obj = maq.remove();
			if(obj == null){break;}
			System.out.println(obj);
		}
		System.out.println("Size after removes all "+maq.size());
	}
}
/*
javac -d . *.java
java tailoredQueue.MainClass

*/