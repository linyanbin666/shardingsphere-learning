package com.horin.shardingsphere.learning.health.repository;

import com.horin.shardingsphere.learning.health.entity.HealthTask;

public interface HealthTaskRepository {

  void addEntity(HealthTask healthTask);

}
