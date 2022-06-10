import command.Command;
import command.NeedBicycleCommand;
import command.NeedDollCommand;
import observer.ChristmasElf;
import observer.MagicBoard;
import observer.Observer;
import singlenton.SantaClaus;

public class Main {
    public static SantaClaus santaInstance = SantaClaus.getInstance();

    Observer elf;
    MagicBoard magicBoard;

    public MagicBoard getMagicBoard() {
        return magicBoard;
    }

    public void createToy(String toyName, MagicBoard magicBoard) {
        magicBoard = new MagicBoard();
        elf = new ChristmasElf("Eli");
        magicBoard.addMagicElfToBoard(elf);

        Command command = null;
        if (toyName.equals(santaInstance.giveMeToy("Doll"))) {
            command = new NeedDollCommand(magicBoard);
        }
        if (toyName.equals(santaInstance.giveMeToy("Bicycle"))) {
            command = new NeedBicycleCommand(magicBoard);
        }
        command.execute();
    }

    public static void main(String[] args) {

        Main workshop = new Main();
        workshop.createToy("Bicycle", workshop.getMagicBoard());
        workshop.createToy("Doll", workshop.getMagicBoard());
        santaInstance.showAllToys();
    }
}