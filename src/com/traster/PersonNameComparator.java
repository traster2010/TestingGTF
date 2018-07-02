//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<PersonTree> {
    public PersonNameComparator() {
    }

    public int compare(PersonTree a, PersonTree b) {
        return a.getName().compareTo(b.getName());
    }
}
