package ru.chaban.exercise_4.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.chaban.exercise_4.domain.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
