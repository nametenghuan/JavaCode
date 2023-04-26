package main.java.niuke.lianbiao;

/**
 * 要尊重编程
 * 作者: 庞欢腾
 * 创建日期: 2023/4/26
 * 描述: JavaCode BM4合并两个排序的链表
 */
public class BM4合并两个排序的链表 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode head = l1;
        for (int i = 2; i < 3; i++) {
            ListNode node = new ListNode(i);
            l1.next = node;
            l1 = node;
        }

        ListNode l2 = new ListNode(14);
        ListNode head2 = l2;
        for (int i = 15; i < 17; i++) {
            ListNode node = new ListNode(i);
            l2.next = node;
            l2 = node;
        }

        ListNode merge = Merge(head, head2);
        while (merge != null) {
            System.out.print("  " + merge.val);
            merge = merge.next;
        }

    }

    /**
     * 递归解法
     */
    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }

    /**
     * 非递归解法
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge2(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode mergeHead = null;
        ListNode current = null;
        while(list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (mergeHead == null) {
                    mergeHead = current = list1;
                } else {
                    current.next = list1;
                    current = current.next;
                }
                list1 = list1.next;
            } else {
                if (mergeHead == null) {
                    mergeHead = current = list2;
                } else {
                    current.next = list2;
                    current = current.next;
                }
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            current.next = list2;
        } else {
            current.next = list1;
        }
        return mergeHead;
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
