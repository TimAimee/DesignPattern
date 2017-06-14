package com.pattern.behavior.pstate;

import com.pattern.behavior.pstate.manager.VoteManager;

/**
 * Created by timaimee on 2017/6/14.
 */
public class ClientState {
    public static void main(String args[]) {
        VoteManager lijinliang = new VoteManager();
        for (int i = 0; i < 9; i++) {
            lijinliang.vote("timaimee", "张冲");
        }
    }
}
