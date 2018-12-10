package streams.zadania;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class zadania1_4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "pies",
                "kot",
                "małpa",
                "krowa",
                "anakonda"
        );
        List<String> longerThan3 = strings.stream()
                .filter(s -> (s.length()>3))
                .collect(Collectors.toList());
        System.out.println(longerThan3);

        List<String> first3characters = strings.stream()
                .map(s -> s.substring(0,3))
                .collect(Collectors.toList());
        System.out.println(first3characters);

        long filterA = strings.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.endsWith("a"))
                .count();
        System.out.println(filterA);

        List<String> textLengthMin2 = strings.stream()
                .map(s -> s.substring(0, (s.length()-1)))
                .filter(s -> (s.length()>2))
                .collect(Collectors.toList());
        System.out.println(textLengthMin2);



    }
}

