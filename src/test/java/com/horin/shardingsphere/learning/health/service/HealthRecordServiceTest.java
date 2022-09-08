package com.horin.shardingsphere.learning.health.service;

import com.horin.shardingsphere.learning.health.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK, classes = Application.class)
class HealthRecordServiceTest {

  @Autowired
  private HealthRecordService healthRecordService;

  @Test
  void testProcessHealthRecords() {
      healthRecordService.processHealthRecords();
  }

}
