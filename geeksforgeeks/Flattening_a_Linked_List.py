# URL: https://www.geeksforgeeks.org/problems/flattening-a-linked-list/1
#
# Problem: Flattening a Linked List
#
# Time Complexity: O(n  *  n  *  m)Auxiliary Space: O(n)

# Solution:
Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
        if(node==null||node.next==null)
        return node;
        Node temp=node;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        //merge the last node and bottom of previous node
       Node mergedList=  mergeList(temp.bottom,temp.next);




       temp.bottom=mergedList;
       temp.next=null;
       return flatten(node);
    }
     public Node mergeList(Node head1,Node head2)
    {
        if(head1==null)
        return head2;
        if(head2==null)
        return head1;

        Node dummy=new Node(-1);
        Node curr=dummy;
        Node ptr1=head1;
        Node ptr2=head2;
        while(ptr1!=null&&ptr2!=null)