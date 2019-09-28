
public class ListStackNode {
	
	double value;
	ListStackNode next;
	//variables stored in ListStackNode
	
	public ListStackNode() {
		//empty constructor
	}
	
	public ListStackNode(double val) {
		this.value = val;
		//constructor that sets value
	}
	
	public ListStackNode(double val, ListStackNode nxt) {
		this.value = val;
		this.next = nxt;
		//constructor that sets both value and .next
	}

}
