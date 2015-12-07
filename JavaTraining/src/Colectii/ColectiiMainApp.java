package Colectii;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ColectiiMainApp {
	public static void main(String[] args) {

		List<RandomNumber> list1 = new ArrayList<>();
		fillColection(100, list1);
		System.out.println(list1);
		// for (RandomNumber randomNumber : list1) {
		// System.out.println(randomNumber);
		// }
		Iterator i = list1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		Collection<RandomNumber> list3 = Collections.synchronizedCollection(list1);
		Thread T = new Thread(new Runnable() {

			@Override
			public void run() {
				list3.add(new RandomNumber(500));
			}
		});
		synchronized (list3) {
			for (RandomNumber randomNumber : list3) {
				System.out.println(randomNumber);
			}

		}
		// Collections.sort(list1);
		// // Collections.sort(list1, new NameComparator());
		// System.out.println(list1);
		// TreeSet<RandomNumber> tree = new TreeSet<>();
		// tree.addAll(list1);
		// System.out.println(tree);
		//
		// RandomNumber instance = new RandomNumber(1000);
		// int index = Collections.binarySearch(list1, instance);
		// System.out.println("instance = " + instance + " index = " + index);
		//
		Map<Integer, RandomNumber> map1 = new HashMap<>();
		fillMap(10000000, map1);
		// System.out.println(map1);

		// List<RandomNumber> list2 = new LinkedList<>();
		// fillColection(100000, list2);

		// long startTime = System.currentTimeMillis();
		// list1.get(75420);
		// list1.add(75420, new RandomNumber(500));
		// list1.remove(75420);
		//
		// long endTime = System.currentTimeMillis();
		// System.out.println("retrieve index 75420 from Array List: " +
		// (endTime - startTime));
		//
		// startTime = System.currentTimeMillis();
		// list2.get(75420);
		// list2.add(75420, new RandomNumber(500));
		// list2.remove(75420);
		// endTime = System.currentTimeMillis();
		// System.out.println("retrieve index 75420 from Array List: " +
		// (endTime - startTime));

		// long startTime = System.currentTimeMillis();
		// System.out.println("Key 7542200 : " + map1.get(7542200));
		// long endTime = System.currentTimeMillis();
		// System.out.println(startTime - endTime);
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
