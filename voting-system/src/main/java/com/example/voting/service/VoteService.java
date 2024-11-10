package com.example.voting.service;

import com.example.voting.model.Candidate;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@Service
public class VoteService {
    private final Map<String, Candidate> candidates = new HashMap<>();

    public String enterCandidate(String name) {
        candidates.putIfAbsent(name, new Candidate(name));
        return "Candidate " + name + " added successfully!";
    }

    public String castVote(String name) {
        Candidate candidate = candidates.get(name);
        if (candidate != null) {
            candidate.incrementVote();
            return "Vote cast for " + name + ". Total votes: " + candidate.getVoteCount();
        }
        return "Candidate not found.";
    }

    public Integer countVote(String name) {
        Candidate candidate = candidates.get(name);
        return (candidate != null) ? candidate.getVoteCount() : null;
    }

    public Map<String, Integer> listVotes() {
        Map<String, Integer> results = new HashMap<>();
        for (Candidate candidate : candidates.values()) {
            results.put(candidate.getName(), candidate.getVoteCount());
        }
        return results;
    }

    public String getWinner() {
        return candidates.values().stream()
                .max(Comparator.comparingInt(Candidate::getVoteCount))
                .map(Candidate::getName)
                .orElse("No candidates available");
    }
}
