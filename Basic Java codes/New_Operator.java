
import java.io.*;

class stack
  {
  int to;
  int stack[]=new int[10];
  stack()
    {
    to=-1;
    }
  void push(int item)
    {
    if(to==9)
      
      System.out.println("Stack is full!");
      else
      stack[++to]=item;
      
    }
  int pop()
    {
  if(to<0)
      {
    System.out.println("Stack Overflow!");
    return 0;
      }
    else
    return stack[to--];
    }
  }

class p35
  {
  public static void main(String args[])
    {
    stack mystack1=new stack();
    stack mystack2=new stack();

    for(int i=0; i<10; i++)
     mystack1.push(i);	

    for(int i=10; i<20; i++)
     mystack2.push(i);	

    System.out.println("\t Stack in mystack1");

    for(int i=0; i<10; i++)
    System.out.println("\t"+mystack1.pop());	

    System.out.println("\t Stack in mystack2");

    for(int i=10; i<20; i++)
    System.out.println("\t"+mystack2.pop());

    }
}
