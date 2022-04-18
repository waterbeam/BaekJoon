package Bronze;

import java.io.*;
import java.util.*;

public class B1_평균심화{
	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(bf.readLine());
		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		
		double max = 0;
		double total = 0;
		ArrayList<Double> score = new ArrayList<>();
		
		double sub = Double.parseDouble(st1.nextToken());
		
		for(int i=0; i<sub; i++) {
			score.add(Double.parseDouble(st2.nextToken()));
			max = max > score.get(i) ? max : score.get(i);			
		}
		for(int i=0; i<sub; i++) {
			total += score.get(i)/max*100;
		}
		System.out.println(total/sub);
	}
}
