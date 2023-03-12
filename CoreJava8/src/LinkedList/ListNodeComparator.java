package LinkedList;

import java.util.Comparator;

public class ListNodeComparator implements Comparator<ListNode> {
    public int compare(ListNode k1, ListNode k2) {
        if (k1.data > k2.data)
            return 1;
        else if (k1.data < k2.data)
            return -1;
        return 0;
    }

}
