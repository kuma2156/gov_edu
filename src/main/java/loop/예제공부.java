package loop;

import java.util.List;
import java.util.stream.Collectors;

public class 예제공부 {
    public static void main(String[] args) {
        // 정수 리스트가 주어졌을 때, 짝수인 수만 골라내서 그 제곱값들의 리스트를 출력하시오.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> even = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(even);

        // 학생 리스트가 있을 때, 점수가 90점 이상인 학생 이름만 대문자로 모아서 리스트로 만드시오.
        List<Student> students = List.of(
                new Student("kim", 85),
                new Student("park", 92),
                new Student("lee", 95),
                new Student("choi", 88)
        );


        List<String> newStudent = students.stream()
                .filter(score -> score.getScore() > 89)
                .map(student -> student.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(newStudent);
    }
}
