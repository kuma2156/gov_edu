package oop;

public class BasicUserService {
    // Service 입장에선 Repository가 있어야지만 addUser를 사용가능하므로 의존하고 있다
    private UserRepository userRepository;

    public BasicUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(){
        System.out.println("기본 사용자 추가");
        userRepository.insert();
    }
}
