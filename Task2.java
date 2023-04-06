import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(List.of("Hello","My", "World", "123"));
        System.out.println(enqueue(linkedList, "City"));
        System.out.println(dequeue(linkedList));
        System.out.println(first(linkedList));
        System.out.println(linkedList);

    }
    public static LinkedList<String> enqueue(LinkedList<String> linkedList, String element) {
        linkedList.addLast(element);
        return linkedList;
    }
    public static String dequeue(LinkedList<String> linkedList) {
        String a = linkedList.pollFirst();
        return a;
    }
    public static String first(LinkedList<String> linkedList) {
        String a = linkedList.peekFirst();
        return a;
    }
}
