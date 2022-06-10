package command;

import observer.MagicBoard;

public class NeedBicycleCommand implements Command {
    public MagicBoard magicBoard;

    public NeedBicycleCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        magicBoard.writeBike();

    }
}

