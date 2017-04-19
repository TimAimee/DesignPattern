package com.pattern.behavior.pcommand.light;

import com.pattern.behavior.pcommand.command.Command;

/**
 * Created by timaimee on 2017/4/14.
 */
public class LightOpenCommand implements Command {
    Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.open();
    }

    @Override
    public void undo() {
        light.close();
    }
}
