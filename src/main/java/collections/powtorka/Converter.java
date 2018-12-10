package collections.powtorka;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Converter <T> {
    public Set<T> toSet(List<T> stringList) {
        Set<T> stringSet = new HashSet<>();
        for (int i = 0; i < stringList.size(); i++) {
            stringSet.add(stringList.get(i));
        }
        return stringSet;
    }

    public List<T> toList(Set<T> stringSet) {
        List<T> stringList = new ArrayList<>();
        for (T element: stringSet) {
            stringList.add(element);
        }
        return stringList;
    }
}
