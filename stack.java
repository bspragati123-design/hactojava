import java.util.Scanner;
public class Stack
  {
    int top=-1;
    private int MAX_SIZE=20;
    int a[]=new int[MAX_SIZE];
    void push(int X)
    {
      if(top==MAX_SIZE-1)
      {
        System.out.println("STACK OVERFLOW");
        System.exit(1);
      }
      System.out.println("Inserted element:"+X);
      a[++top]=X;
    }
    int pop()
    {
      if(top==-1)
      {
        System.out.println("STACK UNDERFLOW");
        System.exit(1);
      }
      return a[top--];
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements are:");
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[]args)
    {
      Stack s=new Stack();
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number of elements to push (max 20): ");
      int n = sc.nextInt();
      System.out.println("Enter the stack elements:");
      for(int i=0;i<n;i++){
      int X=sc.nextInt();
      s.push(X);
      }
      System.out.println();
      s.display();

      System.out.println("\nPopping top element: " + s.pop());
      s.display();

      sc.close();
    }
  }

          
