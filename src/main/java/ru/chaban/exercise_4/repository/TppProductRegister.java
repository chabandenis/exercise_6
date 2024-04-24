package ru.chaban.exercise_4.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.chaban.exercise_4.domain.TppProduct;

public interface TppProductRegister extends JpaRepository<TppProduct, Integer> {
}
