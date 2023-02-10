package Infrastructura.Tree.CommandsTree;

import Infrastructura.Members.Members;

import java.util.Comparator;

public class TreeComparator<E extends Members> implements Comparator<E> {

    @Override
    public int compare(E o1, E o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }

}
