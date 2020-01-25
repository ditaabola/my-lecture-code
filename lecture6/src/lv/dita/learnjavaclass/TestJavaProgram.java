package lv.dita.learnjavaclass;

public class TestJavaProgram {

	public static void main(String[] args) {
		Box boxObject = new Box(); // default constructor
		
		double volume;
		boxObject.width = 20.23;
		boxObject.height = 3.42;
		boxObject.depth = 15.2;
		double result = boxObject.getVolume();
		
		
	
//		Box boxObject2 = new Box();
//		System.out.println(boxObject2.width);
	}

}
