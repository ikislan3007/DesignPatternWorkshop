package command;

import observer.MagicBoard;

public class NeedDollCommand implements Command {
    public MagicBoard magicBoard;

    public NeedDollCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        magicBoard.writeDoll();
    }
}

