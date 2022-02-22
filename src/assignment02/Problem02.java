package assignment02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem02 {
	public  Map<Character,String> Problem2(String[] a) {
		ArrayList<String> b=new ArrayList<String>();
		Map<Character,String> m=new HashMap<Character,String>();
		System.out.print("Input (S1): [");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count++;
			if (count != a.length)
				System.out.print("\"" + a[i] + "\",");
			else
				System.out.print("\"" + a[i] + "\"");
		}
		System.out.println("]");
		
		for(int i=0;i<a.length;i++) {
			b.add(a[i]);
		}
		int l=b.size()-1;
		//.out.println("Problem -2"+b);
		Collections.sort(b);
		
		int s=b.size()/2;
		if(b.size()%2==0) {
		//m.put(b.get(0).charAt(0), null)
		String sum="";
		for(int i=0;i<s;i++) {
			char key=b.get(0).charAt(0);
			sum+=b.get(i);
			m.put(key,sum);

		}
		sum="";
		for(int i=s;i<b.size();i++) {
			char key=b.get(s).charAt(0);
			sum+=b.get(i);
			m.put(key,sum);

		}
		}else {
			String sum="";
			for(int i=0;i<s;i++) {
				char key=b.get(0).charAt(0);
				sum+=b.get(i);
				m.put(key,sum);
		
			}
			sum="";
			for(int i=s;i<b.size();i++) {
				char key=b.get(s).charAt(0);
				sum+=b.get(i);
				m.put(key,sum);
		    char c=b.get(l).charAt(0);
			m.put(c,c+"");
	}

		}
	return m;
	}


}
