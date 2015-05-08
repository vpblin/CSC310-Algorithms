package MinimumSpanningTree;

public class que {
	public Edge[] queArray;
	public int size;

	public que() {
		queArray = new Edge[20];
		size = 0;
	}

	public Edge removeMin() {
		for (int i = 0; i < queArray.length; i++) {
			if (queArray[i] != null && queArray[i].getD() == i) {
				size--;
				Edge temp = queArray[i];
				queArray[i] = null;
				return temp;
			}
		}
		return queArray[--size];
	}

	public void remove(int n) {
		for (int j = n; j < size - 1; j++)
			queArray[j] = queArray[j + 1];
		size--;
	}

	public Edge peekMin() {
		return queArray[size - 1];
	}

	public Edge peek(int n) {
		return queArray[n];
	}

	public int find(int findDex) {
		for (int j = 0; j < size; j++)
			if (queArray[j].getDestination() == findDex)
				return j;
		return -1;
	}

	public void insert(Edge ed) {
		int j;
		for (j = 0; j < size; j++) {
			if (ed.getDestination() >= queArray[j].getDestination()) {
				break;
			}
		}
		for (int k = size - 1; k >= j; k--) {
			queArray[k + 1] = queArray[k];
		}
		queArray[j] = ed;
		size++;
	}

}
