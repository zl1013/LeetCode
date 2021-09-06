package com.zzl.leetcode.top100;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @version 1.0
 * @author: zhaozl
 * @date: 2021-09-06 21:44
 *
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807
 *
 * https://leetcode-cn.com/problems/add-two-numbers/
 **/

public class TwoNumSum2 {
    public static void main(String[] args) {
        TwoNumSum2 twoNumSum2 = new TwoNumSum2();
        ListNode a2 = new ListNode(3);
        ListNode a1 = new ListNode(4,a2);
        ListNode l1 = new ListNode(2,a1);

        ListNode b2 = new ListNode(4);
        ListNode b1 = new ListNode(6,b2);
        ListNode l2 = new ListNode(5,b1);
        ListNode resultMap = twoNumSum2.addTwoNumbers(l1, l2);
        System.out.print("[");
        while (resultMap != null){
            System.out.print(resultMap.val);
            resultMap = resultMap.next;
        }
        System.out.println("]");
    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int flag = 0 ;
        while (l1 != null || l2 != null){
            int n1 = l1 != null? l1.val : 0;
            int n2 = l2 != null? l2.val : 0;
            int sum = n1 + n2 + flag;
            if (head == null){
                head = tail = new ListNode(sum % 10 );
            }else {
                tail.next = new ListNode(sum % 10 );
                tail = tail.next;
            }
            flag = sum / 10;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (flag > 0){
            tail.next = new ListNode(flag);
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}