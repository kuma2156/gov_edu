package lambda;

import java.lang.invoke.LambdaConversionException;

public class Main {
    public static void main(String[] args) {
        아무거나가능한인터페이스 a = new 식사();
        아무거나가능한인터페이스 b = new 운동();
        a.실행();
        b.실행();
        아무거나가능한인터페이스 c = new 아무거나가능한인터페이스() {
            @Override
            public void 실행(){
                System.out.println("태어나겠다.");
            }
        };
        c.실행();

        // 람다식을 정의 할 때 꼭 지켜야하는 조건 -> 추상 메서드 1개만 있어야 함
        아무거나가능한인터페이스 d = () -> {
            System.out.println("죽겠다.");
        };

        d.실행();

        아무거나가능한인터페이스2 e = (String data1, String data2) -> {
            return data1 + data2;
        };
        String e결과 = e.실행("데이터1","데이터2");
        System.out.println(e결과);

        // 매게변수의 자료형을 생략 할 수 있고 변수명 변경 가능
        아무거나가능한인터페이스2 f = (d1, d2) -> {
            return d1 + d2;
        };

        // 재정의 함수 내용이 한줄의 명령이면 {} 중괄호 생략가능
        // 단, 리턴이 있는 경우 리턴 값만 한줄로 작성해야 한다.
        아무거나가능한인터페이스 g = () -> System.out.println("한줄 명령 실행 중괄호{} 생략");
        아무거나가능한인터페이스2 g2 = (d1, d2) -> d1 + d2;
        System.out.println(g2.실행("ra","ra"));

        // 매게변수가 하나면 매게변수를 감싸는 () 소괄호를 생략가능하다
        아무거나가능한인터페이스3 h = data -> "data : " + data;
        String h결과 = h.실행("아무 데이터");
        System.out.println(h결과);

        // 람다식을 정의 할 때 꼭 지켜야하는 조건 -> 무조건 추상 메서드 1개만 있어야 함
    }
}
