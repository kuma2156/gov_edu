package loop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        // 중복된 단어를 제거하고 출력하기
        List<String> words  = List.of("apple","banana","apple","grape","banana");
        Set<String> wordsSet = new HashSet<>(words);

        wordsSet.forEach(e -> System.out.println("중복을 제거 : " + e));
    }
}
