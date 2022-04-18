package Bronze;
import java.io.*;

public class B1_대칭수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String ans = null;
		while(true) {    	
			int count = 0;
			String N = bf.readLine();
			
			if(N.length() == 1 && !N.equals("0")) {
				ans = "yes";
			}else if(N.length()>1) {
				for(int i=0; i<N.length()/2; i++) {
					if(N.charAt(i) == N.charAt(N.length()-1-i)) {
						count++;
					}
				}
				if(count == N.length()/2) {
					ans = "yes";
				}else {
					ans = "no";					
				}					
			}else {
				break;				
			}		
	    	bw.write(ans);
	    	bw.newLine();
		}
		bw.close();
	}
}