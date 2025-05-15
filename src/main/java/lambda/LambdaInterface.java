package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaInterface {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("메인문 처럼 쓸 수 있음");
        };

        runnable.run();

        Supplier<Double> supplier = () -> 10.10;
        System.out.println(supplier.get());

        Consumer<Integer> consumer = n -> {
            System.out.println("consumer : " + n);
        };

        consumer.accept(8);

        List<Integer> numList = List.of(10,20,30,40);
        numList.forEach(n -> System.out.println("number : " + n));

        Function<String, String> fx = name -> "name : " + name;
        System.out.println(fx.apply("ddingyu"));

        String searchName = "김명규";
        List<String> 일학년이름 = List.of("김명규","조은별","박두");
        List<String> 이학년이름 = List.of("김4","조5","박6");

        Predicate<List<String>> isContain = list -> list.contains(searchName);
        System.out.println(isContain.test(일학년이름));
        System.out.println(isContain.test(이학년이름));

        Predicate<String> isContain2 = name -> 일학년이름.contains(name) || 이학년이름.contains(name);
        System.out.println(isContain2.test(searchName));;

        List<String> dataList =List.of("aaa","bbb","ccc","aba","cac");
        List<String> dataA = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++){
            System.out.println(dataList.get(i));
            if(dataList.get(i).contains("a")){
                dataA.add(dataList.get(i));
            }
        }
        dataA.forEach(a -> System.out.print(a +" "));

        List<String> dataList2 = dataList.stream().filter(data -> dataList.contains("a")).collect(Collectors.toList());

//        for (String data : dataList){
//            if (data.contains("a")) dataA.add(data);
//        }

//        Stream<Integer> numStream = List.of(1, 2, 3, 4).stream();
        /*
           스트림 구성 (단계)
           1. 스트림 생성
           2. 중간 연산(조건에 맞는 데이터 구분, 데이터 값 수정, 정렬, 중복 제거, 제한, 건너뛰기)
           3. 최종 연산(반복, 결과 수집, 개수 조회, 매칭 여부, 검색, 합산)

           특징 : 반복 중 뒤로 돌아갈 수 없다.
        * */
        System.out.println("\n--------------");
        // 1. 스트림 생성 1단계
        Stream<Integer> numStream = Stream.of(1, 2, 3, 4);
        //      중간 연산 (필터)(Stream 을 리턴함)        최종 연산(반복)
        numStream.filter(num -> num % 2 == 0).forEach(n -> System.out.println(n));
        List<Integer> numList2 = List.of(1, 2, 3, 4);
        for (Integer num : numList2){
            if(num % 2 == 0){
                System.out.println(num);
            }
        }


    }
}
