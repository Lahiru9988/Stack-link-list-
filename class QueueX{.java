class QueueX{

    Private int maxSize;  //max size of queue

    Private int[] queueArray; //array to store queue elements
    Private int front; //front of queue
    private int rear; //rear of queue
    Private int nItems; //current number of items in queue

    Public QueueX(int s) { //constructor
        maxSize = s; //set array size
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;   //no items yet
    }


       //insert item at rear of queue
    Public void insert(int j) {
        if(rear == maxSize - 1)
            System.out.println("Queue is full");
        else {
            if(rear == -1)
                rear = 0;
            else
                rear++;
            queueArray[rear] = j;
            nItems++;
        }
    }

    //remove item from front of queue
    Public int remove() {
    
      if(nItems == 0){  //check if queue is empty
        System.out.println("Queue is empty");
        return -999;
      }
      else {
        nItems--;
        return queueArray[front++];
      }
        
    }

    //peek at front of queue
    Public int peekFront() { 
        if(nItems == 0){
            System.out.println("Queue is empty");
            return -999; //return -999 if queue is empty
        }
        else
            return queueArray[front]; //return front element
    }


    // removeing an element from Circular Queue
    Public int remove() {
        //check if queue is empty
        if(nItems == 0){
            System.out.println("Queue is empty");  
        }
        else{
            int temp = queueArray[front++];
            if(front == maxSize)
                front = 0;
            nItems--;
            return temp;    
       }
            
    }

     //insert  an element into Circular Queue
        Public void insert(int j) {
        //check if queue is full
        if (nItems == maxSize)
            System.out.println("Queue is full");
        else {
            if(rear == maxSize-1)
               rear=-1;
            queueArray[rear] = j;
            nItems++;
        }    
}