public class ReverseList {
    public static ListNode reverseList(ListNode head) {
        ListNode pre,cur,next;
        cur=head;
        pre=null;
        while (cur!=null)
        {
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
