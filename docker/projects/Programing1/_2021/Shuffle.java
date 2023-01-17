public class Shuffle {
  public static void main(String[] args) {
    int[] cards = {2,3,4,5,6,7,8,9,10,11,12,13,1};
    int i,s,r, c1,c2, sel, rest;

    for (c2=0; c2<3; c2=c2+1) {
    // 全体３回

      for (c1=0; c1<5; c1=c1+1) {
      // ヒンズー
        sel = (int)(Math.random()*12) + 1;
        rest = 13-sel;
        int[] wrk = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        // backup
        for (i = 0; i < sel; i = i + 1) {
          wrk[i+rest] = cards[i];
        }
        // 後半を前半にスライド（sel分）
        for (i = 0; i < rest; i = i + 1) {
          cards[i] = cards[i+sel];
        }
        // バックアップを後半に戻す
        for (i = rest; i < 13; i = i + 1) {
          cards[i] = wrk[i];
        }
      }

      for (c1=0; c1<3; c1=c1+1) {
      // マッシュ
        sel = (int)(Math.random()*3) + 6;
        rest = 13-sel;
        int[] wrk = {0,0,0,0,0,0,0,0,0,0,0,0,0};

        s = 0;  // 前半分インデックス（スタート：0）
        r = sel;  // 後半分インデックス（スタート：sel

        for (i=0; i<13; i=i+1) {

          if (i%2==0) {  // 前半優先、ただし使い切っていたら後半から
            if (s<sel) {
              wrk[i] = cards[s];
              s=s+1;
            } else if (r<13) {  // 後半が残っていれば、、、
              wrk[i] = cards[r];
              r=r+1;
            } else {}

          } else {  // 後半優先、ただし使い切っていたら前半から
            if (r<13) {
              wrk[i] = cards[r];
              r=r+1;
            } else if (s<sel) {  // 前半が残っていれば、、、
              wrk[i] = cards[s];
              s=s+1;
            } else {}
          }

        }
        // 戻す
        for (i = 0; i < 13; i = i + 1) {
          cards[i] = wrk[i];
        }
      }

    }

    // 結果出力
    for (i=0; i<13; i=i+1) {
      System.out.print(cards[i] + " ");
    }
    System.out.println("");

  }
}