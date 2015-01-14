package com.test;

/**
 * 递归打印目录的树状结构
 * @author SilentNight QQ:237951606
 */

import java.io.File;

public class RecursiveDemo {

    public static void main(String[] args) {
        File folder = new File("E:\\电影");//注意转义字符
        String dirTree = getDirTree(folder, 0);
        System.out.println(dirTree);
    }

    /**
     * 获取目录的树状表示形式
     *
     * @param folder 目录或文件夹
     * @param indent 缩进量
     * @return 目录的树状表示形式
     */
    private static String getDirTree(File folder, int indent) {
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory");
        }
        StringBuilder sb = new StringBuilder();

        sb.append(getIndentString(indent))
            .append("+--")
            .append(folder.getName())
            .append("/")
            .append("\n");

        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                sb.append(getDirTree(file, indent + 1));
            } else {
                sb.append(getFileStr(file, indent + 1));
            }
        }
        return sb.toString();
    }

    /**获取文件对应的行字符串
     * @param file 文件
     * @param indent 缩进量
     * @return 行字符串
     */
    private static String getFileStr(File file, int indent) {
        return new StringBuilder()
            .append(getIndentString(indent))
            .append("+--")
            .append(file.getName())
            .append("\n")
            .toString();
    }

    /**根据缩进量获取缩进字符串
     * @param indent 缩进量
     * @return 缩进字符串
     */
    private static String getIndentString(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("|  ");
        }
        return sb.toString();
    }
}