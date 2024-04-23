package ru.chaban.exercise_4.utility;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.text.WordUtils;
import org.springframework.stereotype.Component;
import ru.chaban.exercise_4.data.RawInFile;
import ru.chaban.exercise_4.domain.Users;
import ru.chaban.exercise_4.service.LogTransformation;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class ConvertRawToUsers implements ConvertRawToUsersInteface{

    @Override
    @LogTransformation
    public List<Users> getUsers(List<RawInFile> rawInFiles) {
        List<Users> users = new ArrayList<>();

        for (RawInFile r :rawInFiles){
            users.add(convertFromRowInFile(r));
        }

        return users;
    }

    @Override
    @LogTransformation
    public Users convertFromRowInFile(RawInFile rawInFile) {
        if (rawInFile.getAccess_date() == null)
            return null;

        Users users = new Users();
        users.setId(rawInFile.getId());
        users.setUsername(rawInFile.getUsername());
        users.setFio(WordUtils.capitalizeFully(rawInFile.getFio()));
        return users;
    }
}
