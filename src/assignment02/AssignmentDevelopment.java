package assignment02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/**
 * 
 * @author Manoj Kota
 *
 */
public class AssignmentDevelopment {
	public static void Problem1(String[] d) {
		System.out.print("Input (S1): [");

		Map<String, Integer> m = Strings(d);
		int count = 0;
		for (int i = 0; i < d.length; i++) {
			count++;
			if (count != d.length)
				System.out.print("\"" + d[i] + "\",");
			else
				System.out.print("\"" + d[i] + "\"");
		}
		System.out.println("]");
		System.out.print("Output: ");
		count = 0;
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			count++;
			if (count != m.size()) {
				System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
			} else {
				System.out.print(entry.getKey() + "-" + entry.getValue());
			}
		}

		
	}
	public static Map<String, Integer> Strings(String[] input) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();

		for (int i = 0; i < input.length; i++) {
			m1.put(input[i], m1.getOrDefault(input[i], 0) + 1);
		}
		return m1;

	}
public static Map<Character,String> Problem2(String[] a) {
	ArrayList<String> b=new ArrayList<String>();
	Map<Character,String> m=new HashMap<Character,String>();

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
public static Set<Integer> Problem3(int[] st) {
	System.out.println("Input (A1): " + Arrays.toString(st));
	Set<Integer> set = new LinkedHashSet<>();
	for (int i = 0; i < st.length; i++) {
		int ele = st[i];
		while (set.contains(ele)) {
			ele++;
		}
		set.add(ele);
	}
return set;
}
public static ArrayList<String> Problem4(ArrayList<String> a) {
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
public static Map<String,String> Problem5(ArrayList<String> a) {
	Map<String,String> m=new HashMap<String,String>();

	int g=0;
	while(g<a.size()) {
		

	int l=a.get(g).length();
		String sf=""+a.get(g).charAt(0);
		String sl=""+a.get(g).charAt(l-1);

			m.put(sf,sl);
	g++;
	}
	//System.out.println(m);
	return m;
}
public static Map<String,Boolean> Problem6(ArrayList<String> a6) {
	System.out.print("Input (S1): [");
	int count = 0;
	for (int i = 0; i < a6.size(); i++) {
		count++;
		if (count != a6.size())
			System.out.print("\"" + a6.get(i) + "\",");
		else
			System.out.print("\"" + a6.get(i) + "\"");
	}
	System.out.println("]");
	Map<String, Boolean> map = new HashMap<>();
	for (int i = 0; i < a6.size(); i++) {
		if (map.containsKey(a6.get(i))) {
			map.put(a6.get(i), true);
		} else {
			map.put(a6.get(i), false);
		}
	}
	

	return map;

}

}
