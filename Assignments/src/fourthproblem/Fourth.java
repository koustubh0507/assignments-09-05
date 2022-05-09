package fourthproblem;

import java.util.ArrayList;

public class Fourth {
	static ArrayList<Integer> list = new ArrayList<>();

	public void add(int x) {
		list.add(x);
	}

	public void pop() {
		list.remove(list.size() - 1);
	}

	public int peek(int idx) {
		return list.get(idx);
	}

	public void print() {
		for (Integer ob : list) {
			System.out.print(ob + " ");
		}
	}

	public void delete(int idx) {
		list.remove(idx);
	}

	public void addFirst(int x) {
		list.add(0, x);
	}

	public void addLast(int x) {
		list.add(x);
	}

	public void insert(int idx, int value) {
		list.add(idx, value);
	}

}
