package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByBoss();
    }

    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(혼자) " + i + " 번방 청소중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanByBoss(){
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("(사장) " + i + " 번방 청소중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
