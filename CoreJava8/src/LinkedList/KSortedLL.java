package LinkedList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KSortedLL {
    public static void main(String[] args) {
        ListNode ll1 = new ListNode(1);
        ListNode ll2 = new ListNode(5);
        ListNode ll3 = new ListNode(7);
        ListNode ll4 = new ListNode(1);
        ListNode ll5 = new ListNode(3);
        ListNode ll6 = new ListNode(4);
        ListNode ll7 = new ListNode(2);
        ListNode ll8 = new ListNode(6);
        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = null;
        ll4.next = ll5;
        ll5.next = ll6;
        ll6.next = null;
        ll7.next = ll8;
        ll8.next = null;
        ListNode[] lists = {ll1, ll4, ll7};
        System.out.println("*****START******");
        InsertLinkedList.printLL(mergeKLists(lists));
        System.out.println("*****END********");

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> priorityQueue;
        priorityQueue = new PriorityQueue<ListNode>(Comparator.comparingInt(a -> ((ListNode) a).data));
        priorityQueue.addAll(Arrays.asList(lists));
        ListNode head = new ListNode(-1);
        ListNode last = head;
        if (priorityQueue.isEmpty())
            return null;
        while (!priorityQueue.isEmpty()) {
            ListNode curr = priorityQueue.poll();
            last.next = curr ;
            last = last.next;
            if (curr.next != null) {
                priorityQueue.add(curr.next);
            }
        }
        return head.next;
    }

    //Another approach divide and conquer
   /* private ListNode merge(ListNode a, ListNode b) {
        ListNode c = null;
        if (a == null) return b;
        if (b == null) return a;
        if (a.val <= b.val) c = a;
        else {
            c = b;
            b = a;
            a = c;
        }
        while (a.next != null) {
            if (a.next.val > b.val) {
                ListNode temp = a.next;
                a.next = b;
                b = temp;
            }
            a = a.next;
        }
        a.next = b;
        return c;
    }
    private ListNode merge(ListNode[] lists, int start, int end) {
        if (start > end) return null;
        if (start == end) return lists[start];
        int mid = start + ((end - start) >> 1);
        return merge(merge(lists, start, mid), merge(lists, mid+1, end));
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) return null;
        if (lists.length == 1) return lists[0];
        return merge(lists, 0, lists.length - 1);
    }
}*/
}
