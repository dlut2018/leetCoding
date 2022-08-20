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
        ListNode h = solution.reverseBetween(ListUtils.createList(integers),2,4);
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
        ListNode pLeft = null;
        ListNode p = head;
        ListNode pRight = head.next;
        ListNode start1 = null;
        ListNode start2 = null;
        ListNode end1 = null;
        ListNode end2 = null;
        int count = 0;
        int status = 0;
        //使用三个指针遍历链表，完成翻转
        while(p != null){
            count++;
            //开始反转链表
            if(count==left){ status=1; }
            if(status==1){
                if(count==left){
                    //第一个位置 记录链表两个断电的地址
                    start1 = pLeft;
                    start2 = pRight;
                }
                else{
                    //其他位置 改变链表指针方向
                    p.next = pLeft;
                }
            }
            //结束反转链表
            if(count==right+1){
                status=0;
                if(start1!=null) {
                    start1.next = p;
                }else {
                    head = end1;
                }
                start2.next = pRight;
            }
            //使用三个指针遍历链表
            if(pLeft!=null) { pLeft = p; }
            else { pLeft = head; }
            p = pRight;
            if(pRight!=null) {
                pRight = pRight.next;
            }
            if(p!=null) {
                System.out.println(p.val);
            }
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
