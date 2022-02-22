package assignment02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * @author Manoj Kota
 *
 */

public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AssignmentDevelopment obj=new AssignmentDevelopment();
	Scanner sc=new Scanner(System.in);
	 System.out.println("Problem -1");
	 System.out.print("Enter size of String:- ");
		int n = sc.nextInt();
		String[] t = new String[n];


		for (int i = 0; i < n; i++) {
			System.out.println("Enter String--> "+(i+1));

			String s = sc.next();
			t[i] = s;

		}

obj.Problem1(t);
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

System.out.println(obj.Problem2(a));
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
System.out.println(obj.Problem3(a31));
System.out.println("Problem -4");
System.out.println("Enter size of array");
int g=sc.nextInt();
ArrayList<String> a1=new ArrayList<String>();
for(int i=0;i<g;i++) {
	System.out.println("Enter a1["+(i+1)+"]");

a1.add(sc.next());
}
System.out.println(obj.Problem4(a1));
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
System.out.println(obj.Problem5(a2));
System.out.println("Problem -6");

System.out.print("Enter size of String:- ");
int n7 = sc.nextInt();
ArrayList<String> a6 = new ArrayList<>();

for (int i = 0; i < n7; i++) {
	System.out.println("Enter values of Strings:a6["+(i+1)+"]");

	String ele = sc.next();
	a6.add(ele);

}
System.out.println(obj.Problem6(a6));

}

}

