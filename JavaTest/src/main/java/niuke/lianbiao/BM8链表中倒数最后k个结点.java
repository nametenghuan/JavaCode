package main.java.niuke.lianbiao;

/**
 * 要尊重编程
 * 作者: 庞欢腾
 * 创建日期: 2023/4/26
 * 描述: JavaCode
 * 准备一个快指针，从链表头开始，在链表上先走 k步。
 * 准备慢指针指向原始链表头，代表当前元素，则慢指针与快指针之间的距离一直都是 k。
 */
public class BM8链表中倒数最后k个结点 {
    public static void main(String[] args) {

    }

    public static ListNode FindKthToTail(ListNode pHead, int k) {
        // write code here
        if (pHead == null) {
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;

        // 快指针先走K步
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                // 如果快指针没有走完k步就已经为null则直接返回null
                return null;
            } else {
                fast = fast.next;
            }
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }


    public ListNode FindKthToTail2(ListNode pHead, int k) {
        int n = 0;
        ListNode fast = pHead;
        ListNode slow = pHead;
        //快指针先行k步
        for (int i = 0; i < k; i++) {
            if (fast != null)
                fast = fast.next;
                //达不到k步说明链表过短，没有倒数k
            else
                return slow = null;
        }
        //快慢指针同步，快指针先到底，慢指针指向倒数第k个
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
