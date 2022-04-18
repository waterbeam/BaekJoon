package Bronze;
import java.io.*;
import java.util.*;

public class B1_최고글자수{
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 0;
		String ans = "";

		String Q = bf.readLine().toUpperCase();
		String[] str = Q.split("");
		
		ArrayList<String> arrayList = new ArrayList<>();
        for(String same : str){
            if(!arrayList.contains(same))
            arrayList.add(same);
        }  

		List<String> word = new ArrayList<>();
			word.add(Q);

		ArrayList<Integer> cnt = new ArrayList<>();

		for(int i=0; i<arrayList.size(); i++) {
			for(int j=0; j<str.length; j++) {
				if(arrayList.get(i).equals(str[j])) {	
					count++;
					str[j].replace(str[j], "1");	
				}
			}
			cnt.add(count);
			count = 0;
		}
		int max = 0;
		int maxIndex = 0;

		for(int i=0; i<cnt.size(); i++) {
			maxIndex = (cnt.get(i) > max) ? maxIndex = i: maxIndex;
			max = (cnt.get(i) > max) ? max = cnt.get(i) : max; 
		}

		for (int i=0; i<cnt.size(); i++) {
			if (true) {
				if(cnt.lastIndexOf(max) != cnt.indexOf(max)) {
					ans = "?";
				}else {
					ans = arrayList.get(maxIndex);
				}
			}
		}
		bw.write(ans);
		bw.flush();
		bw.close();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
//import java.io.IOException;
//
//public class Main {
//
//	public static void main(String[] args) throws IOException {
//		int str = System.in.read(); // 문자열만 입력 받기에 간소화 가능 : 출력부분에서만 캐스팅
//		
//		int[] arr = new int[26]; // 알파벳의 개수 26개
//		
//		while(str >= 'A') {
//			if(str <= 'Z') { // 대문자 범위
//				arr[str - 'A']++;
//			} else { // 소문자 범위
//				arr[str - 'a']++;
//			}
//			str = System.in.read();
//		}
//		
//		int max = 0;
//		int ch = '?' - 'A';
//		
//		for(int i=0; i<26; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//				ch = i;
//			} else if(arr[i] == max) {
//				ch = '?' - 'A';
//			}
//		} 
//		
//		System.out.print((char)(ch + 'A'));
//
//	}
//
//}
