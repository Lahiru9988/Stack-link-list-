class StackX{
    private int maxSize;
    private Double[] stackArray;
    Private int top;

    public void (int s) {
 //constructor
        maxSize = s;
        stackArray = new Double[maxSize];
        top = -1;        
    }
}public void push(Double j) {
    //chack if stack is full
    if (top == maxSize - 1)
        System.out.println("Stack is full");
    else {
        top++;
        stackArray[top] = j;
    }
}
public Double pop() {
    //check if stack is empty
    if(top ==-1)
        retuen -999;
    else {
        retuen stackArray[top--];
    }
}
public Double peek() {
    //check if stack is empty
    if(top ==-1)
        return -999;
    else {
        return stackArray[top];//top most element
    }

    //implement  peek method using push and pop methods
     public char peek(){
        char ch=pop();
        push(ch);
        return ch;
     }

}

