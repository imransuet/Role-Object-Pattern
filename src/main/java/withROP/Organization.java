package withROP;

import java.util.HashSet;
import java.util.Set;

class Organization {

    Set<Person> members = new HashSet<Person>();


    void addMember(Person p) {
        members.add(p);
    }

    boolean hasMember(Person p) {
        return members.contains(p);

    }

}