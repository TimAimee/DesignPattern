package com.pattern.behavior.pstate.manager;

import com.pattern.behavior.pstate.concrete.BlackVoteState;
import com.pattern.behavior.pstate.concrete.NormalVoteState;
import com.pattern.behavior.pstate.concrete.RepeatVoteState;
import com.pattern.behavior.pstate.concrete.SpiteVoteState;
import com.pattern.behavior.pstate.interfaces.VoteState;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by timaimee on 2017/6/14.
 */
public class VoteManager {
    private VoteState state;
    private Map<String, String> mapVote = new HashMap<>();
    private Map<String, Integer> mapVoteCount = new HashMap<>();

    public Map<String, String> getMapVote() {
        return mapVote;
    }


    public Map<String, Integer> getMapVoteCount() {
        return mapVoteCount;
    }

    public void vote(String user, String voteItem) {
        Integer oldCount = mapVoteCount.get(user);
        if (oldCount == null) {
            oldCount = 0;
        }
        oldCount = oldCount + 1;
        mapVoteCount.put(user, oldCount);

        if (oldCount == 1) {
            state = new NormalVoteState();
        } else if (oldCount < 5) {
            state = new RepeatVoteState();
        } else if (oldCount < 8) {
            state = new SpiteVoteState();
        } else {
            state = new BlackVoteState();
        }

        state.vote(user, voteItem, this);
    }


}
