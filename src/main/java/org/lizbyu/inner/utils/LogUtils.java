package org.lizbyu.inner.utils;

import java.util.Arrays;
import java.util.List;

public class LogUtils {
    public static void d(String TAG, Object xMsg){
        String logLevel = "D/";
        String content = constructLogContent(logLevel, TAG, xMsg.toString());
        System.out.println(content);
    }

    public static void d(String TAG, String msg){
        String logLevel = "D/";
        String content = constructLogContent(logLevel, TAG, msg);
        System.out.println(content);
    }

    public static void e(String TAG, String msg){
        String logLevel = "E/";
        String content = constructLogContent(logLevel, TAG, msg);
        System.out.println(content);
    }

    public static void d(String TAG, List<?> list){
        String logLevel = "D/";
        String msg = Arrays.toString(list.toArray());
        String content = constructLogContent(logLevel, TAG, msg);
        System.out.println(content);
    }

    public static void d(String TAG, int[] array){
        String logLevel = "D/";
        String msg = Arrays.toString(array);
        String content = constructLogContent(logLevel, TAG, msg);
        System.out.println(content);
    }

    public static void d(String TAG, char[] chArray){
        String logLevel = "D/";
        String msg = Arrays.toString(chArray);
        String content = constructLogContent(logLevel, TAG, msg);
        System.out.println(content);
    }

    public static void d(String TAG, Object[] array){
        String logLevel = "D/";
        String msg = Arrays.toString(array);
        String content = constructLogContent(logLevel, TAG, msg);
        System.out.println(content);
    }

    public static void d(String TAG, int[][] array){
        String logLevel = "D/";
        String msg = getTwoDimensionArrayMsg(array);
        String content = constructLogContent(logLevel, TAG, msg);
        System.out.println(content);
    }

    private static String getTwoDimensionArrayMsg(int[][] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int[] ints : array) {
            sb.append(Arrays.toString(ints));
        }
        sb.append("]");
        return sb.toString();
    }

    private static String constructLogContent(String logLevel, String TAG, String msg) {
        return currentTime() + logLevel + getTagMessage(TAG) + msg;
    }

    private static String currentTime() {
        return TimeUtils.getCurrentTime();
    }

    private static String getTagMessage(String TAG) {
        return TAG + ": ";
    }
}
