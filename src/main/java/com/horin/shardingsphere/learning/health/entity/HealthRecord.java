package com.horin.shardingsphere.learning.health.entity;

import lombok.Data;

@Data
public class HealthRecord {
  private Long recordId;
  private Integer userId;
  private Integer levelId;
  private String remark;
}
