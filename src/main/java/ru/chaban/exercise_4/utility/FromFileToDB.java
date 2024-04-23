package ru.chaban.exercise_4.utility;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.chaban.exercise_4.data.GetRawTest;
import ru.chaban.exercise_4.data.RawInFile;
import ru.chaban.exercise_4.domain.Logins;
import ru.chaban.exercise_4.domain.Users;
import ru.chaban.exercise_4.save_data.LoginsServiceInteface;
import ru.chaban.exercise_4.save_data.UsersServiceInterface;
import ru.chaban.exercise_4.service.Utils;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class FromFileToDB {

    private final GetRawTest getRawFromFile;
    private final ConvertRawToUsersInteface convertRawToUsers;
    private final ConvertRawToLoginsInteface convertRawToLogins;
    private final UsersServiceInterface usersServiceInterface;
    private final LoginsServiceInteface loginsServiceInterface;

    public void doIt() {
        ConvertRawToUsersInteface convertRawToUsersUpdate = (ConvertRawToUsersInteface)Utils.cache(convertRawToUsers);

        // Шаг 1 чтение
        List<RawInFile> rawInFiles = getRawFromFile.get();
        System.out.println(rawInFiles);


        //шаг 2 преобразование
        System.out.println("Шаг2");
        convertRawToUsersUpdate.convertFromRowInFile(rawInFiles.get(0));

        List<Users> users = convertRawToUsersUpdate.getUsers(rawInFiles);
        System.out.println(users);

        //шаг 3 сохранить в базу
        usersServiceInterface.save(users);
        System.out.println("сохранили пользователей");

        // преобразование
        List<Logins> logins = convertRawToLogins.getLogins(rawInFiles);
        System.out.println(logins);

        // сохранить
        loginsServiceInterface.save(logins);
        System.out.println("Сохранили логины");
    }
}
