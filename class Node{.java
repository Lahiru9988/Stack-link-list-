class Node{

public int idata; //key value
public double ddata;//data
public Node leftChild; //left child
public Node rightChild; //right child

  public void displayNode(){
    System.out.println("idata: " + idata);
    System.out.println("ddata: " + ddata);
    System.out.println("leftChild: " + leftChild);
    System.out.println("rightChild: " + rightChild);
  }
}

class binaryTree{
    private Node root; // first node of tree
    public binaryTree(){
        root = null;
    }

    //find method
    public Node find(int key){
        Node current = root;
        while(current.idata != key){
            if(key < current.idata)
                current = current.leftChild;
            else
                current = current.rightChild;
            if(current == null)
                return null;
        }
        return current;
    }
   //insert method
    public void insert(int id, double dd){
        Node new Node = new Node();
        new Node.idata = id;
        new Node.ddata = dd;
        if(root ==null) //if tree is empty
            root = newNode;
        else{         //if tree is not empty
            Node current = root; //start at root
            Node parent;
            while (true){
                parent = current;
                if (id < current.iData){ // go left

                     current = current.leftChild;
                     if (current == null) {
                    parent.leftChild = newNode;
                        return;
                    }
                 } 
                 else // go right
                 {
                  current = current.rightChild;
                   if (current == null){
                    parent.rightChild = newNode;
                   return;
                   }
                }
            }
        }     
   
    }

  
}
 
    
          

    

