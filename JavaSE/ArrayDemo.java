package test.java;

/**
 * 自由组合数组元素
 * @author SilentNight Q:237951606
 */
public class ArrayDemo {
    public static void main(String[] args) {
//        |   | 3 | 1 | 0 |
//        |---|---|---|---|
//        | 1 | √ | √ | √ |
//        | 2 | √ | √ | √ |
//        | 3 | √ |   | √ |
//        | 4 |   |   | √ |
//
//      将上述勾选项转化为二维数组，上图就是一个表格，因此使用 table 命名对应的二维数组
        int[][] table = {{3,1,0},{3,1,0},{3,0},{0}};
        int[][] resultArr = getResultArr(table);

//      将结果数组转换为字符串形式
        StringBuilder sb = new StringBuilder();
        String separator = ", ";//分隔符
        for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j < resultArr[i].length; j++) {
                sb.append(resultArr[i][j]).append(separator);
            }
            sb.setLength(sb.length() - separator.length());
            sb.append("\r\n");
        }

        System.out.println(sb);//结果如下
//        3, 3, 3, 0
//        3, 1, 0, 0
//        3, 0, 3, 0
//        3, 3, 0, 0
//        3, 1, 3, 0
//        3, 0, 0, 0
//        1, 3, 3, 0
//        1, 1, 0, 0
//        1, 0, 3, 0
//        1, 3, 0, 0
//        1, 1, 3, 0
//        1, 0, 0, 0
//        0, 3, 3, 0
//        0, 1, 0, 0
//        0, 0, 3, 0
//        0, 3, 0, 0
//        0, 1, 3, 0
//        0, 0, 0, 0
    }

    /**获取自由组合的结果数组
     * @param table 源数组
     * @return 结果数组
     */
    private static int[][] getResultArr(int[][] table) {
        int resultArrColCnt = table.length;//结果数组的列数
        int resultArrRowCnt = 1;//结果数组的行数

//      计算最终的结果数组行数
        for (int i = 0; i < table.length; i++) {
            resultArrRowCnt *= table[i].length;
        }

//      确定结果数组的大小
        int[][] resultArr = new int[resultArrRowCnt][resultArrColCnt];

//      填充结果数组第一列
        firstCol(table, resultArrRowCnt, resultArr);
//      填充结果数组的其他列（第一列之后的其他列）
        otherCols(table, resultArrRowCnt, resultArr);

        return resultArr;
    }

    /**填充结果数组第一列
     * @param table 源数组
     * @param resultArrRowCnt 结果数组的行数
     * @param resultArr 结果数组
     */
    private static void firstCol(int[][] table, int resultArrRowCnt, int[][] resultArr) {
        int col = 0;
        int[] arr = table[col];
        int round = arr.length;//填充多少轮
        int times = resultArrRowCnt / round;//每轮填充的次数
        for (int r = 0; r < round; r++) {
            int val = arr[r];//要填充的值

            for (int t = 0; t < times; t++) {
                resultArr[t + (r * times)][col] = val;
            }
        }
    }

    /**填充结果数组的其他列（第一列之后的其他列）
     * @param table 源数组
     * @param resultArrRowCnt 结果数组的行数
     * @param resultArr 结果数组
     */
    private static void otherCols(int[][] table, int resultArrRowCnt, int[][] resultArr) {
        for (int col = 1; col < table.length; col++) {
            int[] arr = table[col];
            for (int i = 0; i < resultArrRowCnt; i++) {
                resultArr[i][col] = arr[i % arr.length];
            }
        }
    }
}
