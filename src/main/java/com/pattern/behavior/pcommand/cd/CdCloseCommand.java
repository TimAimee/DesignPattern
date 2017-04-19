package com.pattern.behavior.pcommand.cd;

import com.pattern.behavior.pcommand.command.Command;

/**
 * Created by timaimee on 2017/4/14.
 */
public class CdCloseCommand implements Command {
    CD cd;

    public void setCd(CD cd) {
        this.cd = cd;
    }

    @Override
    public void excute() {
        cd.close();
    }

    @Override
    public void undo() {
        cd.open();
    }
}
