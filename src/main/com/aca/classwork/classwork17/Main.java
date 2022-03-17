package com.aca.classwork.classwork17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//valueOf y static factory a, i tarberutyun new i , new .... -n nor objecta sarqum heapum, isk orinak Integer.valueOf()y kacnhum e static factory u ete ka arden sarqvac object, da e ogtagorcum, nory chi stexcum, hakarak demqum stexcum e nor object

// listy toxum er unenel duplicated objectner, isk sety chi toxnum eli unenal nuyn objectic. Sety ev Listy jarangel en Collection interface ic, Collection Interface y Iterable interface ic

//skeletal implementation, erb vor ev extender anum class, ev implement er anum interface

public class Main<T> {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1000);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);
/*

        System.out.println(list);
//        list.remove((Object) 1);
        list.remove(1);
        System.out.println(list);
*/


/*//iteratornery fast fail en` arag en failvum
        Iterator<Integer> iterator = list.iterator();//list.iterator y mez veradarcnum e iteratori object, vory tuyl e talis hasaneliutyun unenanq objecti(orinak listi) mej gtnvox elementnerin
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

/*
//verevini het nuyn nshanakutyuny unen, aysinqn es nerqevini depqum nuynpes iterator e
        for (Integer integer : list) {
//            list.remove(5) //fail kta

            System.out.println(iterator.next());
        }
        */

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next();
            if (iterator.next()==2){
                iterator.remove();
            }
        }
        System.out.println(list);


    }

}


//    public static void main(String[] args) {
//        Main<Integer> intMain = new Main<>();
//    }
//
//
//    public static <T> T identity(T t){
//        return t;
//    }

