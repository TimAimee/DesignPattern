package com.pattern.behavior.pcommand.light;

import com.pattern.behavior.pcommand.command.Command;

/**
 * Created by timaimee on 2017/4/14.
 */
public class LightCloseCommand implements Command {
    Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.close();
    }

    @Override
    public void undo() {
        light.open();
    }
}
