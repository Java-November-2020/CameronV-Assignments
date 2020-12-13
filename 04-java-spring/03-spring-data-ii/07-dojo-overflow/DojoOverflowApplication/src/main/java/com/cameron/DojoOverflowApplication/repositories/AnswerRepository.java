package com.cameron.DojoOverflowApplication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cameron.DojoOverflowApplication.models.Answer;
@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long>{

}
