package Bronze;

import java.util.Scanner;

public class B3_분산처리 {

	public static void main(String[] args) {
		int i;
				
		int[] zero = {10, 10, 10, 10};
		int[] one = {1, 1, 1, 1};
		int[] two = {6, 2, 4, 8};
		int[] three = {1, 3, 9, 7};
		int[] four = {6, 4, 6, 4};
		int[] five = {5, 5, 5, 5};
		int[] six = {6, 6, 6, 6};
		int[] seven = {1, 7, 9, 3};
		int[] eight = {6, 8, 4, 2};
		int[] nine = {1, 9, 1, 9};
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] answer = new int[T];
		
		for(i=0; i<T; i++) {			
			
			double a = sc.nextDouble();
			a = (int)a%10;
			int b = sc.nextInt();
			
			int bf = (b%4);
			
			switch((int)a) {
				case 0: answer[i] = zero[b%4];
					break;
				case 1: answer[i] = one[bf];
					break;
				case 2: answer[i] = two[bf];
					break;
				case 3: answer[i] = three[bf];
					break;
				case 4: answer[i] = four[bf];
					break;
				case 5: answer[i] = five[bf];
					break;
				case 6: answer[i] = six[bf];
					break;
				case 7: answer[i] = seven[bf];
					break;
				case 8: answer[i] = eight[bf];
					break;
				case 9: answer[i] = nine[bf];
					break;
			}
			
		}
		for(i=0; i<T; i++) {
			System.out.println(answer[i]);
		}
	}

}
