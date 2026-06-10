/**
 * 2人比赛 — 根据得分与先手规则判定获胜者。
 */
public class WinnerDecider {

    /**
     * @param firstScore  1号选手得分
     * @param secondScore 2号选手得分
     * @param firstStart  得分相同时，true = 1号先手，false = 2号先手
     * @return 1 或 2
     */
    public static int decide(int firstScore, int secondScore, boolean firstStart) {
        if (firstScore == secondScore) {
            // 得分相同 → 先手者输
            return firstStart ? 2 : 1;
        }
        // 得分不同 → 高分者胜
        return firstScore > secondScore ? 1 : 2;
    }

    // ---- 演示 ----
    public static void main(String[] args) {
        // 场景 A: 得分不等 → 高分胜
        System.out.println(decide(10, 7, true));  // 1

        // 场景 B: 得分相等 + 1号先手 → 2胜
        System.out.println(decide(8, 8, true));   // 2

        // 场景 C: 得分相等 + 2号先手 → 1胜
        System.out.println(decide(8, 8, false));  // 1
    }
}
