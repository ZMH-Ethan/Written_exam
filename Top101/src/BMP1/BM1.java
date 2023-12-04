package BMP1;

class ListNode1 {
    int val;
    ListNode1 next = null;
    public ListNode1(int val) {
      this.val = val;
    }
 }

public class BM1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param head ListNode类 
     * @return ListNode类
     */
    public ListNode1 ReverseList (ListNode1 head) {
        // write code here
        ListNode1 newHead = null;
        while (head != null) {
            ListNode1 temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }
}