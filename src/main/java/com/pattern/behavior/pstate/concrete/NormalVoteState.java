package com.pattern.behavior.pstate.concrete;

import com.pattern.behavior.pstate.interfaces.VoteState;

/**
 * Created by timaimee on 2017/6/14.
 */
public class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, com.pattern.behavior.pstate.manager.VoteManager voteManager) {
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("投票成功，您投给了=" + voteItem+",投票数="+voteManager.getMapVoteCount().get(user));
    }
}
