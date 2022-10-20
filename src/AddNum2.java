public class AddNum2 {
    public ListNode addTwoNumbers_inside(ListNode l1, ListNode l2) {
        ListNode total=null;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int carry=0;
        int temp=0;
        ListNode head=null;
        while(cur1!=null||cur2!=null)
        {
            if(cur1==null)
            {
                temp = cur2.val+carry;
                if(temp>=10)
                {
                    temp=temp-10;
                    carry=1;
                }
                else
                {
                    carry=0;
                }
                if(total==null)
                {
                    total = new ListNode(temp);
                    head = total;
                }
                else
                {
                    total.next = new ListNode(temp);
                    total = total.next;
                }
                cur2=cur2.next;

            }
            else if(cur2==null)
            {
                temp = cur1.val+carry;
                if(temp>=10)
                {
                    temp=temp-10;
                    carry=1;
                }
                else
                {
                    carry=0;
                }
                if(total==null)
                {
                    total = new ListNode(temp);
                    head = total;
                }
                else
                {
                    total.next = new ListNode(temp);
                    total = total.next;
                }
                cur1=cur1.next;
            }
            else
            {
                temp = cur2.val+carry+cur1.val;
                if(temp>=10)
                {
                    temp=temp-10;
                    carry=1;
                }
                else
                {
                    carry=0;
                }
                if(total==null)
                {
                    total = new ListNode(temp);
                    head = total;
                }
                else
                {
                    total.next = new ListNode(temp);
                    total = total.next;
                }
                cur1=cur1.next;
                cur2=cur2.next;
            }

        }
        if(carry==1)
        {

            if(total==null)
            {
                total = new ListNode(1);
                head = total;
            }
            else
            {
                total.next = new ListNode(1);
                total = total.next;
            }
        }
        return head;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nl1= ReverseList.reverseList(l1);
        ListNode nl2= ReverseList.reverseList(l2);
        ListNode total=addTwoNumbers_inside(nl1,nl2);
        ListNode res = ReverseList.reverseList(total);
        return res;
    }
}
