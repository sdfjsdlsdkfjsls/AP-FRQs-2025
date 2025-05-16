public boolean clearPair(int row, int col) {
  for (int i = row; i < puzzle.length; i++) {
    for (int j = 0; j < puzzle[0].length; j++) {
      int first = puzzle[row][col];
      int second = puzzle[i][j];
      if (first == second || first + second == 10) {
        puzzle[row][col] = 0;
        puzzle[i][j] = 0;
        return true;
      }
    }
  }
  return false;
}
