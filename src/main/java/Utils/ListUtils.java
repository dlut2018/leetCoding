package Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bangsun
 */
public class ListUtils {


    public static ListNode createList(List<Integer> input){
        if(input.size()==0){
            return null;
        }
        ListNode head = new ListNode(input.get(0));
        ListNode insert = head;
        for(int i=1;i<=input.size()-1;i++){
            insert.next=new ListNode(input.get(i));
            insert = insert.next;
        }
        return head;
    }


    public static void showList(ListNode head){
        System.out.print("[");
        while(head!=null){
            System.out.print(head.val);
            head = head.next;
            if(head!=null){
                System.out.print(" ,");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        ListNode h = createList(integers);
        showList(h);
    }
}
