package service;

import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserService extends User {
    private ArrayList<User> usersList = new ArrayList<>();
    private static UserService instance = null;


    private UserService() {}

    public static UserService getInstance() {
        if(instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public void register(String name, String password,String email,String phone,String address,int age,String roles) {
        User user = new User();
        user.setUsername(name);
        user.setPassword(password);
        user.setPhone(phone);
        user.setAge(age);
        user.setEmail(email);
        user.setAddress(address);
        user.setRoles(roles);

        usersList.add(user);
    }

    public void printAll(){
        System.out.println("사용자 정보 출력");
        System.out.println(usersList.toString());
    }

    public void ByUsername(String name){
        for(User user : usersList){
            if(user.getUsername().equals(name)){
                System.out.println(user.getUsername() +"님의 사용자의 정보");
                System.out.println(user);
            }
        }
    }

}
