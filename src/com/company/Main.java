package com.company;

public class Main {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        long sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += i;
        }
        stopWatch.end();
        System.out.println("Execution time of loop is: " + stopWatch.getElapsedTime());
    }
}
