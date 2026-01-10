package com.browserbuddy;

import java.util.Scanner;
import java.util.Stack;

/* BrowserBuddy – Tab History Manager (Doubly Linked List + Stack)
 * 
 * Neha is working on a custom browser. 
 * Each open tab maintains its browsing history with "Back" and "Forward" operations. 
 * She uses a Doubly Linked List for history and a Stack to hold closed tabs for reopening.
 */
public class BrowserTab {

	private PageNode current;
	private Stack<PageNode> closedTabs = new Stack<>();

	public void visit(String url) {
		PageNode newPage = new PageNode(url);

		if (current != null) {
			current.next = null;
			newPage.prev = current;
			current.next = newPage;
		}
		current = newPage;
		System.out.println("Opened: " + url);
	}

	public void back() {
		if (current == null || current.prev == null) {
			System.out.println(" No page to go back");
			return;
		}
		current = current.prev;
		System.out.println(" Back to: " + current.getURL());

	}

	public void forward() {
		if (current == null || current.next == null) {
			System.out.println(" No page to go forward");
			return;
		}
		current = current.next;
		System.out.println(" Forward to: " + current.getURL());
	}

	// Closes current tab
	public void closeTab() {
		if (current == null) {
			System.out.println(" No tab to close");
			return;
		}

		closedTabs.push(current);
		System.out.println(" Closed tab: " + current.getURL());

		if (current.prev != null) {
			current = current.prev;
			current.next = null;
		} else {
			current = null;
		}
	}

	// Restores last closed tab
	public void reopenTab() {
		if (closedTabs.isEmpty()) {
			System.out.println(" No closed tabs to restore");
			return;
		}

		PageNode restored = closedTabs.pop();
		visit(restored.getURL());
		System.out.println(" Restored tab: " + restored.getURL());
	}

	
	public void showCurrent() {
		if (current == null) {
			System.out.println(" No active tab");
		} else {
			System.out.println(" Current Page: " + current.getURL());
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BrowserTab tab = new BrowserTab();
		int choice;

		do {
			System.out.println("\n==============================");
			System.out.println(" BROWSERBUDDY");
			System.out.println("==============================");
			System.out.println("1. Visit New Page");
			System.out.println("2. Back");
			System.out.println("3. Forward");
			System.out.println("4. Close Tab");
			System.out.println("5. Reopen Closed Tab");
			System.out.println("6. Show Current Page");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter URL: ");
				String url = sc.nextLine();
				tab.visit(url);
				break;

			case 2:
				tab.back();
				break;

			case 3:
				tab.forward();
				break;

			case 4:
				tab.closeTab();
				break;

			case 5:
				tab.reopenTab();
				break;

			case 6:
				tab.showCurrent();
				break;

			case 7:
				System.out.println(" Closing BrowserBuddy");
				break;

			default:
				System.out.println(" Invalid choice");
			}

		} while (choice != 7);

		sc.close();
	}

}
