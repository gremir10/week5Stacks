public class StaticStack {
    private String[] stack;
    /* to put things on top of stack so it actually works like a stack:
    need usedIndices variable to keep track of what we used */
    private int emptyElement;

    //prevent going out of bounds
    private int capacity;


    //allocate length in constructor
    StaticStack(int initCapacity) {
        capacity = initCapacity;
        stack = new String[capacity]; //can now create string array of whatever size you want
        emptyElement = 0;
    }

    //main methods are all public
    //push method
    public void push(String newData)//parameter = something to push on top of stack
    {
        //prevent going out of bounds
        if (emptyElement < capacity) { //then add new data
            stack[emptyElement] = newData;
            emptyElement++;
        } else {
            System.out.println("Stack is filled to capacity");
        }
    }

    public String pop() //string bc that's most recent element
    { //to remove element from top of stack:
        //need temp variable to hold value in
        String temp;

        //make sure there's something to remove
        if (emptyElement > 0) {
            emptyElement--;//back up one
        }

        temp = stack[emptyElement]; //+set it to null
        stack[emptyElement] = null;

        return temp;
    }

    public String peek() //peek returns value at top of stack, which is a string
    {
        if (emptyElement > 0) {
            return stack[emptyElement - 1];
        } else {
            return "Stack is empty";  //needs return under both if and else for java to be happy
        }  /*when you do a return from a method, method ends
        immediately , so else could technically be left out */
    }

    public void clear() { //clear stack
        for (int i = 0; i < emptyElement; i++) {
            stack[i] = null;
        }
       emptyElement = 0; //reset variable for emptyElement
    }

    public int count() //return int: how many elements are in stack
    {
        return emptyElement; //want to send amount of things in stack
    }

    public boolean isEmpty()
    { //check if empty

        return emptyElement == 0;
    }


    }