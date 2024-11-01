import java.util.LinkedList;
import java.util.ListIterator;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Andrzej");
        linkedList.add("Bartek");
        linkedList.add("Cezary");
        linkedList.add("Dariusz");
        linkedList.add("Edward");
        linkedList.add("Filip");
        linkedList.add("Grzegorz");
        linkedList.add("Henryk");
        linkedList.add("Ignacy");
        linkedList.add("Jan");
        ListIterator<String> listIterator = linkedList.listIterator();
        listIterator.next();
        listIterator.next();
        listIterator.next();
        listIterator.next();
        listIterator.next();
        System.out.println(listIterator.previousIndex());
        System.out.println(listIterator.nextIndex());
        System.out.println();
        listIterator.previous();
        listIterator.remove();
        listIterator.add("Eligiusz");
        listIterator.forEachRemaining(System.out::println);
        System.out.println();
        linkedList.forEach(System.out::println);
    }
}