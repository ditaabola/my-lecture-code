package lv.dita.inheritance;

public class Car {
	protected String carType; //protected aizies tikai uz child klasi, bet ne citam klasem package
	public void carRun (){
	System.out.println("Car makes life easy!");
	}
}
