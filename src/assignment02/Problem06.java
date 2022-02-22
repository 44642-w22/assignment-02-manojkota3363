package assignment02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem06 {
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
