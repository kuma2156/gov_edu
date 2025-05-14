package generic;

public class Main {
    /*
        와일드 카드(?) 제약조건
        1. ? extends 클래스자료형 -> "읽기 전용" 하위 타입용 / 해당 클래스 자료형의 자식 클래스자료형만 허용
        2. ? super 클래스자료형 ->  "쓰기 전용" 상위 타입용 / 해당 클래스 자료형의 부모 클래스자료형만 허용
    * */
    public static void showAll(Repogitory<? extends Student> repogitory){
        repogitory.findAll().forEach(System.out::println);
    }
    public static void main(String[] args) {
        Repogitory<HighStudent> hsRepo = new Repogitory<>();
        Repogitory<AcademyStudent> acRepo = new Repogitory<>();

        hsRepo.save(new HighStudent());
        acRepo.save(new AcademyStudent());

        hsRepo.findAll().forEach(s -> s.toString());
        acRepo.findAll().forEach(s -> s.getName());

        showAll(hsRepo);
        showAll(acRepo);
    }
}
