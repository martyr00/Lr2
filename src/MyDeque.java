public class MyDeque<T> {
	private Node<T> first;
	private Node<T> last;

	public boolean isEmpty() {
		return first == null;
	}

	public void addFirst(T element) {
		Node<T> temp = new Node<>(element);
		if (isEmpty()) {
			last = temp;
		} else {
			temp.setNext(first);
			first.setPrev(temp);
		}
		first = temp;
	}

	public void addLast(T element) {
		Node<T> temp = new Node<>(element);
		if (isEmpty()) {
			first = temp;
		} else {
			temp.setPrev(last);
			last.setNext(temp);
		}
		last = temp;
	}

	public T removeFirst() {
		if (isEmpty()) {
			return null;
		}
		Node<T> temp = first;
		first = first.getNext();
		if (first != null) {
			first.setPrev(null);
		} else {
			last = null;
		}
		return temp.getData();
	}

	public T removeLast() {
		if (isEmpty()) {
			return null;
		}
		Node<T> temp = last;
		last = last.getPrev();
		if (last != null) {
			last.setNext(null);
		} else {
			first = null;
		}
		return temp.getData();
	}

	private Node<T> find(T element) {
		if (isEmpty()) return null;
		Node<T> curr = first;
		while (curr != null) {
			if (curr.getData().equals(element)) {
				return curr;
			}
			curr = curr.getNext();
		}
		return null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node<T> curr = first;
		while (curr != null) {
			T data = curr.getData();
			sb.append(data);
			if (curr!=last) sb.append(", ");
			curr = curr.getNext();
		}
		sb.append("]");
		return sb.toString();
	}

	public void remove(T element) {
		if (isEmpty()) return;
		Node<T> forDelete = find(element);
		if (forDelete==null) return;
		Node<T> prev = forDelete.getPrev();
		Node<T> next = forDelete.getNext();
		if (prev == null) {
			first = next;
		}
		if (next == null) {
			last = prev;
		}
		if (prev!=null) prev.setNext(next);
		if (next!=null) next.setPrev(prev);
	}
}