package ru.chaban.exercise_4.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@ToString
@Data
public class TppRefProductClass {
    @Id
    @GeneratedValue
    Integer internal_id;
    String value;
    String gbi_code;
    String gbi_name;
    String product_row_code;
    String product_row_name;
    String subclass_code;
    String subclass_name;
}
