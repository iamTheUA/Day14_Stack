package Stack.Day14;

public class QueueList<T> {
	Node<T> head = new Node<>();
	Node<T> tail = new Node<>();
	int size;
	
	public void append(T data) {
		if(size>0) {
			Node <T> n = new Node<>();
			n.data=data;
			tail.next=n;
			tail=n;
		}
		else {
			head.data=data;
			tail=head;
		}
		size++;
	}
	
	public void show() {
		
		System.out.println();
		if(size>0) {
			Node<T> n = head;
			while(n.next!=null) {
				System.out.println(n.data);
				n=n.next;
			}
			System.out.println(n.data);
		}else {
			System.out.println("Empty Queue");
		}
	}
	
}
