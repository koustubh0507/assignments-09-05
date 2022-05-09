package fourthproblem;

public class MainApp {
	public static void main(String[] args) {
		Fourth queue = new Fourth();
		queue.add(5);
		queue.add(10);
		queue.delete(0);
		// queue.peek(1);
		queue.addFirst(9);
		queue.addLast(7);
		queue.insert(1, 20);
		queue.print();
	}

}
