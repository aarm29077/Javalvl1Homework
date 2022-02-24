package main.com.aca.homework.week7.list.empty;

public interface List {
    int size();
    void add(Object o);
    boolean isEmpty();
    Object get(int index);

    static List ofFixedSize(){
        return new FixedSizeList();
    }
    static List ofEmpty(){
        return new List() {
            Object[] lists = new Object[16];
            private int index = 0;
            @Override
            public int size() {
                return 16;
            }

            @Override
            public void add(Object o) {
                if (size() >9){
                    System.out.println("The list is full");
                }else{
                    lists[index]= o;
                }
                ++index;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Object get(int index) {
                return lists[index];
            }
        }
    }
}
