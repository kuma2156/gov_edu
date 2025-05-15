package loop;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        // 단어의 시작이 A 또는 a로 시작하는 단어를 newWords 리스트에 담아서 출력하시오
        List<String> words = List.of("Apple","banana","avocado","carrot");
        List<String> newWords = new ArrayList<>();

        // startsWith() 문자열의 첫번째 문자 확인 함수
        // substring(인덱스 , 어디까지)
//        System.out.println(words.get(0).charAt(0));
        for (int i =0; i < words.size(); i++) {
            if (words.get(i).charAt(0) == 'a' || words.get(i).charAt(0) == 'A' ){
                newWords.add(words.get(i));
            }
        }

        System.out.println(newWords);

        for (String word : words) {
            if (word.startsWith("a") || word.startsWith("A")){
                newWords.add(word);
            }
        }

        System.out.println(newWords);
    }
}
