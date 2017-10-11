package pl.blazej.szczypka.objectivityrepeating;

// wszystkie obiekty dziedziczą z klasy Object
//pokazywanie hierarhi klass ctrl+H
public class Cup {

    private String colour;
    private int capacity;
    private boolean empty;

    public Cup() {
    }

    public Cup(String c, int capacity, boolean empty) {
        colour = c;
        this.capacity = capacity;
        this.empty = empty;
    }

    //alt+insert - generate code  eg.: getters/setters


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    //poniżej robimy przeciążenie metody. Robimy to po to bo
    // wszystkie obiekty dziedziczą z klasy Object. Przeciążenie
    // aby program wiedział że bierzemy metodą naszą a nie z nadklasy Object.
    //
    @Override
    public String toString() {
        return "Cup{" +
                "colour='" + colour + '\'' +
                ", capacity=" + capacity +
                ", empty=" + empty +
                '}';
    }
}
