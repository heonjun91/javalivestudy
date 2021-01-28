package com.javalivestudy.assignment9;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {

        //모든작업을 끝내고나서 .close()를 내부적으로 자동수행
        try(FileWriter f = new FileWriter("test.txt")){
            f.write("TryWithResourceTest");
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
