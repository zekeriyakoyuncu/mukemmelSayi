package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 2;
		int total= 1;
		
		if(number <=1) {
			System.out.println("Geçersiz sayı girildi.");
		}
		else {
			for(int index = 2 ; index < number ; index++) {
				if(number%index ==0) {
					total += index;
				}
			}
			if(total == number) {
				System.out.println("Mükemmel sayıdır.");
			}
			else {
				System.out.println("Mükemmel sayı değildir.");
			}
		}
		
		

	}

}
