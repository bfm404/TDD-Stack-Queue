import java.util.ArrayList;

public class MyQueue {

	int count = 0;
	ArrayList<String> queue = new ArrayList<String>();

	public int sizeOfQueue() {
		return queue.size();
	}

	public void push(String string) {
		queue.add(string);

	}

	public String pop() {
		if (queue.size() > 0) {
			String formerHead = queue.get(0);
			queue.remove(0);
			return formerHead;
		} else {
			return "";
		}
	}

}
