public class Main
{
    public static void main(String[] args)
    {   //make StaticStack object
        StaticStack myStaticStack = new StaticStack(10); //need to pass in size of stack

        //test:
        System.out.println(myStaticStack.peek());

        for(int i = 0; i < 10; i++)
        {
            myStaticStack.push("String: " + i);
            System.out.println("Push: " + myStaticStack.peek());
        }
       ;
        System.out.println("Count: " + myStaticStack.count());

        for(int i = 0; i < 10; i++)
        {
            System.out.println("Pop: " + myStaticStack.pop());
        }

        System.out.println("Count: " + myStaticStack.count());


        myStaticStack.clear();
        System.out.println(myStaticStack.peek());
    }
}
