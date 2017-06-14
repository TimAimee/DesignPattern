package com.pattern.behavior.pstate.concrete;

import com.pattern.behavior.pstate.interfaces.VoteState;

/**
 * Created by timaimee on 2017/6/14.
 */
public class BlackVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, com.pattern.behavior.pstate.manager.VoteManager voteManager) {
        //记录黑名单中，禁止登录系统
        System.out.println("你有恶意刷屏行为，您投给了=" + voteItem + ",投票数=" + voteManager.getMapVoteCount().get(user) + "，进入黑名单，将禁止登录和使用本系统");
    }

}
