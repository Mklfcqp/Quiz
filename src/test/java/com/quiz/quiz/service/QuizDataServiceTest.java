package com.quiz.quiz.service;

import static com.quiz.quiz.Difficulty.*;
import static org.junit.jupiter.api.Assertions.*;

import com.quiz.quiz.Difficulty;
import com.quiz.quiz.entity.DTO.CategoryQuestionCountInfoDto;
import org.junit.jupiter.api.Test;

import java.util.Map;


class QuizDataServiceTest {

    @Test
    void calculateEachDifficultyQuestionCount_basicEasy() {
        CategoryQuestionCountInfoDto categoryQuestionCount = new CategoryQuestionCountInfoDto(5, 17, 13);
        Map<Difficulty, Integer> result = QuizDataService.calculateEachDifficultyQuestionCount(20, EASY, categoryQuestionCount);

        assertEquals(5, result.get(EASY));
        assertEquals(15, result.get(MEDIUM));
        assertNull(result.get(HARD));
    }
}