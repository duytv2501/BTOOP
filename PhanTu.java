package week10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PhanTu <T> {
    private T a;

    public boolean isGreaterThan(T a) {
        return this.equals(a);
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = new ArrayList<>();
        File file = new File(args[0]);
        BufferedReader reader = null;
        Scanner sc = new Scanner(new File(args[0]));
        try {
            while (sc.hasNextInt()) {
                list.add((sc.nextInt()));
            }
        }  finally {
            try {
                Collections.sort(list);
                Writer wr = new FileWriter(args[0]);
                list.forEach(x -> {
                    try {
                        wr.write(x);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
    }
}
