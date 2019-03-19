/**
 * Copyright (C), 2015-2019
 * FileName: ConmenNode
 * Author:   kritio
 * Date:     2019/3/10 11:41
 * Description: 寻找无环链表的交点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.list;

/**
 * 〈一句话功能简述〉<br>
 * 〈寻找无环链表的交点〉
 *
 * @author kritio
 * @create 2019/3/10
 * @since 1.0.0
 */
public class ConmenNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null ;
        }
//遍历得到长度，从尾节点判断是否相交
        ListNode tailA = headA;
        ListNode tailB = headB;
        int lenA = 0;
        int lenB = 0;
        while (tailA != null) {
            tailA = tailA.next;
            lenA++;
        }
        while (tailB != null) {
            tailB = tailB.next;
            lenB++;
        }
        //尾节点不同则不相交
        if (tailA != tailB) {
            return null;
        }
        //过滤长度差
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        if (lenA > lenB) {
            int k = lenA - lenB;
            while (k != 0) {
                nodeA = nodeA.next;
                k--;
            }
        } else {
            int k = lenB - lenA;
            while (k != 0) {
                nodeB = nodeB.next;
                k--;
            }
        }

        while (nodeA != nodeB) {
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return nodeA;
    }

}