package com.pattern.behavior.pstate.interfaces;

import com.pattern.behavior.pstate.manager.VoteManager;

/**
 * Created by timaimee on 2017/6/14.
 */
public interface VoteState {
    void vote(String user, String voteItem, VoteManager voteManager);
}
