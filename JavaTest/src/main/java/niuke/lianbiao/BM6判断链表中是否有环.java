package main.java.niuke.lianbiao;

/**
 * 要尊重编程
 * 作者: 庞欢腾
 * 创建日期: 2023/4/26
 * 描述: 快慢双指针
 */
public class BM6判断链表中是否有环 {
    public static void main(String[] args) {

    }


    public boolean hasCycle(ListNode head) {
        //先判断链表为空的情况
        if (head == null)
            return false;
        //快慢双指针
        ListNode fast = head;
        ListNode slow = head;
        //如果没环快指针会先到链表尾
        while (fast != null && fast.next != null) {
            //快指针移动两步
            fast = fast.next.next;
            //慢指针移动一步
            slow = slow.next;
            //相遇则有环
            if (fast == slow)
                return true;
        }
        //到末尾则没有环
        return false;
    }

    public static boolean hasCy(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
