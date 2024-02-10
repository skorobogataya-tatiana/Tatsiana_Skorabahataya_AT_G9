package homework.day2.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        WhileExample numbers = new WhileExample();
        OddNumbers oddNum = new OddNumbers();
        MyArray smiles = new MyArray();

        numbers.showNumbers();
        oddNum.showOddNumbers();
        smiles.putSmiles();
        smiles.showSmiles();
        smiles.showSmilesReverseOrder();
        smiles.showMultipliedSmiles();
        smiles.showSquareSmiles();
        smiles.showMinSmile();
        smiles.changeSmiles();
        smiles.showSortedSmiles();

    }
}
