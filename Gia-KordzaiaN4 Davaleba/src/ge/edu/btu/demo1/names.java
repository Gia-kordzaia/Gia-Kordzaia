package ge.edu.btu.demo1;

import java.util.HashSet;
import java.util.Set;

public class names<String> {
    private Set<String> namess = new HashSet<>();

    public void add(String name) {
        namess.add(name);
    }

    @Override
    public java.lang.String toString() {
        return "Names" + namess;
    }
}
