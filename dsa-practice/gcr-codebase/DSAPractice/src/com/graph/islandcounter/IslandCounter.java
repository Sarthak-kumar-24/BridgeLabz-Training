package com.graph.islandcounter;

public class IslandCounter {

	// Grid dimensions
	private static int rows;
	private static int cols;

	// DFS to mark all connected land cells
	private static void dfs(int[][] grid, int r, int c) {

		// Base cases:
		// 1. Out of bounds
		// 2. Water cell (0)
		if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == 0)
			return;

		// Marks current land as visited by converting it to water
		grid[r][c] = 0;

		// Explore all 4 directions (up, down, left, right)
		dfs(grid, r + 1, c); // down
		dfs(grid, r - 1, c); // up
		dfs(grid, r, c + 1); // right
		dfs(grid, r, c - 1); // left
	}

	// Function to count islands
	private static int countIslands(int[][] grid) {

		rows = grid.length;
		cols = grid[0].length;
		int islandCount = 0;

		// Traverse entire grid
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				// If land is found, it's a new island
				if (grid[i][j] == 1) {
					islandCount++;
					dfs(grid, i, j); // mark entire island
				}
			}
		}
		return islandCount;
	}

	// MAIN METHOD
	public static void main(String[] args) {

		// Given input grid
		int[][] grid = { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 1 }, { 0, 0, 1, 0, 1 }, { 0, 0, 0, 1, 1 } };

		System.out.println("===== Island Counter =====\n");

		System.out.println("Input Grid:");
		for (int[] row : grid) {
			for (int cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}

		int result = countIslands(grid);

		System.out.println("\nTotal number of islands = " + result);
	}
}
