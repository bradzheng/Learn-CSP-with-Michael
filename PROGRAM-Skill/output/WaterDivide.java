/**
 * 16L 水平均分给 4 人
 * <p>
 * 3 个桶：8L、8L、3L，初始两个 8L 桶满水。
 * 4 人有容量 >4L 的接水容器，给出的水不能收回。
 * 目标：每人恰好 4L。
 * </p>
 *
 * @author Xinchun
 */
public class WaterDivide {

    private static final int CAP0 = 8, CAP1 = 8, CAP2 = 3;
    private static final int TARGET = 4;

    private int b0, b1, b2;
    private final int[] people = new int[4];
    private final StringBuilder log = new StringBuilder();

    public WaterDivide() {
        b0 = CAP0; b1 = CAP1; b2 = 0;
        log("初始: 桶=[" + b0 + "," + b1 + "," + b2 + "] 人=" + toString(people));
    }

    /** 桶间倒水 */
    private int pour(int from, int to, String label) {
        int[] b = {b0, b1, b2};
        int[] c = {CAP0, CAP1, CAP2};
        int amt = Math.min(b[from], c[to] - b[to]);
        b[from] -= amt; b[to] += amt;
        b0 = b[0]; b1 = b[1]; b2 = b[2];
        log(label + " 桶" + from + "→桶" + to + "(" + amt + "L) => [" + b0 + "," + b1 + "," + b2 + "]");
        return amt;
    }

    /** 桶→人倒水 */
    private int give(int bIdx, int pIdx, String label) {
        int[] b = {b0, b1, b2};
        int amt = Math.min(b[bIdx], TARGET - people[pIdx]);
        b[bIdx] -= amt; people[pIdx] += amt;
        b0 = b[0]; b1 = b[1]; b2 = b[2];
        log(label + " 桶" + bIdx + "→人" + pIdx + "(" + amt + "L) => 人=" + toString(people) + " 桶=[" + b0 + "," + b1 + "," + b2 + "]");
        return amt;
    }

    private void log(String msg) { log.append(msg).append("\n"); }
    private String toString(int[] a) {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < a.length; i++) { if (i > 0) s.append(", "); s.append(a[i]); }
        return s + "]";
    }

    /**
     * 分水方案：
     *
     * 人0: 桶0→桶2(3L)→人0(3L), 桶0→桶2(3L)→人0(1L,剩2L)  => 人0=4
     * 人1: 桶2(2L)→人1(2L), 桶1→桶2(3L)→人1(2L,剩1L)      => 人1=4
     * 人2: 桶2(1L)→人2(1L), 桶1→桶2(3L)→人2(3L)            => 人2=4
     * 人3: 桶0(2L)→人3(2L), 桶1(2L)→人3(2L)                 => 人3=4
     */
    public void solve() {
        // 人0
        pour(0, 2, "S1");  give(2, 0, "S2");
        pour(0, 2, "S3");  give(2, 0, "S4");
        // 人1
        give(2, 1, "S5");  pour(1, 2, "S6");  give(2, 1, "S7");
        // 人2
        give(2, 2, "S8");  pour(1, 2, "S9");  give(2, 2, "S10");
        // 人3
        give(0, 3, "S11"); give(1, 3, "S12");

        System.out.println("========== 分水过程 ==========");
        System.out.print(log);
        boolean ok = b0 == 0 && b1 == 0 && b2 == 0
                  && people[0] == TARGET && people[1] == TARGET
                  && people[2] == TARGET && people[3] == TARGET;
        System.out.println("结果: " + (ok ? "✓ 成功! 每人4L, 桶全空" : "✗ 失败"));
    }

    public static void main(String[] args) {
        new WaterDivide().solve();
    }
}
