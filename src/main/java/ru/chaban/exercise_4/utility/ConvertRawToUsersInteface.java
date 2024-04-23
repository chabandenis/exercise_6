package ru.chaban.exercise_4.utility;

import ru.chaban.exercise_4.data.RawInFile;
import ru.chaban.exercise_4.domain.Users;

import java.util.List;

public interface ConvertRawToUsersInteface {
    List<Users> getUsers(List<RawInFile> rawInFiles);

    Users convertFromRowInFile(RawInFile rawInFile);
}
