package loop;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        // 문자열의 길이가 5이상인 단어의 개수를 출력하시오.
        List<String> word = List.of("apple","cat","banana","dog","grapes");
        List<String> word5 = new ArrayList<>();
        for (int i = 0; i < word.size(); i++){
            if(word.get(i).length() > 4){
                word5.add(word.get(i));
            }
        }
        System.out.println(word5.size());
    }
}
