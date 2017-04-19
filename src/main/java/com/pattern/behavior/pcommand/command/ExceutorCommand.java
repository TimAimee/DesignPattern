package com.pattern.behavior.pcommand.command;

/**
 * Created by timaimee on 2017/4/14.
 */
public class ExceutorCommand {
    private Command command;
    Command[] openCommands = new Command[7];
    Command[] closeCommands = new Command[7];

    public Command getLastCommand() {
        return command;
    }

    public void setCommand(int postion, Command openCommand, Command closeCommand) {

        openCommands[postion] = openCommand;
        closeCommands[postion] = closeCommand;
    }

    public void buttonWasPressedOpen(int position) {
        this.command = openCommands[position];
        excuter();
    }

    public void buttonWasPressedClose(int position) {
        this.command = closeCommands[position];
        excuter();
    }

    public void excuter() {
        command.excute();
    }

    public void undoPress() {
        command.undo();
    }
}
