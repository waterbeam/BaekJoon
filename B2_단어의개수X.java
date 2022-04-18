package Bronze;

import java.io.*;
import java.util.*;

public class B2_단어의개수X{
	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<String> word = new ArrayList<>();
		String Q = bf.readLine().toUpperCase();
		
		word.add(Q);
		String str = String.join("", word);		
		str = str.trim();
		str = str.replaceAll("\"", "");
		str = str.replaceAll("\'", "");
		str = str.replaceAll("\\n", "");		
		String newStr = str.replaceAll("\\s+", " ");
		String[] ss = newStr.split("\\s");
		
		
		for(int i=0; i<ss.length; i++) {
				ss[i].replaceAll("\\s", "");
				ss[i].replaceAll("\\n", "");
		}
//		if (ss[0].charAt(0) >= 'A' && ss[ss.length-1].charAt(ss.length-1) <= 'Z') {
//			System.out.println("1");
//			bw.write(String.valueOf(ss.length));
//
//		} else {
//			System.out.println("2");
//			bw.write(String.valueOf(ss.length-1));
//		}
//		System.out.println(((Object)ss.length).getClass().getName());
//		System.out.println("as".getClass().getName());
		
		  bw.write(String.valueOf(ss.length));
		  bw.newLine();
		  bw.write(String.valueOf(((Object)ss.length).getClass().getName()));
		  
		  bw.flush();
          bw.close();
          
//		bw.flush();
//		bw.write(ss.length);
		
	}
}