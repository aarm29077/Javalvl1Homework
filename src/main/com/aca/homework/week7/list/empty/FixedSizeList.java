package main.com.aca.homework.week7.list.empty;

public class FixedSizeList implements List{
    Object[] lists = new Object[10];
    private int index = 0;

    @Override
    public int size() {
        return index;
    }

    @Override
    public void add(Object o) {
        if (index >9){
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
        if (index>=this.index){
            System.out.println("error");
        }else{
            return lists[index];
        }
        return -1;
    }
}
