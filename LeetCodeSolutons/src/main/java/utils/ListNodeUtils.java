package utils;

import java.util.ArrayList;
import java.util.List;

public class ListNodeUtils {

    public static ListNode createList(List<Integer> integers){
        ListNode head = new ListNode(integers.get(0));
        ListNode p = head;
        int count = 0;
        for (Integer i:integers){
            count++;
            p.val = i;
            if(count!=integers.size()) {
                p.next = new ListNode();
                p = p.next;
            }
        }
        return head;
    }

    public static void showList(ListNode head){
        System.out.print("[");
        while(head != null){
            System.out.print(head.val);
            if(head.next!=null){
                System.out.print(",");
            }
            head=head.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ListNode h = createList(new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
        }});
        showList(h);
    }
}
