package com.horin.shardingsphere.learning.health.repository;

import com.horin.shardingsphere.learning.health.entity.HealthRecord;

public interface HealthRecordRepository {

  void addEntity(HealthRecord healthRecord);

}
