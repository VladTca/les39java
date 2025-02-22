import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
      List<String> list = new ArrayList<String>();
      list.add("Abc");
      list.add("Def");
      list.add("Ghi");
      list.add("Jkl");
      list.add("Mno");
      list.add("Pqr");

        System.out.println(repeatObj(list));

    }
    public static <T> boolean repeatObj(List<T> list) {
        Set<T> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (set.contains(list.get(i))) {
                return true;
            } else {
                set.add(list.get(i));
            }

        }
        return false;
    }
}