package com.linkedlist.singlylinkedlist;

/**
 * Controls the entire social network.
 * Maintains a linked list of users and manages relationships.
 */
public class SocialNetwork {

    private UserNode head;

    

    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    private UserNode findUserById(int userId) {
        UserNode current = head;
        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public UserNode findUserByName(String name) {
        UserNode current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Friend Connections

    public void addFriendConnection(int userId1, int userId2) {
        UserNode u1 = findUserById(userId1);
        UserNode u2 = findUserById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println(" User not found");
            return;
        }

        u1.addFriend(userId2);
        u2.addFriend(userId1);
        System.out.println(" Friend connection added");
    }

    public void removeFriendConnection(int userId1, int userId2) {
        UserNode u1 = findUserById(userId1);
        UserNode u2 = findUserById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println(" User not found");
            return;
        }

        u1.removeFriend(userId2);
        u2.removeFriend(userId1);
        System.out.println(" Friend connection removed");
    }

    // Queries

    public void findMutualFriends(int userId1, int userId2) {
        UserNode u1 = findUserById(userId1);
        UserNode u2 = findUserById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println(" User not found");
            return;
        }

        System.out.print(" Mutual Friends: ");
        boolean found = false;

        FriendNode f1 = u1.friendsHead;
        while (f1 != null) {
            FriendNode f2 = u2.friendsHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found) System.out.print("None");
        System.out.println();
    }

    public void displayFriendsOfUser(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println(" User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        user.displayFriends();
    }

    public void countFriendsForAllUsers() {
        UserNode current = head;
        while (current != null) {
            System.out.println(
                current.name + " has " + current.countFriends() + " friends"
            );
            current = current.next;
        }
    }

    /* ================= Demo ================= */

    public static void main(String[] args) {

        SocialNetwork network = new SocialNetwork();

        network.addUser(1, "Aman", 21);
        network.addUser(2, "Neha", 22);
        network.addUser(3, "Ravi", 23);
        network.addUser(4, "Sita", 20);

        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 3);
        network.addFriendConnection(2, 4);

        network.displayFriendsOfUser(2);
        network.findMutualFriends(1, 2);
        network.removeFriendConnection(1, 3);
        network.countFriendsForAllUsers();
    }
}

