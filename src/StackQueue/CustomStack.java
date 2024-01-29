package StackQueue;

public class CustomStack {

    protected static int[] data ;
    private static final int DEFAULT_SIZE=10;
    public static int idx=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size)
    {
        this.data= new int[size];
    }


    public static  boolean pushElement(int ele)
    {
        if(isFull())
        {
            System.out.println("stack is full");
       return false;
        }
       idx++;
       data[idx]= ele;
       return true;
    }

    public static int peekElement() throws Exception {
        if(isEmpty())
        {
            throw new Exception("cannot pop from empty stack");
        }
        return data[0];
    }
    public static int popElement() throws Exception {

        if(isEmpty())
        {
      throw new Exception("cannot pop from empty stack");
        }
       int removedData= data[idx];
        idx--;
        return removedData;
    }

    public static boolean isFull()
    {
        if(idx==data.length) return true;
     return false;
    }

    public static boolean isEmpty()
    {
       return idx==-1;
    }


    public static void main(String[] args) throws Exception {
         CustomStack st = new CustomStack();
          st.pushElement(32);
          st.pushElement(43);
        st.pushElement(65);
        st.pushElement(33);
        st.pushElement(55);

        System.out.println(st.popElement());

    }

}
