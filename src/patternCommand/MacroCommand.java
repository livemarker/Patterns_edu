package patternCommand;

public class MacroCommand implements Command {
    Command[] command;

    public MacroCommand(Command[] commands) {
        this.command = commands;
    }

    public void execute() {
        for (int i = 0; i < command.length; i++) {
            command[i].execute();
        }
    }

}
