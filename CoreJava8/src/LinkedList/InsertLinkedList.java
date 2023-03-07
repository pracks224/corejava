package LinkedList;

public class InsertLinkedList {

    public static void printLL(ListNode head){
        ListNode temp = head;
        int count =0;
        while(temp != null){
            count++;
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.print("Length of LL is ::"+count);
    }

    public static ListNode findMiddleNode(ListNode head){
        ListNode temp = head;
        ListNode middleNode = null;
        int length =0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        int middle = 0;
        if((length & 1) == 1){
             middle = ((length-1)/2)+1;
        }else{
            middle = (length/2)+1;
        }
        ListNode temp2 = head;
        while(temp2 != null){
            if(middle == 1){
                middleNode = temp2;
                return middleNode;
            }
            temp2 = temp2.next;
            middle--;
        }
        return middleNode;
    }

    public static ListNode findMiddleNodeOptimized(ListNode head){
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        while(pointer2 != null){
            if(pointer2.next !=null) {
                pointer2 = pointer2.next.next;
                pointer1 = pointer1.next;
            }else{
                pointer2 = null;
            }
        }
        return pointer1;
    }
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        ListNode next = null;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
        return head;
    }


    public static void main(String[] args) {
       ListNode head = new ListNode(1);
       ListNode headNext = new ListNode(2);
       head.next = headNext;
       ListNode headheadNext = new ListNode(3);
       headNext.next = headheadNext;
       ListNode headnext4 = new ListNode(4);
       ListNode headNext5 = new ListNode(5);
       ListNode headNext6 = new ListNode(6);
       headheadNext.next = headnext4;
       headnext4.next = headNext5;
       headNext5.next = headNext6;
       headNext6.next = null;
      // printLL(head);
      /* ListNode middle = findMiddleNode(head);
       System.out.println("Middle Node is "+middle.data );

        ListNode middle2 = findMiddleNodeOptimized(head);
        System.out.println("Middle Node is "+middle2.data );*/

       ListNode node = reverseList(head);
       printLL(node);
    }
}
