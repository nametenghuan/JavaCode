package main.java.niuke.lianbiao;

/**
 * 要尊重编程
 * 作者: 庞欢腾
 * 创建日期: 2023/4/27
 * 描述: JavaCode
 */
public class BM15删除有序链表中重复的元素1 {

    public static void main(String[] args) {

    }

    public static ListNode deleteDup(ListNode head) {
        ListNode ans = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return ans;
    }
}
