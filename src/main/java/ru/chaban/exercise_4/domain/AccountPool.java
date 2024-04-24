package ru.chaban.exercise_4.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@ToString
@Data
public class AccountPool {
    @Id
    @GeneratedValue
    Integer id;
    String branchCode;
    String currencyCode;
    String mdmCode;
    String priorityCode;
    String registryTypeCode;
}
