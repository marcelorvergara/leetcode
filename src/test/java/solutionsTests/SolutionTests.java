package solutionsTests;

import net.mvergara.solutions.*;
import net.mvergara.solutions.MergeTwoLists.ListNode;
import net.mvergara.solutions.InvertBinaryTree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static net.mvergara.solutions.BinarySearch.search;
import static net.mvergara.solutions.ValidAnagram.isAnagram;
import static net.mvergara.solutions.utils.Utils.*;


public class SolutionTests {

    @Test
    void buy_and_sell_stock_test() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int output = 5;

        BuyAndSellStock bass = new BuyAndSellStock();
        int result = bass.buyAndSellStocks(prices);

        Assertions.assertEquals(output, result);
    }

    @Test
    void two_sum_test() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};

        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(nums, target);

        Assertions.assertArrayEquals(result, expectedResult);
    }

    @Test
    void valid_parentheses_true_test() {
        String parenthesesStr = "()[]{}";
        boolean output = true;

        ValidParentheses vp = new ValidParentheses();
        boolean result = vp.validParentheses(parenthesesStr);

        Assertions.assertEquals(result, output);
    }

    @Test
    void valid_parentheses_false_test() {
        String parenthesesStr = "()[]{}(";
        boolean output = false;

        ValidParentheses vp = new ValidParentheses();
        boolean result = vp.validParentheses(parenthesesStr);

        Assertions.assertEquals(result, output);
    }

    @Test
    void merge_two_lists_test() {
        List<Integer> lst1 = List.of(1, 2, 4);
        List<Integer> lst2 = List.of(1, 3, 4);
        List<Integer> expectedLst = List.of(1, 1, 2, 3, 4, 4);

        ListNode ln1 = intArrToListNode(lst1);
        ListNode ln2 = intArrToListNode(lst2);

        MergeTwoLists mtl = new MergeTwoLists();
        ListNode resultLN = mtl.mergeTwoLists(ln1, ln2);

        List<Integer> resultIntArr = listNodeToArr(resultLN);

        Assertions.assertIterableEquals(expectedLst, resultIntArr);
    }

    @Test
    void is_palindrome_test() {
        String s = "A man, a plan, a canal: Panama";
        boolean output = true;

        IsPalindrome ip = new IsPalindrome();
        boolean result = ip.isPalindrome(s);

        Assertions.assertEquals(output, result);
    }

    @Test
    void is_palindrome_2_test() {
        String s = "0P";
        boolean output = false;

        IsPalindrome ip = new IsPalindrome();
        boolean result = ip.isPalindrome(s);

        Assertions.assertEquals(output, result);
    }

    @Test
    void invert_tree_node_test() {
        // TreeNode original
        TreeNode leaf1 = new TreeNode(1);
        TreeNode leaf3 = new TreeNode(3);
        TreeNode leaf6 = new TreeNode(6);
        TreeNode leaf9 = new TreeNode(9);
        TreeNode two = new TreeNode(leaf1, leaf3, 2);
        TreeNode seven = new TreeNode(leaf6, leaf9, 7);
        TreeNode root = new TreeNode(two, seven, 4);

        InvertBinaryTree ibn = new InvertBinaryTree();
        TreeNode invertedTreeNode = ibn.invertTree(root);

        // Inverted treenode
        TreeNode expectedTwoInvertedTreeNode = new TreeNode(leaf3, leaf1, 2);
        TreeNode expectedSevenInvertedTreeNode = new TreeNode(leaf9, leaf6, 7);
        TreeNode expectedRootInvertedTreeNode = new TreeNode(expectedSevenInvertedTreeNode, expectedTwoInvertedTreeNode, 4);

        Assertions.assertTrue(areTreeEqual(expectedRootInvertedTreeNode, invertedTreeNode));
    }

    @Test
    void is_valid_anagram_test(){
        String s = "anagram";
        String t = "nagaram";
        String x = "cat";
        String y = "rat";

        boolean resultTrue = isAnagram(s,t);
        boolean resultFalse = isAnagram(x,y);

        Assertions.assertTrue(resultTrue);
        Assertions.assertFalse(resultFalse);
    }

    @Test
    void binary_search_test() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int output = 4;

        int result = search(nums, target);

        Assertions.assertEquals(output, result);

    }
}
