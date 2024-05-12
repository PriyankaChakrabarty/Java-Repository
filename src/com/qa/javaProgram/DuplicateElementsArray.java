package com.qa.javaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		String namesList[] = { "Java", "Selenium", "Python", "Postman", "Java", "Ruby", "Selenium" };

		// 1st Solution--time complexity is o(n*n)
		for (int i = 0; i < namesList.length; i++) {
			for (int j = i + 1; j < namesList.length; j++) {
				if (namesList[i].equals(namesList[j])) {
					System.out.println("Duplicate element is:" + namesList[i]);
				}
			}
		}

		System.out.println("******");

		// 2nd Solution
		Set<String> nameStore = new HashSet<String>();
		for (String name : namesList) {
			if (nameStore.add(name) == false) {
				System.out.println("Duplicate element is:" + name);
			}
		}

		System.out.println("******");
		// 3rd Solution
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String name : namesList) {
			if (storeMap.containsKey(name)) {
				storeMap.put(name, storeMap.get(name) + 1);
			} else {
				storeMap.put(name, 1);
			}
		}
		Set<Map.Entry<String, Integer>> entry = storeMap.entrySet();
		for (Map.Entry<String, Integer> entryName : entry) {
			if (entryName.getValue() > 1) {
				System.out.println(entryName.getKey() + ":" + entryName.getValue());
			}
		}
	}

}
