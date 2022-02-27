package main.com.aca.homework.week7.list.empty;


class ListTest {
    public static void main(String[] args) {
        List list1 = List.ofEmpty();
        System.out.println(list1.isEmpty());
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");
        System.out.println(list1.get(4));
//        System.out.println(list1.size());
//        System.out.println(list1.isEmpty());

        System.out.println();
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
