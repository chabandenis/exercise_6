package ru.chaban.exercise_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chaban.exercise_4.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
