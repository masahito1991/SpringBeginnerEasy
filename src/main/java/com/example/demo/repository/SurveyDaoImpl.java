package com.example.demo.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Survey;

@Repository
public class SurveyDaoImpl implements SurveyDao {

	@Autowired
	public SurveyDaoImpl(JdbcTemplate jdbcTemplate) {
	}

	@Override
	public void insertSurvey(Survey survey) {

		// hands-on

	}

	@Override
	public List<Survey> getAll() {
		// make SQL
		List<Map<String, Object>> resultList = null;
		List<Survey> list = null;

		// Set the data form database into Survey instance

		return list;
	}

}
