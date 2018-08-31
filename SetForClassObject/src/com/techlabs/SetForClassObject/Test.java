package com.techlabs.SetForClassObject;

import java.util.Set;

public class Test {
	public static void main(String args[]) {
		HashSetClass hs = new HashSetClass();
		TreeSetClass ts = new TreeSetClass();
		LinkedHashSetClass lhs = new LinkedHashSetClass();

		case1(hs);

		case2(lhs);

		case3(ts);

	}

	private static void case1(HashSetClass hs) {
		Student student1 = new Student("shubham", 12);
		Student student2 = new Student("varshil", 15);
		Student student3 = new Student("manoj", 10);

		hs.add(student1);
		hs.add(student2);
		hs.add(student3);

		System.out.println("The students in the hashSet are:");
		display(hs.getHashSetList());

		if (hs.search(student2)) {
			System.out.println("Searched Object is present");
		} else {
			System.out.println("Searched Object is not present");
		}

		if (hs.delete(student3)) {
			System.out.println("Object is removed successfully");
		} else {
			System.out.println("Object is not present");
		}

		if (hs.update("ABC", student1)) {
			System.out.println("Updated Successfully");
		} else {
			System.out.println("Updation Failed");
		}

		System.out.println("The students in the hashSet are:");
		display(hs.getHashSetList());
	}

	private static void case2(LinkedHashSetClass lhs) {
		Student student4 = new Student("shubham", 12);
		Student student5 = new Student("varshil", 15);
		Student student6 = new Student("manoj", 10);

		lhs.add(student4);
		lhs.add(student5);
		lhs.add(student6);

		System.out.println("\n\nThe students in the LinkedhashSet are:");
		display(lhs.getHashSetList());

		if (lhs.search(student6)) {
			System.out.println("Searched Object is present");
		} else {
			System.out.println("Searched Object is not present");
		}

		if (lhs.delete(student5)) {
			System.out.println("Object is removed successfully");
		} else {
			System.out.println("Object is not present");
		}

		if (lhs.update("ABC", student6)) {
			System.out.println("Updated Successfully");
		} else {
			System.out.println("Updation Failed");
		}

		System.out.println("The students in the LinkedhashSet are:");
		display(lhs.getHashSetList());
	}

	private static void case3(TreeSetClass ts) {
		Student student7 = new Student("shubham", 12);
		Student student8 = new Student("varshil", 15);
		Student student9 = new Student("manoj", 10);

		ts.add(student7);
		ts.add(student8);
		ts.add(student9);

		System.out.println("\n\nThe students in the TreeSet are:");
		display(ts.getTreeSet());

		if (ts.search(student7)) {
			System.out.println("Searched Object is present");
		} else {
			System.out.println("Searched Object is not present");
		}

		if (ts.delete(student8)) {
			System.out.println("Object is removed successfully");
		} else {
			System.out.println("Object is not present");
		}

		if (ts.update("ABC", student7)) {
			System.out.println("Updated Successfully");
		} else {
			System.out.println("Updation Failed");
		}

		System.out.println("The students in the TreeSet are:");
		display(ts.getTreeSet());
	}

	static void display(Set<Student> sets) {
		for (Student temp : sets) {
			System.out.print(temp.getName() + "\t");
			System.out.print(temp.getId() + "\t\n");

		}
	}
}
