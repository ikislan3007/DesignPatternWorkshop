package observer;


public interface Observable {
    void addMagicElfToBoard(Observer elf);
    void removeMagicElf(Observer elf);
    void notifyAllMagicElves(String toyName);
    String prepareToy();

}
