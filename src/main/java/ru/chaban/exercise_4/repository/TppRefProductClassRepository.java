package ru.chaban.exercise_4.repository;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.chaban.exercise_4.domain.TppRefProductClass;

public interface TppRefProductClassRepository extends JpaRepository<TppRefProductClass, Integer> {
}
