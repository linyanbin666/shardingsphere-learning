package com.horin.shardingsphere.learning.health.entity;

import lombok.Data;

@Data
public class HealthTask {
  private Long taskId;
  private Long recordId;
  private Integer userId;
  private String taskName;
}
