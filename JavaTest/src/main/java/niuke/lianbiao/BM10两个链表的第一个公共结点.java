package main.java.niuke.lianbiao;

/**
 * 要尊重编程
 * 作者: 庞欢腾
 * 创建日期: 2023/4/26
 * 描述: JavaCode
 */
public class BM10两个链表的第一个公共结点 {
    public static void main(String[] args) {

    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while (l1 != l2) {
            l1 = (l1 == null) ? l2 : l1.next;
            l2 = (l2 == null) ? l1 : l2.next;
        }
        return l1;
    }

}
