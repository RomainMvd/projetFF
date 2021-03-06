package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Evaluation;
import com.inti.repository.EvaluationRepository;
import com.inti.service.interfaces.IEvaluationService;

@Service
public class EvaluationService implements IEvaluationService {

	@Autowired
	EvaluationRepository evaluationRepository;

	@Override
	public List<Evaluation> findAll() {
		return evaluationRepository.findAll();
	}

	@Override
	public Evaluation findOne(Long idEvaluation) {
		return evaluationRepository.findById(idEvaluation).get();
	}

	@Override
	public Evaluation save(Evaluation evaluation) {
		return evaluationRepository.save(evaluation);
	}

	@Override
	public void delete(Long idEvaluation) {
		evaluationRepository.deleteById(idEvaluation);
	}

	@Override
	public Evaluation findByIdEvaluationAndNomCours(Long idEvaluation, String nomCours) {
		return evaluationRepository.findByIdEvaluationAndNomCours(idEvaluation, nomCours);
	}

}
