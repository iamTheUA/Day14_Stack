package Stack.Day14;

public class Stack<T> {
	Node<T> head = new Node<>();
	int size=0;
	public void push(T data) {
		Node<T> n = new Node<>();
		if(size==0) {
			head.data=data;
		}
		else {
			n.data=data;
			n.next=head;
			head=n;
		}
		size++;
	}
	
	public void show(){
		if(size>0) {
			Node<T> n = head;
			while(n.next!=null) {
				System.out.println(n.data);
				n=n.next;
			}
			System.out.println(n.data);
		}
		else {
			System.out.println("Empty Stack!");
		}
	}
	
	public void peek() {
		if(size>0) {
			System.out.println(head.data);
		}else {
			System.out.println("Empty Stack!");
		}
	}
	
	public void pop() {
		if(size>0) {
		head=head.next;	
		}
	}
}
