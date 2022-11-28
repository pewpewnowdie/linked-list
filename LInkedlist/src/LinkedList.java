public class LinkedList
{
    Node head;

    public void insert(int data)
    {
        Node node = new Node();
        node.data=data;

        if(head==null)
        {
            head=node;
        }
        else
        {
            Node check = head;
            while(check.next!=null)
            {
                check=check.next;
            }
            check.next=node;
        }
    }
    public void show()
    {
        Node check = head;
            while(check.next!=null)
            {
                System.out.println(check.data);
                check=check.next;
            }
            System.out.println(check.data);
    }
    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data=data;
        node.next=head;
        head=node;
    }
    public void insertAt(int index, int data)
    {
        Node node = new Node();
        node.data=data;

        if(index==0)
        {
            insertAtStart(data);
            return;
        }

        Node check=head;
        for(int i=0;i<index-1;i++)
        {
            check=check.next;
        }
        node.next=check.next;
        check.next=node;
    }
    public void deleteAt(int index)
    {
        if(index==0)
        {
            head=head.next;
            return;
        }
        Node check = head;
        for(int i=0;i<index-1;i++)
        {
            check=check.next;
        }
        Node temp = check;
        check=check.next;
        System.out.println("deleted:"+check.data);
        temp.next=check.next;

    }
}