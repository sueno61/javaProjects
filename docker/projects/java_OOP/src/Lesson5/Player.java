package Lesson5;
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

    private Tactics tactics_;
    void setTactics(Tactics tactics) {
        tactics_ = tactics;
    }
    
    /**
     * コンストラクタ
     * @param name
     */
    public Player(String name) {
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

        int hand = tactics_.readTactics();

        return hand;
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
