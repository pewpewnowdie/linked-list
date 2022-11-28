public class App
{
    public static void main(String args[])
    {
        LinkedList list = new LinkedList();

        list.insert(6);
        list.insert(9);
        
        list.insertAtStart(7);


        list.insertAt(1,3);
        list.insertAt(3,10);

        list.show();

        System.out.println("\n");


        list.deleteAt(4);

        list.show();
    }
}




