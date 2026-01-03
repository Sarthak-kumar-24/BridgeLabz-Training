package com.linkedlist.singlylinkedlist;

/**
 * Represents a user in the social network.
 * Each user maintains a linked list of friend IDs.
 */
class UserNode {

    int userId;
    String name;
    int age;

    FriendNode friendsHead;   // Head of friend list
    UserNode next;            // Next user in network

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendsHead = null;
        this.next = null;
    }

    /*================== Friend Operations ==================== */

    
    void addFriend(int friendId) {
        FriendNode newFriend = new FriendNode( friendId );
        newFriend.next = friendsHead;
        friendsHead = newFriend;
    }

    void removeFriend(int friendId) {
        if (friendsHead == null) return;

        if (friendsHead.friendId == friendId) {
            friendsHead = friendsHead.next;
            return;
        }

        FriendNode current = friendsHead;
        while (current.next != null && current.next.friendId != friendId) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    void displayFriends() {
        if (friendsHead == null) {
            System.out.println("No friends");
            return;
        }

        FriendNode current = friendsHead;
        while (current != null) {
            System.out.print(current.friendId + " ");
            current = current.next;
        }
        System.out.println();
    }

    int countFriends() {
        int count = 0;
        FriendNode current = friendsHead;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

