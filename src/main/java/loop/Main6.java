package loop;

import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        // 학생들의 전체 평균 점수를 출력하시오
        int avg = 0;
        List<Student> students = List.of(
                new Student("김일",80),
                new Student("김이",94),
                new Student("김삼",75),
                new Student("김사",99),
                new Student("김오",85)

        );

        for (Student std : students) {
            avg += std.getScore();
        }

        System.out.println("평균 점수: " + (double) avg / students.size());
    }
}
