package Silver;

import java.io.*;
import java.util.*;

public class S5_단어정렬 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		int N = Integer.parseInt(bf.readLine());
		ArrayList<String> arrayList = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			String word = bf.readLine();
			String same = word;
			
			if(!arrayList.contains(same)) {
				arrayList.add(same);		
			}	
		}
		
		arrayList.sort(new Comparator<String>() {
		    @Override
		    public int compare(String o1, String o2) {
		        if (o1.length() == o2.length()) {
		            return o1.compareTo(o2);
		        } else {
		            return Integer.compare(o1.length(), o2.length());
		        }
		    }
		});
		String str = String.join("\n", arrayList);
		System.out.println(str);
	}
}
