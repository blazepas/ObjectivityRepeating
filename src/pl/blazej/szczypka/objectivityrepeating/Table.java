package pl.blazej.szczypka.objectivityrepeating;

public class Table {
    // zmienne w klasie reprezentują stan obiektu i jego własności
    // tworzymy poniżej wskaźnik aby nie alokować miejsca w pamięci
    private Cup teaCup;
    private Cup coffeeCup;
    private Cup waterCup;

    // metody to akcje czynności/działania do wykonania na klasie
    // np. wyłóż kubki

    public void putCup() {
        System.out.println("Putting cup");
        // poniżej teraz alokujemy miejsce w pamięci
        teaCup = new Cup();
        System.out.println(teaCup);
        coffeeCup = new Cup("black", 100, true);
        System.out.println(coffeeCup);


    }
    //ctrl+shift+enter - dodaje zakończenia lini ; {} itd.
}
