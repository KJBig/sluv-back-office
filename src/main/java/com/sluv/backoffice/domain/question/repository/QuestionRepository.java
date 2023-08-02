package com.sluv.backoffice.domain.question.repository;

import com.sluv.backoffice.domain.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
