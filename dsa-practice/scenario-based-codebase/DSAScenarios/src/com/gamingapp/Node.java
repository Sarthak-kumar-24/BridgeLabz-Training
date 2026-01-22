package com.gamingapp;


public class Node {
	
    int score;
    String player;
    int height;
    Node left, right;

    Node(int score, String player) {
        this.score = score;
        this.player = player;
        height = 1;
    }

}
