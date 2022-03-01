{
  int[][] mTables;

  mTables = new int[9][9];

  for (int i=0; i<9; i++) {
    for (int j=0; j<9; j++) {
      mTables[i][j] = (i+1) * (j+1);
    }
  }
  System.out.print(mTables[8][0]);
  System.out.print('\t');
  System.out.print(mTables[8][1]);
  System.out.print('\t');
  System.out.print(mTables[8][2]);
  System.out.print('\t');
  System.out.print(mTables[8][3]);
  System.out.print('\t');
  System.out.print(mTables[8][4]);
  System.out.print('\t');
  System.out.print(mTables[8][5]);
  System.out.print('\t');
  System.out.print(mTables[8][6]);
  System.out.print('\t');
  System.out.print(mTables[8][7]);
  System.out.print('\t');
  System.out.println(mTables[8][8]);
}
