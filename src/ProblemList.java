import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("darsh");
        list.add("darsh");
        list.add("pune");
        list.add("darsh");
        list.add("cricket");
        list.add("pune");
        list.add("tcs");
        list.add("cricket");

        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if (!list1.contains(list.get(i))){
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);

        List list2 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list2);
    }
}
