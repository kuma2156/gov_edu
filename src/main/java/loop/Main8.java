package loop;

import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        // newWords 에 1. bread 2. milk .. 이런식으로 앞에 숫자를 붙여서 옮기기
        List<String> words = List.of("bread","milk","egg");
        List<String> newWords1 = new ArrayList<>();

        int count = 0;
        for (String word : words) {
            count++;
            newWords1.add(count + ". " + word);
        }
        System.out.println(newWords1);

        // ints 리스트에 Integer 자료형으로 옮기기
        List<Double> doubles = List.of(1.12,2.23,3.34,4.45);
        List<Integer> ints = new ArrayList<>();

        for (Double i : doubles) {
            ints.add(i.intValue());
        }

        System.out.println(ints);
    }
}
