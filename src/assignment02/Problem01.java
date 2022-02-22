package assignment02;

import java.util.HashMap;
import java.util.Map;

public class Problem01 {
	public  void Problem1(String[] d) {
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


}
