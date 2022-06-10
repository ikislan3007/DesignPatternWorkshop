package observer;

public class ChristmasElf implements Observer {
    private String elfName;
    private Observable magicBoard;

    public ChristmasElf(String elfName) {
        setElfName(elfName);
    }

    @Override
    public void setMagicBoard(Observable magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void receiveNotification() {
        if (this.magicBoard == null) {
            System.out.println(this.elfName + " can not look at  magic board");
            return;
        }
        System.out.println(this.elfName + " has to bring a " + magicBoard.prepareToy());
    }

    @Override
    public void removeMagicBoard() {
        magicBoard = null;
    }


    public String getElfName() {
        return elfName;
    }

    public void setElfName(String elfName) {
        this.elfName = elfName;
    }


}
