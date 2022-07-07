package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake user list
    List<User> list = List.of(
            new User(1311L, "Durgesh", "123456789L"),
            new User(1312L, "Tiwari", "987654321"),
            new User(1313L, "Ravi", "888")
    );

    @Override
    public User getuser(Long id) {
        return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
