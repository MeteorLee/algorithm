package lecture.first.ch1배열;

import java.util.ArrayList;
import java.util.List;

public class Array1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        System.out.println("list.get(0) = " + list.get(0));

        list.set(0, 5);
        System.out.println("list.get(0) = " + list.get(0));

        System.out.println("list.size() = " + list.size());

        Integer[][][] dataList = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }

        };

        System.out.println("dataList[0][1][1] = " + dataList[0][1][1]);


        String dataset[] = {
                "Mr.count",
                "Mr.osM",
                "mr.oop"
        };

        Integer count = 0;

        String str = "Mor";

        System.out.println("str.indexOf(\"k\") = " + str.indexOf("k"));

        for (int i = 0; i < dataset.length; i++) {
            if (dataset[i].contains("M")) {
                count++;
            }
        }
        System.out.println("count = " + count);



    }
}
