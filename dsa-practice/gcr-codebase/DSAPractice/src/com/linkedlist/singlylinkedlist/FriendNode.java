package com.linkedlist.singlylinkedlist;

/**
 * Represents a single friend connection (Friend ID)
 */
class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}

