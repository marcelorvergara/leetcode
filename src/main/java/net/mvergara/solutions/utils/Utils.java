package net.mvergara.solutions.utils;

import net.mvergara.solutions.InvertBinaryTree;
import net.mvergara.solutions.MergeTwoLists.ListNode;
import net.mvergara.solutions.InvertBinaryTree.TreeNode;
import java.util.ArrayList;
import java.util.List;



public class Utils {

    public static ListNode intArrToListNode(List<Integer> lst1) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        for(int i: lst1){
            ListNode newNode = new ListNode(i);
            result.next = newNode;
            result = result.next;
        }
        return head.next;
    }

    public static List<Integer> listNodeToArr(ListNode ln) {
        List<Integer> result = new ArrayList<>();
        while (ln != null) {
            result.add(ln.val);
            ln = ln.next;
        }
        return result;
    }

    // Tests if two binary tree are equal
    public static boolean areTreeEqual(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        return t1.val == t2.val && areTreeEqual(t1.left, t2.left) && areTreeEqual(t1.right, t2.right);
    }
}
