package assignment02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem05 {
	public  Map<String,String> Problem5(ArrayList<String> a) {
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


}
