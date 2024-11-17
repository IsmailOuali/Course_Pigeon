package com.example.demo.controller;

import com.example.demo.model.Competition;
import com.example.demo.service.CompetitionServiceInterface;
import com.example.demo.service.impl.CompetitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/competitions")
@RequiredArgsConstructor
public class CompetitionController {


        private final CompetitionServiceInterface competitionService;

        @GetMapping
        public List<Competition> getAllCompetitions() {
            return competitionService.getAllCompetitions();
        }

        @GetMapping("/{id}")
        public Competition getCompetitionById(@PathVariable String id) {
            return competitionService.getCompetitionById(id);
        }

        @PostMapping
        public Competition addCompetition(@RequestBody Competition competition) {
            return competitionService.saveCompetition(competition);
        }

        @DeleteMapping("/{id}")
        public void deleteCompetition(@PathVariable String id) {
            competitionService.deleteCompetition(id);
        }
        @PostMapping("/finish")
        public ResponseEntity<Competition> finishCompetition(@RequestBody String id){
            Competition comp = competitionService.finishCompetition(id);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(comp);
        }

}
