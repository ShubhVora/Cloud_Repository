package com.techlabs.Map_Object;

import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String args[]) {
		HashMapClass hmc = new HashMapClass();
		LinkedHashMapClass lhmc = new LinkedHashMapClass();
		TreeMapClass tmc = new TreeMapClass();

		case1(hmc);

		case2(lhmc);

		case3(tmc);

	}

	private static void case3(TreeMapClass tmc) {
		Student student9 = new Student("shubham", 12);
		Student student10 = new Student("varshil", 15);
		Student student11 = new Student("manoj", 10);
		Student student12 = new Student("ABC", 16);

		tmc.add(9, student9);
		tmc.add(10, student10);
		tmc.add(11, student11);

		System.out.println("The students in the hashSet are:");
		display(tmc.getTreeMapList());

		if (tmc.search(10)) {
			System.out.println("Searched Object is present");
		} else {
			System.out.println("Searched Object is not present");
		}

		if (tmc.delete(10)) {
			System.out.println("Object is removed successfully");
		} else {
			System.out.println("Object is not present");
		}

		if (tmc.update(11, student11, student12)) {
			System.out.println("Updated Successfully");
		} else {
			System.out.println("Updation Failed");
		}

		System.out.println("The students in the hashSet are:");
		display(tmc.getTreeMapList());
	}

	private static void case2(LinkedHashMapClass lhmc) {
		Student student5 = new Student("shubham", 12);
		Student student6 = new Student("varshil", 15);
		Student student7 = new Student("manoj", 10);
		Student student8 = new Student("ABC", 16);

		lhmc.add(5, student5);
		lhmc.add(6, student6);
		lhmc.add(7, student7);

		System.out.println("The students in the hashSet are:");
		display(lhmc.getLinkedHashMapList());

		if (lhmc.search(5)) {
			System.out.println("Searched Object is present");
		} else {
			System.out.println("Searched Object is not present");
		}

		if (lhmc.delete(6)) {
			System.out.println("Object is removed successfully");
		} else {
			System.out.println("Object is not present");
		}

		if (lhmc.update(7, student7, student8)) {
			System.out.println("Updated Successfully");
		} else {
			System.out.println("Updation Failed");
		}

		System.out.println("The students in the hashSet are:");
		display(lhmc.getLinkedHashMapList());
	}

	private static void case1(HashMapClass hmc) {
		Student student1 = new Student("shubham", 12);
		Student student2 = new Student("varshil", 15);
		Student student3 = new Student("manoj", 10);
		Student student4 = new Student("ABC", 16);

		hmc.add(1, student1);
		hmc.add(2, student2);
		hmc.add(3, student3);

		System.out.println("The students in the hashSet are:");
		display(hmc.getHashMapList());

		if (hmc.search(2)) {
			System.out.println("Searched Object is present");
		} else {
			System.out.println("Searched Object is not present");
		}

		if (hmc.delete(2)) {
			System.out.println("Object is removed successfully");
		} else {
			System.out.println("Object is not present");
		}

		if (hmc.update(3, student3, student4)) {
			System.out.println("Updated Successfully");
		} else {
			System.out.println("Updation Failed");
		}

		System.out.println("The students in the hashSet are:");
		display(hmc.getHashMapList());
	}

	static void display(Map<Integer, Student> sets) {
		for (Map.Entry<Integer, Student> entry : sets.entrySet()) {
			int key = entry.getKey();
			Student s = entry.getValue();
			System.out.println(s.getId() + " " + s.getName());
		}
	}

}
