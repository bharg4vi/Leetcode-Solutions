class Solution {
   public ListNode middleNode(ListNode head) {
    
	ListNode node1 = head;
    ListNode node2 = head;
    while(node2.next!=null) {
    	node2 = node2.next;
    	node1 = node1.next;
    	if(node2.next!=null) {
    		node2 = node2.next;
    	}
    }
    
    return node1;
}
}
