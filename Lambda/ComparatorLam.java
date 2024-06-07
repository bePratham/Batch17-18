package Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLam {
    public static void main(String[] args) {
        List<Data> list = new ArrayList<>();
        list.add(new Data("Pratham"));
        list.add(new Data("Kunal"));
        list.add(new Data("Rohit"));
        list.add(new Data("Deepak"));
        list.add(new Data("Soumil"));
        System.out.println(list);
        Collections.sort(
        list, new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        Collections.sort(list, (o1,o2)->{
            if(o1.getName().length()<o2.getName().length()) return -1;
            else if(o1.getName().length() > o2.getName().length()) return 1;
            else
             return 0;
        });

        System.out.println(list);
    }
}

class Data {
    private String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data { " + name + " ," + "}";
    }
}