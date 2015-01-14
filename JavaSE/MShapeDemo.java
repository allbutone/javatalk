package test.java;

/**
 * 实现打印 M 形状
 * @author SilentNight QQ: 237951606
 */
public class MShapeDemo {

    public static void main(String[] args) {
/*
//     打印出 4 个连续的 M 形状
       for (int i = 1; i < 4; i++) {
            int max = (i * 4) + 1;//M 形状输出的最大数字
            printShape(max);
            System.out.println();
       }
*/
        printShape(5);
        System.out.println();
        printShape(9);
        System.out.println();
        printShape(13);
        System.out.println();
        printShape(17);
    }

    /**
     * 根据数字输出 M 形状
     *
     * @param maxNum M 形状输出的最大数，例如：5,9,13,17..., 指定 maxNum 的规律是：(n * 4) + 1, 其中 n 为自然数：1,2,3,...
     * @author SilentNight
     */
    public static void printShape(int maxNum) {
        int q4 = maxNum - 1;// 四分之四
        int q2 = q4 / 2; // 四分之二
        int q1 = q2 / 2; // 四分之一
        int q3 = q1 * 3; // 四分之三

        for (int y = q1; y >= 0; y--) {
            for (int x = 0; x < maxNum; x++) {
                boolean col_1 = (0 <= x && x < q1) && (y == x);
                boolean col_2 = (q1 <= x && x < q2) && (y == (-x + q2));
                boolean col_3 = (q2 <= x && x < q3) && (y == (x - q2));
                boolean col_4 = (q3 <= x && x <= q4) && (y == (-x + q4));
                if (col_1 || col_2 || col_3 || col_4) {
                    System.out.print(x + 1 + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
