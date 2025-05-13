package service;

public class Main {
    public static void main(String[] args) {
        UserService user1 = UserService.getInstance();
        UserService user2 = UserService.getInstance();
        user1.register("김명규","1234","kuma2156@naver.com","010-5828-2156","부산 남구 용호동",27,"ROLE_ADMIN");
        user2.register("조은별","5555","nct127@naver.com","010-9899-9050","부산 영도",21,"ROLE_USER");

        // 모든 사용자 출력
        user1.printAll();

        // 해당 이름의 사용자 출력
        user1.ByUsername("김명규");
        user2.ByUsername("조은별");
    }
}
