/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
    	Deque<Integer> deque = new LinkedList<Integer>();
    	while(head != null){
    		deque.addFirst(head.val);
    		head = head.next;
    	}
    	int [] result = new int[deque.size()];
    	for (int i = 0; i < deque.size(); i++) {
    		result[i] = deque.removeFirst();
    	}
    	return result;
    }
}