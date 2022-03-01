package Lesson3;
/**
 *  ジャンケンのプレイヤークラス
 */
public class Player {
    // じゃんけんの手
    public static final int STONE = 0;      // グー
    public static final int SCISSORE = 1;   // チョキ
    public static final int PAPER = 2;      // パー

    private String name_;       // プレイヤー名
    private int WinCount_ = 0;   // 勝利回数
    
    /**
     * コンストラクタ
     * @param name
     */
    public Player (String name) {
        name_ = name;
    }

    /**
     * @return 名前を返す
     */
    public String getName() {
        return name_;
    }

    /**
     * @return ジャンケンの手（int）
     */
    public int showHand() {
        int Hand = 0;

        double randomNum = Math.random() * 3;
        if (randomNum < 1) {
            Hand = STONE;
        } else if (randomNum < 2) {
            Hand = SCISSORE;
        } else {
            Hand = PAPER;
        }

        return Hand;
    }

    /**
     * 勝ち負けをきく
     * @param result true:勝ち false:負け
     */
    public void notifyResult(boolean result) {
        if (result) {
            WinCount_++;
        }
    }

    /**
     * 
     * @return 勝数
     */
    public int getWincount() {
        return WinCount_;
    }
}
