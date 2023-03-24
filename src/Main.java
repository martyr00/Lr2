import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	private void run() {
		Scanner sc = new Scanner(System.in);
		MyDeque<String> deque = new MyDeque<>();

		while (true) {
			System.out.println("\nМеню:");
			System.out.println("1 - Add at front");
			System.out.println("2 - Add at end");
			System.out.println("3 - remove element from front");
			System.out.println("4 - remove element from end");
			System.out.println("5 - print");
			System.out.println("6 - remove");
			System.out.println("7 - clear");
			System.out.println("9 - exit");
			System.out.print("Enter number of choice: ");

			int choice = sc.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter the element to add to the front: ");
					String elementToAddAtFront = sc.next();
					deque.addFirst(elementToAddAtFront);
					break;
				case 2:
					System.out.print("Enter the element to add to the end: ");
					String elementToAddAtEnd = sc.next();
					deque.addLast(elementToAddAtEnd);
					break;
				case 3:
					String removedElementFromFront = deque.removeFirst();
					if (removedElementFromFront != null) {
						System.out.println("Success");
					} else {
						System.out.println("is empty");
					}
					break;
				case 4:
					String removedElementFromEnd = deque.removeLast();
					if (removedElementFromEnd != null) {
						System.out.println("Success");
					} else {
						System.out.println("is empty");
					}
					break;
				case 5:
					if (deque.isEmpty()) {
						System.out.println("is empty");
					} else {
						System.out.println(deque);
					}
					break;
				case 6:
					System.out.print("Enter the index of item for removing");
					String indexToRemove = sc.next();
					if (deque.isEmpty()) {
						System.out.println("is empty");
					} else {
						deque.remove(indexToRemove);
					}
					break;
				default:
					System.exit(0);
			}
		}
	}
}