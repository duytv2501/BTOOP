
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PhanTu <T extends Comparable<T>> {
    private T t;

    public boolean isGreaterThan(T a) {
        return t.compareTo(a) > 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = null;
        Scanner sc = new Scanner(new File(args[0]));
        try {
            while (sc.hasNextInt()) {
                list.add((sc.nextInt()));
            }
        }  finally {
            try {
                Collections.sort(list);
                Writer wr = new FileWriter(args[1]);
                list.forEach(x -> {
                    try {
                        wr.write(x);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            } catch (IOException ignored) {
            }
        }
    }
}