package valdes.inc.com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();

        linkedList.addFirst(3);
        linkedList.addLast(2);
        linkedList.addLast(7);
        linkedList.addLast(2);
        linkedList.addLast(6);
        linkedList.remove(4);

        showLinkedList(linkedList);

        linkedList.reverse();

        showLinkedList(linkedList);
    }

    public static void showLinkedList(LinkedList linkedList){
        System.out.println("Обновленный список");
        for (int i = 0; i< linkedList.size(); i++){
            System.out.println((linkedList.get(i)));
        }}
}
