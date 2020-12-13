package com.cameron.DojoOverflowApplication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cameron.DojoOverflowApplication.models.Answer;
import com.cameron.DojoOverflowApplication.models.NewQuestion;
import com.cameron.DojoOverflowApplication.models.Question;
import com.cameron.DojoOverflowApplication.models.Tag;
import com.cameron.DojoOverflowApplication.repositories.AnswerRepository;
import com.cameron.DojoOverflowApplication.repositories.QuestionRepository;
import com.cameron.DojoOverflowApplication.repositories.TagRepository;

@Service
public class AppService {
	private QuestionRepository qRepo;
	private TagRepository tRepo;
	private AnswerRepository aRepo;
	public AppService(QuestionRepository qRepo, AnswerRepository aRepo, TagRepository tRepo) {
		this.qRepo = qRepo;
		this.tRepo = tRepo;
		this.aRepo = aRepo;
	}
	public List<Question> getQuestions() {
		return this.qRepo.findAll();
	}
	public Question getQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	public void createQuestion(NewQuestion question) {
		// TODO: make a real question here
		List<Tag> questionsTags = new ArrayList<Tag>();
		for(String subject: question.splitTags()) {
			Tag tag = this.tRepo.findBySubject(subject).orElse(null);
			if(tag == null) {
				tag = new Tag(subject);
				this.tRepo.save(tag);
			}
			// prevent dupe tags
			if(!questionsTags.contains(tag))
				questionsTags.add(tag);
		}
		Question newQuestion = new Question(question.getQuestion(), questionsTags);
		this.qRepo.save(newQuestion);
	}
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
}
