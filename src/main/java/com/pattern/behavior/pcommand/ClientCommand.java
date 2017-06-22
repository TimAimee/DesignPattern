package com.pattern.behavior.pcommand;

import com.pattern.behavior.pcommand.light.Light;
import com.pattern.behavior.pcommand.cd.CD;
import com.pattern.behavior.pcommand.cd.CdCloseCommand;
import com.pattern.behavior.pcommand.cd.CdOpenCommand;
import com.pattern.behavior.pcommand.command.ExceutorCommand;
import com.pattern.behavior.pcommand.light.LightCloseCommand;
import com.pattern.behavior.pcommand.light.LightOpenCommand;

/**
 * [Type-Behavior] Command Pattern
 *
 * 简单描述：客户 通过服务员 点了一个烤鸭  请求厨师执行
 * 主要涉及到对象有 命令发送者，命令调度者，命令执行者 抽象命令 具体命令
 * 效果：实现了命令发送者和命令执行的耦合
 * 缺点：如果命令过多，每次都要新建一个对象。
 * 应用场景：发送宏命令，发送带有撤销的命令
 * Created by Administrator on 2017/4/14.
 */
public class ClientCommand {
    public static void main(String args[]) {
        ExceutorCommand exceutorCommand = new ExceutorCommand();

        Light light = new Light();
        LightOpenCommand lightOpenCommand = new LightOpenCommand();
        LightCloseCommand lightCloseCommand = new LightCloseCommand();
        lightOpenCommand.setLight(light);
        lightCloseCommand.setLight(light);

        CD cd = new CD();
        CdOpenCommand cdOpenCommand = new CdOpenCommand();
        cdOpenCommand.setCd(cd);
        CdCloseCommand cdCloseCommand = new CdCloseCommand();
        cdCloseCommand.setCd(cd);

        exceutorCommand.setCommand(0, lightOpenCommand, lightCloseCommand);
        exceutorCommand.buttonWasPressedOpen(0);
        exceutorCommand.buttonWasPressedClose(0);

        exceutorCommand.setCommand(1, cdOpenCommand, cdCloseCommand);
        exceutorCommand.buttonWasPressedOpen(1);
        exceutorCommand.buttonWasPressedClose(1);

        exceutorCommand.undoPress();


    }
}
