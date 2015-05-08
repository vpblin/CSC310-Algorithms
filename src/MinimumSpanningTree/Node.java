package MinimumSpanningTree;

public class Node<T> {
	public char label;
	public boolean isInTree;
	private T element;
	private Node<T> next;

	public Node(char lab) {
		label = lab;
		isInTree = false;
	}

	public Node(T element, Node<T> next) {
		super();
		this.element = element;
		this.next = next;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public char getName() {
		return this.label;
	}

	public char getLabel() {
		return label;
	}

	public void setLabel(char label) {
		this.label = label;
	}

	public boolean isInTree() {
		return isInTree;
	}

	public void setInTree(boolean isInTree) {
		this.isInTree = isInTree;
	}
}
