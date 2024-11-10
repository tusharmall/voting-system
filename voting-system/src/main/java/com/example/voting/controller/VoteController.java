package com.example.voting.controller;

import com.example.voting.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class VoteController {
    @Autowired
    private VoteService voteService;

    @GetMapping("/entercandidate")
    public String enterCandidate(@RequestParam String name) {
        return voteService.enterCandidate(name);
    }

    @GetMapping("/castvote")
    public String castVote(@RequestParam String name) {
        return voteService.castVote(name);
    }

    @GetMapping("/countvote")
    public Integer countVote(@RequestParam String name) {
        return voteService.countVote(name);
    }

    @GetMapping("/listvote")
    public Map<String, Integer> listVotes() {
        return voteService.listVotes();
    }

    @GetMapping("/getwinner")
    public String getWinner() {
        return voteService.getWinner();
    }
}
