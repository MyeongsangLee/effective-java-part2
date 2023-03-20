package me.whiteship.chapter04.item21.failfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
    public static void main(String[] args) {
        List<Integer> members = new ArrayList<>();
        members.add(1);
        members.add(2);
        members.add(3);
        members.add(4);
        members.add(5);

//        for (Integer member : members) {
//            if (member == 3) {
//                members.remove(member);
//            }
//        }
//        for (Iterator<Integer> iterator = members.iterator(); iterator.hasNext();) {
//            Integer integer = iterator.next();
//            if (integer == 3)
//                iterator.remove();
//        }

//        for (Integer i = 0; i < members.size(); i++) {
//            if (members.get(i) == 3) {
//                members.remove(members.get(i));
//            }
//        }

        members.removeIf(integer -> integer == 3);
        members.forEach(System.out::println);
    }
}
