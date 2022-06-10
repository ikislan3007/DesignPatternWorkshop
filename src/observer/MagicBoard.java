package observer;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {

    private String toy;
    private List<Observer> elves;
    public MagicBoard() {
        this.elves = new ArrayList<>();
    }

    @Override
    public void addMagicElfToBoard(Observer elf) {
        if ((elf != null)) {
            elves.add(elf);
            elf.setMagicBoard(this);
        } else {
            throw new IllegalArgumentException("Christmas elf can not be null");
        }
    }

    @Override
    public void removeMagicElf(Observer elf) {
        this.elves.remove(elf);
        elf.removeMagicBoard();

    }

    @Override
    public void notifyAllMagicElves(String toyName) {
        for (Observer o : elves) {
            o.receiveUpdate();
        }
    }

    public void writeDoll() {
        System.out.println("Santa Claus Needs A Doll");
        this.setToy("Doll");
    }

    public void writeBike() {
        System.out.println("Santa Claus Needs A Bicycle");
        this.setToy("Bicycle");
    }

    @Override
    public String prepareToy() {
        return this.toy;
    }


    public List<Observer> getElves() {
        return elves;
    }

    public void setElves(List<Observer> elves) {
        this.elves = elves;
    }

    public void setToy(String toy) {
        this.toy = toy;
        this.notifyAllMagicElves(toy);
    }

}
