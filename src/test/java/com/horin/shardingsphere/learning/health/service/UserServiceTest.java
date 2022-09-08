package com.horin.shardingsphere.learning.health.service;

import com.horin.shardingsphere.learning.health.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK, classes = Application.class)
class UserServiceTest {

  @Autowired
  private UserService userService;

  @Test
  void processUsers() {
    userService.processUsers();
  }

  @Test
  void findAllUsers() {
    System.out.println(userService.findAll());
    System.out.println(userService.findAll());
  }

}
