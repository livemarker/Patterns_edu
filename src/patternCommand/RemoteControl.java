package patternCommand;

import java.util.Scanner;

public class RemoteControl {
    Command[] commandsOn;
    Command[] commandsOff;

    public RemoteControl() {
        commandsOn = new Command[7];
        commandsOff = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            commandsOn[i] = noCommand;
            commandsOff[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command commandOn, Command commandOff) {
        commandsOn[slot] = commandOn;
        commandsOn[slot] = commandOff;
    }

    public void onButtonWasPushed(int slot) {
        commandsOn[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        commandsOff[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------Remote control-------\n");
        for (int i = 0; i < commandsOn.length; i++) {
            stringBuffer.append("[slot " + i + "] " + commandsOn[i].getClass().getName() + "    " + commandsOff[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }

}
