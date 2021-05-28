package barn1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


/*
ID: zhenyu.2
LANG: JAVA
PROG: barn1
*/

public class barn1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("barn1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"barn1.out")),true);
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		int M = Integer.parseInt(st.nextToken());
		/*int S =*/ Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int[] stallNos = new int[C];
		for(int i = 0; i < stallNos.length; i++)
			{stallNos[i] = Integer.parseInt(in.readLine());}
				
		Arrays.sort(stallNos);
		
		int[] gaps = new int[C-1];
		for(int i = 0; i < gaps.length; i++)
			{gaps[i]= stallNos[i+1] - stallNos[i] - 1;}
		Arrays.sort(gaps);
		
		int index = gaps.length-1;
		index -= (M-1);
		System.out.println(index);
		
		int res = C;
		System.out.println(res);
		while(index >=0){
			res+= gaps[index];
			System.out.println(res);
			index --;
		}
		
		// output
		out.println(res);
		System.exit(0);
	}
}