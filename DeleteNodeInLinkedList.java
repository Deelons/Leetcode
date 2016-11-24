public class DeleteNodeInLinkedList {
	public void delete(ListNode node) {
		if (node == null) {
			return;
		}
		node.val = node.next.val;
		node.next = node.next.next;
	}
}

class ListNode {
	int val;
	ListNode node;
	ListNode(int val) {this.val = val;}
}