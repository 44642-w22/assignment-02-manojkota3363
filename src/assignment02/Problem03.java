package assignment02;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem03 {
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


}
