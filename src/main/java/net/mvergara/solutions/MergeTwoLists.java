package net.mvergara.solutions;

public class MergeTwoLists {
    
      public static class ListNode {
      public int val;
      public ListNode next;
      ListNode() {}
      public ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2){

          ListNode head = new ListNode(0);
          ListNode result = head;

          while (list1 != null && list2 != null) {
              if (list1.val <= list2.val) {
                  result.next = list1;
                  list1 = list1.next;
              } else {
                  result.next = list2;
                  list2 = list2.next;
              }
              result = result.next;
          }
          result.next = (list1 == null) ? list2: list1;
          return head.next;
  }
}
