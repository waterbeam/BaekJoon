package Bronze;
import java.util.Scanner;

public class B3_별찍기2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for(int i=N-1; i>-1; i--) {
			for(int j=0; j<i; j++) {
				sb.append(" ");
			}
			for(int j=N; j>i; j--) {
				sb.append("*");
			}
			 sb.append("\n");
		}
		System.out.print(sb);
	}
}