public class Hand {
    public static final int HANDVALUE_GUU = 0;  // グ?を?す値
    public static final int HANDVALUE_CHO = 1;  // ?ョキを?す値
    public static final int HANDVALUE_PAA = 2;  // パ?を?す値
    public static final Hand[] hand = {         // じゃんけんの手を?す3つのインス?ンス
        new Hand(HANDVALUE_GUU),
        new Hand(HANDVALUE_CHO),
        new Hand(HANDVALUE_PAA),
    };
    private static final String[] name = {      // じゃんけんの手の文字列?現
        "グ?", "?ョキ", "パ?",
    };
    private int handvalue;                      // じゃんけんの手の値
    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }
    public static Hand getHand(int handvalue) { // 値からインス?ンスを得る
        return hand[handvalue];
    }
    public boolean isStrongerThan(Hand h) {     // thisがhより強いときtrue
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h) {       // thisがhより弱いときtrue
        return fight(h) == -1;
    }
    private int fight(Hand h) {                 // 引き分けは0, thisの勝ちなら1, hの勝ちなら-1
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }
    public String toString() {                  // 文字列?現へ変換
        return name[handvalue];
    }
}
