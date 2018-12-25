package com.pedantic;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Anton Sustavov
 * @since 2018/12/25
 */
public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Li");
        stringSet.add("Lo");
        stringSet.add("Lu");

        System.out.println(System.out);
        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        }));
        for (String str :
                stringSet) {
            System.out.println(str);
        }
    }
}
