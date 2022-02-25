package main.com.aca.homework.week7.list.empty;

public class FixedSizeList implements List {
    Object[] lists = new Object[10];
    private int index = 0;

    @Override
    public int size() {
        if (index < 10) {
            return index;
        }
        return 10;
    }

    @Override
    public void add(Object o) {
        if (index > 9) {
            System.out.println("The list is full");
        } else {
            lists[index] = o;
        }
        ++index;
    }

    @Override
    public boolean isEmpty() {
        return lists[0] == null;
    }

    @Override
    public Object get(int index) {
        if (index >= this.index) {
            return "You can not get the object";
        } else {
            return lists[index];
        }
    }
}
