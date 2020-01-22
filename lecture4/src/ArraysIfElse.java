
public class ArraysIfElse {

	public static void main(String[] args) {
		int[] number = {1, 2, 3, 4, 5, 6};
		int findeNumber =8; // skaitlis, kuru grib atrast
		int numberFind = 0; // tukss skaitlis
		for(int i = 0; i<number.length; i++){
			if(number[i] == findeNumber){
				numberFind = number[i]; // tukso skaitli aizvieto ar atrasto skaitli;
			}
		}
			if(numberFind == 1){
				System.out.println("ONE");
		}else if(numberFind == 2){
			System.out.println("TWO");
		}else if(numberFind == 3){
			System.out.println("THREE");
		}else if(numberFind == 4){
			System.out.println("FOUR");
		}else if(numberFind == 5){
			System.out.println("FIVE");

			}else{
			System.out.println("Does not match");
			}
	}
}
