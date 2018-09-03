package org.zerock;

import java.io.InputStream;
import java.net.URL;

public class MultiRequest {
    //bad code
    public static void main(String[] args) throws Exception{

        String str ="http://book.interpark.com/bookPark/html/book.html?smid1=header&smid2=book";

        for(int i=1;i<24000;i++){

            int finalI = i;
            new Thread(()->{

                try {
                    URL url = new URL(str + (finalI%240)+1);
                    System.out.println(str+ finalI);
                    InputStream in = url.openStream();
                    in.close();
                }catch(Exception e){
                }
            }).start();

        }
    }
}
