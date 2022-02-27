package main.com.aca.homework.week7.list.empty;

public interface List {
    int size();

    void add(Object o);

    boolean isEmpty();

    Object get(int index);

    static List ofFixedSize() {
        return new FixedSizeList();
    }

    static List ofEmpty() {

        return new List() {
            private int capacity = 16;
            Object[] lists = new Object[capacity];
            private int index = 0;

            @Override
            public int size() {
                if (index < capacity) {
                    return index;
                }
                return capacity;
            }

            @Override
            public void add(Object o) {
                if (size() >= capacity) {
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
        };
    }
}

