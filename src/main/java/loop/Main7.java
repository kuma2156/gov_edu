package loop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StudentName {
    private String name;

    public StudentName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentName{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main7 {
    public static void main(String[] args) {
        // Student 객체들을 전부 StudentName 객체들로 변환하여 리스트를 출력하시오
        List<StudentName> studentNames = new ArrayList<>();
        List<StudentName> studentNames2 = null;
        List<Student> students = List.of(
                new Student("김일",80),
                new Student("김이",94),
                new Student("김삼",75),
                new Student("김사",99),
                new Student("김오",85)
        );

//        for (int i = 0 ; i < students.size(); i++) {
//            studentNames.add(new StudentName(students.get(i).getName()));
//        }
//
//        System.out.println(studentNames.toString());

//        for (Student std : students){
//            studentNames.add(new StudentName(std.getName()));
//        }
//
//        System.out.println(studentNames);

        for (Student std : students) {
            if (std.getScore() > 84) {
                studentNames.add(new StudentName(std.getName()));
            }
        }
        System.out.println("85점 이상인 학생들 이름 : " + studentNames);

        // 위 for 문과 똑같은 식
        studentNames2 = students.stream()
                .filter(student -> student.getScore() > 84)
                .map(student -> new StudentName(student.getName()))
                .collect(Collectors.toList());
        
        
    }
}
