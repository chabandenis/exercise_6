package ru.chaban.exercise_4.utility;

import ru.chaban.exercise_4.data.RawInFile;
import ru.chaban.exercise_4.domain.Logins;

import java.util.List;

public interface ConvertRawToLoginsInteface {
    List<Logins> getLogins(List<RawInFile> rawInFiles);

    Logins convertFromRowInFile(RawInFile rawInFile);
}
