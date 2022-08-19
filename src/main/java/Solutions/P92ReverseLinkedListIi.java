//给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链
//表节点，返回 反转后的链表 。
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], left = 2, right = 4
//输出：[1,4,3,2,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [5], left = 1, right = 1
//输出：[5]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目为 n 
// 1 <= n <= 500 
// -500 <= Node.val <= 500 
// 1 <= left <= right <= n 
// 
//
// 
//
// 进阶： 你可以使用一趟扫描完成反转吗？ 
// Related Topics 链表 👍 1366 👎 0


package Solutions;

import Utils.ListNode;
import Utils.ListUtils;

import java.util.ArrayList;

//Java：反转链表 II
public class P92ReverseLinkedListIi{
    public static void main(String[] args) {
        Solution solution = new P92ReverseLinkedListIi().new Solution();
        // TO TEST
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i=0;i<=10;i++){
            integers.add(i);
        }
        System.out.println(integers);
        ListNode h = solution.reverseBetween(ListUtils.createList(integers),3,5);
        ListUtils.showList(h);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //init
        ListNode p = head;
        ListNode[] ptemp = new ListNode[right-left+1];
        ListNode[] ptempHead = new ListNode[right-left+1];
        int count = 0;
        int var = 0;
        int varHead = 0;
        int statusCode = 0;
        int statusCodeHead = 0;
        //遍历
        while(p != null){
            count++;
            if(count == (left)){
                System.out.println(count);
                statusCode = 1;
            }
            if(count==right){
                System.out.println(count);
                statusCode = 0;
            }
            if(count == (left-1)){
                statusCodeHead = 1;
            }
            if(count == (right-1)){
                statusCodeHead = 0;
            }
            if(statusCode == 1){
                ptemp[var]=p;
                var++;
            }
            if(statusCodeHead == 1){
                ptempHead[varHead]= p;
                varHead++;
            }
            p = p.next;
        }

        //swap

        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
