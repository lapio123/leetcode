public class isParlindromeLinkedList {
    //234 Easy
    //运用O1的空间复杂度，真是烦的一批
    //具体做法为倒转数组
    public static boolean isPalindrome(ListNode head) {
        //首先移到末尾,并记录下移动次数
        int num_step=0;
        if(head.next==null)
            return true;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            num_step++;
        }
        temp = head;
        for(int i=0;i<(num_step/2 +1);i++)
        {
            temp = temp.next;
        }
        ListNode second_head = temp;
        ListNode prev =null;

        if(second_head.next!=null)
        {
            prev=second_head;
            second_head=second_head.next;
            prev.next=null;
            //Ok,现在我们已经布置好了基本条件，准备开造！
            while(second_head.next!=null)
            {
                temp = second_head;
                second_head=second_head.next;
                temp.next=prev;
                prev=temp;
            }
            second_head.next=prev;
        }
        //现在我们开始判断
        while(second_head.next!=null)
        {
            if(head.val!= second_head.val)
                return false;
            head=head.next;
            second_head=second_head.next;
        }
        if(second_head.val!=head.val)
            return false;
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next=new ListNode(5);
        System.out.println(isPalindrome(head));
    }
}
