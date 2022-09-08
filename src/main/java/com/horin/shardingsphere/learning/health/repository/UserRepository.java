package com.horin.shardingsphere.learning.health.repository;

import com.horin.shardingsphere.learning.health.entity.User;
import java.util.List;

public interface UserRepository {

  void addEntity(User user);

  List<User> findAll();

}
