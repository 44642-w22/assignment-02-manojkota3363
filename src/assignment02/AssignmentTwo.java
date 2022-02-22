package assignment02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 * 
 * @author Manoj Kota
 *
 */

public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	Scanner sc=new Scanner(System.in);
	 System.out.println("Problem -1");
	 System.out.print("Enter size of String Array:- ");
		int n = sc.nextInt();
		String[] t = new String[n];


		for (int i = 0; i < n; i++) {
			System.out.println("Enter String--> "+(i+1));

			String s = sc.next();
			t[i] = s;

		}

Problem1(t);
System.out.println();
System.out.println("Problem -2");

System.out.print("Enter size of String Array: ");
int n1 = sc.nextInt();
String[] a = new String[n1];


for (int i = 0; i < n1; i++) {
	System.out.println("Enter values of Strings:a["+(i+1)+"]");

	String s = sc.next();
	a[i] = s;

}

System.out.println("Output (M1):"+Problem2(a));
System.out.println("Problem -3");
System.out.print("Enter size of integer array:");
int n31 = sc.nextInt();
int[] a31 = new int[n31];

for (int i = 0; i < n31; i++) {
	System.out.println("Enter a["+(i+1)+"]");

	int s = sc.nextInt();
	a31[i] = s;

}

/*c[1]=10;
c[2]=43;
c[3]=55;
c[4]=5;
c[5]=10;*/
System.out.println("Output (S):"+Problem3(a31));
System.out.println("Problem -4");
System.out.println("Enter size of array");
int g=sc.nextInt();
ArrayList<String> a1=new ArrayList<String>();
for(int i=0;i<g;i++) {
	System.out.println("Enter a1["+(i+1)+"]");

a1.add(sc.next());
}
System.out.println("Input (A1): "+a1);

System.out.println("Output (A2):"+Problem4(a1));
System.out.println("Problem -5");
System.out.println("Enter size of arrayList");

int n4=sc.nextInt();
ArrayList<String> a2=new ArrayList<String>();
for(int i=0;i<n4;i++) {
	System.out.println("Enter a2["+(i+1)+"]");

a2.add(sc.next());
}

/*a2.add("patterns");
a2.add("frameworks");
a2.add("manoj");*/
System.out.println("Input: "+a2);

System.out.println("Output:"+Problem5(a2));
System.out.println("Problem -6");

System.out.print("Enter size of String:- ");
int n7 = sc.nextInt();
ArrayList<String> a6 = new ArrayList<>();

for (int i = 0; i < n7; i++) {
	System.out.println("Enter values of Strings:a6["+(i+1)+"]");

	String ele = sc.next();
	a6.add(ele);

}
System.out.println("Output (M1): "+Problem6(a6));

}
	public static  void Problem1(String[] d) {
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
	public static Map<String, String> Problem2(String[] a) {
		ArrayList<String> b=new ArrayList<String>();
		//Map<Character,String> m=new HashMap<Character,String>();
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
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			String s = a[i];
			map.put(s.charAt(0) + "", map.getOrDefault(s.charAt(0) + "", "") + s);
		}
		
			return map;
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

