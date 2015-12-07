package Colectii;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class ColectiiMainApp {
	public static void main(String[] args) {

		List<RandomNumber> list1 = new ArrayList<>();
		fillColection(1000, list1);
		System.out.println(list1);

		Collections.sort(list1);
		// Collections.sort(list1, new NameComparator());
		System.out.println(list1);
		TreeSet<RandomNumber> tree = new TreeSet<>();
		tree.addAll(list1);
		System.out.println(tree);

		Map<Integer, RandomNumber> map1 = new HashMap<>();
		fillMap(1000, map1);
		System.out.println(map1);

	}

	static void fillColection(int count, Collection<RandomNumber> list) {

		for (int i = 0; i < count; i++) {
			list.add(new RandomNumber(count));

		}
	}

	static void fillMap(int count, Map<Integer, RandomNumber> map) {
		for (int i = 0; i < count; i++) {
			map.put(i, new RandomNumber(count));

		}
	}
}
