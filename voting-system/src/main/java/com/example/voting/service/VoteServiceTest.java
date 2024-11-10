package com.example.voting.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class VoteServiceTest {

    @Autowired
    private VoteService voteService;

    @Test
    public void testEnterCandidate() {
        assertEquals("Candidate ajay added successfully!", voteService.enterCandidate("ajay"));
    }

    @Test
    public void testCastVote() {
        voteService.enterCandidate("ajay");
        assertEquals("Vote cast for ajay. Total votes: 1", voteService.castVote("ajay"));
    }

    @Test
    public void testCountVote() {

        voteService.enterCandidate("ajay");
        voteService.castVote("ajay");
        assertEquals(1, voteService.countVote("ajay"));
    }

    @Test
    public void testListVotes() {
        voteService.enterCandidate("ajay");
        voteService.castVote("ajay");
        assertEquals(1, voteService.listVotes().get("ajay"));
    }

    @Test
    public void testGetWinner() {
        voteService.enterCandidate("ajay");
        voteService.enterCandidate("raj");
        voteService.castVote("ajay");
        assertEquals("ajay", voteService.getWinner());
    }
}
