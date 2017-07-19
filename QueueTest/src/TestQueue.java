import org.junit.Test;
import static org.junit.Assert.*;

public class TestQueue {

	@Test
	public void testCheckSizeOfEmptyQueueIsZero() {

		MyQueue queue = new MyQueue();

		assertEquals("Size of queue wrong", queue.sizeOfQueue(), 0);

	}

	@Test
	public void testAddToQueueCheckSize() {

		MyQueue queue = new MyQueue();

		queue.push("String");

		assertEquals("Size of queue wrong", queue.sizeOfQueue(), 1);

	}

	@Test
	public void testPushTwoItemsCheckSize() {

		MyQueue queue = new MyQueue();

		queue.push("String");
		queue.push("Second string");

		assertEquals("Size of queue is wrong", queue.sizeOfQueue(), 2);

	}

	@Test
	public void testPopCheckSizeIsZero() {
		MyQueue queue = new MyQueue();

		queue.pop();
		assertEquals("Size of queue is wrong", queue.sizeOfQueue(), 0);

	}

	@Test
	public void testPushPopCheckSizeIsZero() {
		MyQueue queue = new MyQueue();

		queue.push("String");
		queue.pop();
		assertEquals("Size of queue is wrong", queue.sizeOfQueue(), 0);

	}

	@Test
	public void testPushTwoPopOneCheckSizeIsOne() {
		MyQueue queue = new MyQueue();

		queue.push("StringOne");
		queue.push("StringTwo");
		queue.pop();

		assertEquals("Size of queue is wrong", queue.sizeOfQueue(), 1);

	}

	@Test
	public void testReturnPopFromQueue() {
		MyQueue queue = new MyQueue();

		queue.push("String");
		String message = queue.pop();

		assertEquals("Wrong message returned", message, "String");
	}

	@Test
	public void testPushTwoPopFirstFromQueue() {
		MyQueue queue = new MyQueue();

		queue.push("String");
		queue.push("is a string");

		String message = queue.pop();

		assertEquals("Wrong message returned", message, "String");
	}

	@Test
	public void testPushTwoPopBothFromQueue() {
		MyQueue queue = new MyQueue();

		queue.push("String");
		queue.push("is a string");

		String firstItem = queue.pop();
		String secondItem = queue.pop();

		assertEquals("Wrong message returned", firstItem, "String");
		assertEquals("Wrong message returned", secondItem, "is a string");
	}
}
