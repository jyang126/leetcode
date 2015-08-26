public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null)
            return l2;
        if (l2==null)
            return l1;
        ListNode dummy = new ListNode(0);
        ListNode p=dummy;
        int carry=0;
        while (l1!=null || l2!=null || carry!=0) {
            int result=0;
            result+=carry;
            if (l1!=null) {
                result+=l1.val;
                l1=l1.next;
            }
            if (l2!=null) {
                result+=l2.val;
                l2=l2.next;
            }
            carry=result/10;
            result=result%10;
            p.next=new ListNode(result);
            p=p.next;
        }
        return dummy.next;
    }
}
