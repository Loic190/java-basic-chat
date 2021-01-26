package ChatCommands;

public abstract class AbstractCommand {
    public abstract void execute(String[] args);

    public abstract void printDescription();
}