# URL: https://www.geeksforgeeks.org/problems/flattening-a-linked-list/1
#
# Problem: Flattening a Linked List
#
# Time Complexity: O(n  *  n  *  m)Auxiliary Space: O(n)

# Solution:
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
        {
            if(ptr1.data<ptr2.data)
            {

               curr.bottom=ptr1;
               ptr1=ptr1.bottom;


            }
            else{
                curr.bottom=ptr2;
               ptr2=ptr2.bottom;
            }
            curr=curr.bottom;
        }
        if(ptr1!=null)
        {
            curr.bottom=ptr1;
        }
        else
        {
            curr.bottom=ptr2;
        }

        return dummy.bottom;

    }
}