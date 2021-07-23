package intDinamicArrays;
public class intArrayMain{
	public static void main(String[] args){
		IntArray arr = new IntArray();
		arr.push(3);
		arr.push(39);
		arr.push(41);
		arr.push(69);
		arr.push(21);
		arr.push(70);
		arr.push(8);
		arr.push(99);
		arr.push(39);
		arr.push(54);
		arr.push(70);
		arr.push(14);
		arr.push(14);
		System.out.println("Size = "+arr.size());
		System.out.println("capacity "+arr.getCapacity());
		ObjectWeight ow = new ObjectWeight();
		System.out.println(ow.scaleDeep(arr));
		int s = arr.size();
		for(int i = 0;i<s;i++){
			System.out.println(arr.pop());
		}
		System.out.println("Size = "+arr.size());
		System.out.println("capacity "+arr.getCapacity());
	}
}

/*
javac -d . *.java

java intDinamicArrays.intArrayMain

javac -classpath jol-cli-latest.jar -d . *.java  

java -cp .;jol-cli-latest.jar intDinamicArrays.intArrayMain

*/