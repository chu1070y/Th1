package org.zerock;

public class Main {

    public static void main(String[] args) {

        Horse[] arr = new Horse[4];
        arr[0] = new Horse("김가익");
        arr[1] = new Horse("추연훈");
        arr[2] = new Horse("이호중");
        arr[3] = new Horse("박가영");

        for(Horse h: arr){
            h.start();
        }

//        Looper looper = new Looper();
//
//        new Thread(()->{
//            looper.loop();
//        }).start();
//
//        new Thread(()->{
//            looper.loop();
//        }).start();
//
//        looper.loop();



    }
}
