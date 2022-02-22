package assignment02;

import java.util.ArrayList;

public class Problem04 {
	public  ArrayList<String> Problem4(ArrayList<String> a) {
		ArrayList<String> a1=new ArrayList<String>();

		ArrayList<Character> c=new ArrayList<Character>();
		ArrayList<Character> b=new ArrayList<Character>();
		int g=0;
		String s="";
		while(g<a.size()) {
			
		for(int i=0;i<a.get(g).length();i++) {
			c.add(a.get(g).charAt(i));
		}
		//c.clear();
		//System.out.println(c);
		for(int i=0;i<a.get(g).length();i++) {
			if(b.contains(c.get(i))) {
				
			}else {
				b.add(c.get(i));
			}
			
			}
		//System.out.println(b);
		for(int i=0;i<b.size();i++) {
			s=s+b.get(i);
		}
		//System.out.println(s);
		a1.add(s);
		s="";
		g++;
		b.clear();
		c.clear();
			}


		return a1;

	}


}
