package memento;

import java.util.ArrayList;
import java.util.List;

public class Watchman {
    private final List<MementoBook> mementoBooksList = new ArrayList<>();

    public void add(MementoBook memento) {
        mementoBooksList.add(memento);
    }

    public MementoBook get(int index) {
        if (index >= 0 && index < mementoBooksList.size()) {
            return mementoBooksList.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }
}
