package com.example.demo.service.impl;

import com.example.demo.model.Competition;
import com.example.demo.repository.CompetitionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionService {
    private CompetitionRepository competitionRepository;

    public Competition getCompetitionById(long id){
            return competitionRepository.findById(id).get();
    }
    public List<Competition> getAllCompetitions(){
        return competitionRepository.findAll();
    }
    public Competition saveCompetition(Competition competition){
        return competitionRepository.save(competition);
    }
    public Competition updateCompetition(Competition competition){
        return competitionRepository.save(competition);
    }
    public void deleteCompetition(long id){
        competitionRepository.deleteById(id);
    }
}