class LinkList{

    private Link first;
    Public LinkList(){ //constructor
        first = null;
    }
 Public boolean isEmpty(){ //check if list is empty
        return first == null;
    }
    public void displayList(){ //display list
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
    }

    public void insertFirst(int d){ //insert at first
        Link newLink = new Link(d);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst(){ //delete first
        Link temp = first;
        first = first.next;
        return temp;
    }
}