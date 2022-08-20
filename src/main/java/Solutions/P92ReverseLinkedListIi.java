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
        ListNode pLeft = null;
        ListNode p = head;
        ListNode pRight = head.next;
        int count = 0;
        int status = 0;

        while(p!=null){
            count++;
            //开始反转链表
            if(count==left){ status=1; }
            if(status==1){

            }
            //结束反转链表
            if(count==right){ status=0; }

            //使用三个指针遍历链表
            if(pLeft!=null) {
                pLeft = pLeft.next; }
            else {
                pLeft = head; }
            p = p.next;
            if(pRight.next!=null){
                pRight = pRight.next; }
            else {
                pRight = null;
            }
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
