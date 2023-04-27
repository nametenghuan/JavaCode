package main.java.niuke.lianbiao;

import java.util.*;

/**
 * 要尊重编程
 * 作者: 庞欢腾
 * 创建日期: 2023/4/26
 * 描述: JavaCode
 */
public class BM13判断一个链表是否为回文结构 {

    public static void main(String[] args) {
        ListNode h1 = new ListNode(-1231);
        ListNode h2 = new ListNode(-1232);
        ListNode h3 = new ListNode(-1233);
        ListNode h4 = new ListNode(-1233);
        ListNode h5 = new ListNode(-1232);
        ListNode h6 = new ListNode(-1231);

        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = h6;

        boolean pail = isPail(h1);
        System.out.println(pail);

    }

    public static boolean isPail(ListNode head) {
        ArrayList<Integer> nums = new ArrayList();
        //将链表元素取出一次放入数组
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < nums.size(); i++) {
            Integer i1 = nums.get(i);
            Integer i2 = nums.get(nums.size() - 1 - i);
            if (!i1.equals(i2)) {
                return false;
            }
        }
        return true;

/*
        ArrayList<Integer> temp = new ArrayList();
        temp = (ArrayList<Integer>) nums.clone();
        //准备一个数组承接翻转之后的数组
        Collections.reverse(temp);
        for (int i = 0; i < nums.size(); i++) {
            int x = nums.get(i);
            int y = temp.get(i);
            //正向遍历与反向遍历相同
            if (x != y)
                return false;
        }
        return true;*/
    }

}
