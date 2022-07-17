package com.pnac.examportal.service;

import java.util.Set;

import com.pnac.examportal.DTO.QuizDTO;
import com.pnac.examportal.entity.exam.Quiz;

public interface QuizService {
	public Quiz addQuiz(QuizDTO quizDTO);

	public Quiz updateQuiz(QuizDTO quizDTO);

	public Set<Quiz> getQuizzes();

	public Quiz getQuiz(Long id);

	public void deleteQuiz(Long id);
}
