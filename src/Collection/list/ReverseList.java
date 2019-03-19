/**
 * Copyright (C), 2015-2018
 * FileName: ReverseList
 * Author:   kritio
 * Date:     2018/12/9 19:01
 * Description: 反转单链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.list;

/**
 * 〈一句话功能简述〉<br>
 * 〈反转单链表〉
 *
 * @author kritio
 * @create 2018/12/9
 * @since 1.0.0
 */
public class ReverseList {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pReversedHead = null; //反转过后的单链表存储头结点
        ListNode pNode = head; //定义pNode指向pHead;
        ListNode pPrev = null; //定义存储前一个结点
        while (pNode != null) {
            ListNode pNext = pNode.next; //定义pNext指向pNode的下一个结点
            if (pNext == null) { //如果pNode的下一个结点为空，则pNode即为结果
                pReversedHead = pNode;
            }
            pNode.next = pPrev; //修改pNode的指针域指向pPrev
            pPrev = pNode; //将pNode结点复制给pPrev
            pNode = pNext; //将pNode的下一个结点复制给pNode
        }
        return pReversedHead;
    }
}


/*

    public ListNode reverseList3(ListNode pHead){
        if(pHead==null || pHead.next == null){ //如果没有结点或者只有一个结点直接返回pHead
            return pHead;
        }
        ListNode pNext = pHead.next; //保存当前结点的下一结点
        pHead.next = null; //打断当前结点的指针域
        ListNode reverseHead = reverseList3(pNext); //递归结束时reverseHead一定是新链表的头结点
        pNext.next = pHead; //修改指针域
        return reverseHead;
}*/
