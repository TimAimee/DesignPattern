package com.pattern.behavior.pcommand.cd;

import com.pattern.behavior.pcommand.command.Command;

/**
 * Created by timaimee on 2017/4/14.
 */
public class CdOpenCommand implements Command {
    CD cd;

    public void setCd(CD cd) {
        this.cd = cd;
    }

    @Override
    public void excute() {
        cd.open();
    }

    @Override
    public void undo() {
        cd.close();
    }
}
