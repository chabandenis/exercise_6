package ru.chaban.exercise_4.save_data;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import ru.chaban.exercise_4.domain.Users;
import ru.chaban.exercise_4.repository.UsersRepository;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class UsersService implements UsersServiceInterface {
    private final UsersRepository usersRepository;

    @Override
    public void save(List<Users> users) {
        for (Users u : users) {
            if (u ==null){
                System.out.println("ЛОГ !!! пустая строка");
                continue;
            }

            usersRepository.save(u);
        }
    }
}
