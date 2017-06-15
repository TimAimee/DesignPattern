package com.pattern.behavior.pstate.concrete;

import com.pattern.behavior.pstate.interfaces.VoteState;

/**
 * Created by timaimee on 2017/6/14.
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, com.pattern.behavior.pstate.manager.VoteManager voteManager) {
        // 恶意投票，取消用户的投票资格，并取消投票记录
        String str = voteManager.getMapVote().get(user);
        if (str != null) {
            voteManager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷屏行为，您投给了=" + voteItem + ",投票数=" + voteManager.getMapVoteCount().get(user) + "，取消投票资格");
    }
}
