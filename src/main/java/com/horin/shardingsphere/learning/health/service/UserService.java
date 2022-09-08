package com.horin.shardingsphere.learning.health.service;

import com.horin.shardingsphere.learning.health.entity.User;
import com.horin.shardingsphere.learning.health.repository.UserRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(
      UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void processUsers() {
    insertUsers();
  }

  public List<User> findAll() {
    return userRepository.findAll();
  }

  private void insertUsers() {
    for (int i = 0; i <= 5; i++) {
      insertUser(i);
    }
  }

  private void insertUser(int i) {
    User user = new User();
    user.setUserId(i);
    user.setUserName("userName" + i);
    userRepository.addEntity(user);
  }

}
