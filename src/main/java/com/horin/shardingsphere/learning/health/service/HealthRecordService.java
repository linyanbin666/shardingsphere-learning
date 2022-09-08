package com.horin.shardingsphere.learning.health.service;

import com.horin.shardingsphere.learning.health.entity.HealthRecord;
import com.horin.shardingsphere.learning.health.entity.HealthTask;
import com.horin.shardingsphere.learning.health.repository.HealthRecordRepository;
import com.horin.shardingsphere.learning.health.repository.HealthTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class HealthRecordService {

  private final HealthRecordRepository healthRecordRepository;
  private final HealthTaskRepository healthTaskRepository;

  public HealthRecordService(
      HealthRecordRepository healthRecordRepository,
      HealthTaskRepository healthTaskRepository) {
    this.healthRecordRepository = healthRecordRepository;
    this.healthTaskRepository = healthTaskRepository;
  }

  public void processHealthRecords() {
    insertHealthRecords();
  }

  private void insertHealthRecords() {
    for (int i = 0; i <= 10; i++) {
      HealthRecord healthRecord = insertHealthRecord(i);
      insertHealthTask(i, healthRecord);
    }
  }

  private HealthRecord insertHealthRecord(int i) {
    HealthRecord healthRecord = new HealthRecord();
    healthRecord.setUserId(i);
    healthRecord.setLevelId(i % 5);
    healthRecord.setRemark("Remark" + i);
    healthRecordRepository.addEntity(healthRecord);
    return healthRecord;
  }

  private void insertHealthTask(int i, HealthRecord healthRecord) {
    HealthTask healthTask = new HealthTask();
    healthTask.setRecordId(healthRecord.getRecordId());
    healthTask.setUserId(i);
    healthTask.setTaskName("TaskName" + i);
    healthTaskRepository.addEntity(healthTask);
  }


}
