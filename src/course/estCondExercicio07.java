package course;

import java.util.Locale;
import java.util.Scanner;

public class estCondExercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.printf("Origem %n" );
			
		}else if (x == 0.0) {
			System.out.printf("Eixo Y %n");
			
		}else if (y == 0.0) {
			System.out.printf("Eixo X ");
			
		}else if (x > 0.0 && y > 0.0) {
			System.out.printf("Q1");
			
		}else if (x < 0.0 && y > 0.0) {
			System.out.printf("Q2");
			
		}else if (x < 0.0 && y < 0.0) {
			System.out.printf("Q3");
			
		}else {
			System.out.printf("Q4");
		}
		
		sc.close();
	}

}
