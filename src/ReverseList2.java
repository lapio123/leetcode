
public class ReverseList2 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(right==left)
            return head;
        ListNode pre = null;
        ListNode cur =head;
        ListNode temp1,temp2;
        temp2=head;
        for(int i=1;i<=right;i++)
        {
            temp2=temp2.next;

        }
        for (int i=1;i<left;i++)
        {
            pre=cur;
            cur=cur.next;
        }
        temp1 = pre;
        pre=temp2;
        for (int i=left;i<=right;i++)
        {
            ListNode next= cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;

        }
        if(temp1!=null)
            temp1.next=pre;
        else
            head=pre;
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode head =n1;
        n1.next=new ListNode(2);
//        for (int i=2;i<=5;i++)
//        {
//
//            n1.next=new ListNode(i);
//            n1=n1.next;
//        }
        reverseBetween(head,1,2);
    }
}
