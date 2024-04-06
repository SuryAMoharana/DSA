package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,4,5,6,4,4,5,4,3,2,5,6,4,3,2);
        List<Integer> modified= list.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(modified);
    }
}
