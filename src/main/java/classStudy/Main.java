package classStudy;

// 인터페이스는 변수를 선언할 수 없다. 즉 상수이다.
// 모든 필드가 static 의 키워드를 가지고 있다.
//interface UserService{
//    String userType = "관리자";
//}

import java.util.ArrayList;
import java.util.List;

// 싱글톤 패턴
class UserAndAdminRepository {
    List<User> userList = new ArrayList<>();
    private static UserAndAdminRepository instance;

    private UserAndAdminRepository(){}

    static UserAndAdminRepository getInstance(){
        if(instance == null){
            instance = new UserAndAdminRepository();
        }
        return instance;
    }

    void insert(){
        userList.add(new User());
        System.out.println("사용자 또는 관리자 정보 추가");
    }
    void delete(){
        userList.remove(new User());
        System.out.println("사용자 또는 관리자 정보 삭제");
    }
}

class AdminService {
    void addAdmin(){
        UserAndAdminRepository.getInstance().insert();
    }

    void removeAdmin(){
        UserAndAdminRepository.getInstance().delete();
    }
}

class UserService {
    void addUser(){
        UserAndAdminRepository.getInstance().insert();
    }
    void removeUser(){
        UserAndAdminRepository.getInstance().delete();
    }
}

class User {
    static String userType = "사용자";
    String username = "user1";
    String password = "pw1";

}

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.username = "testUser1";
        User user2 = new User();

        User.userType = "관리자";
//        user1.userType    // << "관리자"
//        UserService.userType = "사용자"; // 상수의 값은 당연히 바꿀 수 없다.


        AdminService adminService = new AdminService();
        UserService userService = new UserService();
    }
}
