import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(List.of("Hello","My", "World", "123"));
        System.out.println(linkedList);
        System.out.println(swap(linkedList));
    }
    public static LinkedList<String> swap(LinkedList<String> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            String a = linkedList.pollLast();
            linkedList.add(i, a);
        }
        return linkedList;
    }
}