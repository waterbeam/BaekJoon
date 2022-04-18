package Bronze;
import java.io.*;
public class B5_검증수{
	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int result = 0;

		String[] str = bf.readLine().split("\\s");

		for(int i=0; i<str.length; i++) {
			result += Integer.parseInt(str[i]) * Integer.parseInt(str[i]);
		}
		
		System.out.println(result%10);
	}
}