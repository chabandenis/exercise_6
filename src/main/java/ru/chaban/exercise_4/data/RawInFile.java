package ru.chaban.exercise_4.data;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

/*
    Структура идентична данным в файле импорта
 */

@ToString
@Data
public class RawInFile {

// users атрибуты
    private Integer id;

    private LocalDate access_date;

    private Integer userId;

    private String application;

// logins атрибуты
    private Integer id_user;

    private String fio;

    private String username;

}
