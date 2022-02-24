package main.com.aca.homework.week7.list.empty;


class ListTest {
    public static void main(String[] args) {
        List list1 = List.ofEmpty();
        list1.add(55);
        list1.add("ADsa");
        list1.add(99);
        list1.add(50);



        List list2 = List.ofFixedSize();
        list2.add("aa");
        list2.add("bb");
        list2.add("cc");
        list2.add("cc");
        list2.add("dd");
        list2.add("ee");
        list2.add("ff");
        list2.add("gg");
        list2.add("hh");
        list2.add("ii");
        System.out.println(list2.get(4));
        System.out.println(list2.size());

    }

}