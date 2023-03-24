public class Node<T> {
	private Object data;
	private Node<T> next = null;
	private Node<T> prev = null;

	public Node(T data) {
		this.data = data;
	}

	public Node(T data, Node<T> next, Node<T> prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public T getData() {
		return (T) data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}


}