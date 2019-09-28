import java.util.EmptyStackException;
public class ListStack implements DStack {

ListStackNode head;
//creates head node

public ListStack() {
	//empty constructor
}

@Override
public boolean isEmpty() {
	boolean bool = false; //boolean initalizer
	
	if(head == null) {
		bool = true;
		//head is top, so if top is null then list empty
	}
	
	return bool;
}

@Override
public void push(double d) {
	ListStackNode ins_node = new ListStackNode(d);
	
	if(head == null) {
		head = ins_node;
		return;
		//if head is null, just make new node head 
	}
	
	ListStackNode currentHead = head;
	head = ins_node;
	ins_node.next = currentHead;
	//if stack not empty, then append new node to beginning of linked list
	
}

@Override
public double pop() {
	double rtrn_val = 0.0; //double initializer
	
	if(head == null) {
		throw new EmptyStackException();
		//if stack empty cant pop()
	}
	
	rtrn_val = head.value; //if stack not empty, head is the one deleted
	head = head.next; //deletes head, and returns value
	
	return rtrn_val;
}

@Override
public double peek() {
	double rtr_value = 0.0; //double initializer
	
	if(head == null) {
		throw new EmptyStackException();
		//if stack empty cant peek()
	}
	
	rtr_value = head.value; //if stack not empty, need value of head(top)
	
	return rtr_value;
}

public String toString() {
	String str = ""; //string initializer
	
	if(head == null) {
		return str;
		//if stack empty no string to return
	}
	
	ListStackNode current = head; //traverse linked list to get all values
	
	while(current != null) {
		
		if(current.next == null) {
			str = str + current.value;
			return str;
			//so that no empty space is on end of str
		}
		
		str = str + current.value + " ";
		current = current.next;
	}
	
	return str;
}


}
