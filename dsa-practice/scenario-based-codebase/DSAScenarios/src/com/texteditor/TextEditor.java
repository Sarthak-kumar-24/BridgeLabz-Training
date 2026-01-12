package com.texteditor;

import java.util.Scanner;
import java.util.Stack;
/*
 * TextEditor – Undo/Redo Functionality (Stack)
 * 
 * Shanaya is building a basic text editor app. Every action (insert, delete, format) is
 * pushed onto a Stack. An Undo action pops from the stack, and Redo uses another stack to reapply actions.
 * 
 * 
 * 
 */

public class TextEditor {
	
    private static Stack<String> undoStack = new Stack<>();
    private static Stack<String> redoStack = new Stack<>();
    private static String currentText = "";

    // Inserts text
    private static void insertText(String text) {
        undoStack.push(currentText);
        currentText += text;
        redoStack.clear(); 
        System.out.println(" Text inserted");
    }

    // Deletes last n characters
    private static void deleteText(int count) {
        if (count > currentText.length()) {
            System.out.println(" Not enough characters to delete");
            return;
        }

        undoStack.push(currentText);
        currentText = currentText.substring(0, currentText.length() - count);
        redoStack.clear();
        System.out.println(" Text deleted");
    }

    // Undo operation
    private static void undo() {
        if (undoStack.isEmpty()) {
            System.out.println(" Nothing to undo");
            return;
        }

        redoStack.push(currentText);
        currentText = undoStack.pop();
        System.out.println(" Undo successful");
    }

    // Redo operation
    private static void redo() {
        if (redoStack.isEmpty()) {
            System.out.println(" Nothing to redo");
            return;
        }

        undoStack.push(currentText);
        currentText = redoStack.pop();
        System.out.println(" Redo successful");
    }

    // Displays editor content
    private static void showText() {
        System.out.println("\n Current Text:");
        System.out.println("\"" + currentText + "\"");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n======  TEXT EDITOR MENU ======");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Show Text");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text to insert: ");
                    String text = sc.nextLine();
                    insertText(text);
                    break;

                case 2:
                    System.out.print("Enter number of characters to delete: ");
                    int n = sc.nextInt();
                    deleteText(n);
                    break;

                case 3:
                    undo();
                    break;

                case 4:
                    redo();
                    break;

                case 5:
                    showText();
                    break;

                case 6:
                    System.out.println(" Exiting Text Editor");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }

}
