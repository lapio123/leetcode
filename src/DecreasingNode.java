public class DecreasingNode {
    static class Node
    {
        int val;
        Node next;
    }
    public static Node decreasingOrder(Node head)
    {
        if(head==null);
        Node right = head;
        Node left = head;
        Node gleft=head;
        Node prev=null;
        int cur=0;
        int max =0;
        while(right!=null)
        {
            cur++;
            if(prev!=null&&prev.val<right.val)
            {
                left = right;
                cur=1;
            }
            if(cur>max)
            {
                gleft=left;
                max=cur;
            }
            prev=right;
            right=right.next;

        }
        Node temp = gleft;
        for(int i=0;i<max-1;i++)
        {
            temp=temp.next;
        }
        temp.next=null;
        System.out.println("Max"+max);
        return gleft;
    }
    public static void main(String[] args) {
        Node n = new Node();
        Node n1 = n;
        for(int i=5;i>0;i--)
        {
            n1.val = i;
            n1.next=new Node();
            n1=n1.next;
        }
        n1.val = 4;
        for(int i=6;i>0;i--)
        {
            n1.val = i;
            n1.next=new Node();
            n1=n1.next;
        }
        n1.val = 4;
        Node res= decreasingOrder(n);
        while(res!=null)
        {
            System.out.println(res.val);
            res=res.next;
        }
    }
}
