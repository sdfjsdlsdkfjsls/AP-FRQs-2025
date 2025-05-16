public boolean clearPair(int row, int col) {
  for (int i = row; i < puzzle.length; i++) {
    for (int j = 0; j < puzzle[0].length; j++) {
      int current = puzzle[row][col];
      int target = puzzle[i][j];
      if (!(i == row && j == col) && (first == second || first + second == 10)) {
        puzzle[row][col] = 0;
        puzzle[i][j] = 0;
        return true;
      }
    }
  }
  return false;
}
