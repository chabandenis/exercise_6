package ru.chaban.exercise_4.save_data;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import ru.chaban.exercise_4.domain.Logins;
import ru.chaban.exercise_4.repository.LoginsRepository;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class LoginsService implements LoginsServiceInteface {

    private final LoginsRepository loginsRepository;

    @Override
    public void save(List<Logins> logins) {
        for (Logins l : logins) {
            if (l ==null){
                System.out.println("ЛОГ !!! пустая строка");
                continue;
            }
            loginsRepository.save(l);
        }
    }
}
