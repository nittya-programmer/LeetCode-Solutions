import java.util.*;

public class Solution {
    public int trapRainWater(int[][] grid) {
        int trappedWater = 0;
        int rowCount = grid.length, colCount = grid[0].length;
        boolean[][] visitedCells = new boolean[rowCount][colCount];
        int[][] neighbors = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        
        for (int col = 0; col < colCount; col++) {
            minHeap.offer(new int[]{grid[0][col], 0, col});
            visitedCells[0][col] = true;
            minHeap.offer(new int[]{grid[rowCount - 1][col], rowCount - 1, col});
            visitedCells[rowCount - 1][col] = true;
        }
        
        for (int row = 0; row < rowCount; row++) {
            minHeap.offer(new int[]{grid[row][0], row, 0});
            visitedCells[row][0] = true;
            minHeap.offer(new int[]{grid[row][colCount - 1], row, colCount - 1});
            visitedCells[row][colCount - 1] = true;
        }
        
        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int currHeight = curr[0], currRow = curr[1], currCol = curr[2];
            
            for (int[] offset : neighbors) {
                int newRow = currRow + offset[0], newCol = currCol + offset[1];
                if (newRow >= 0 && newRow < rowCount && newCol >= 0 && newCol < colCount && !visitedCells[newRow][newCol]) {
                    visitedCells[newRow][newCol] = true;
                    if (grid[newRow][newCol] < currHeight) {
                        trappedWater += currHeight - grid[newRow][newCol];
                    }
                    minHeap.offer(new int[]{Math.max(currHeight, grid[newRow][newCol]), newRow, newCol});
                }
            }
        }
        
        return trappedWater;
    }
}