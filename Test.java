import java.util.Scanner;
public class Test{
  
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    SimpleLinkedList list = new SimpleLinkedList();
    SimpleStackWithQueue stack = new  SimpleStackWithQueue();
    SimpleQueue queue = new SimpleQueue();
    int cont;
    int selection1;
    int selection2;
    String data;
    String data2;
    int index;
    do{
      System.out.println("What do you want");
      System.out.println(" Press 1 to test the linkedlist or press 2 to test the queue");
      selection1 = scan.nextInt();
      if(selection1 == 1)
      {
        System.out.println(" Press 1 to add a data to the tail of the linkedlist");
        System.out.println(" Press 2 to remove an element from the linkedlist");
        System.out.println(" Press 3 to check whether the linkedlist is empty or not");
        System.out.println(" Press 4 to print the linkedlist");
        selection2 = scan.nextInt();
        if(selection2 == 1)
        {
          System.out.println("Enter the data");
          data = scan.next(); 
          list.addToTail(data);
        }
        else if(selection2 == 2)
        {
          System.out.println(list.removeFromHead() + " is removed from the linkedlist");
        }
        else if(selection2 == 3){
          if(list.isEmpty()== true)
          {
            System.out.println(" The linkedlist is empty");}
          
          else{
            System.out.println(" The linkedlist is not empty");}
          
        }
        else if(selection2 == 4)
        {
          System.out.println(list.toString());
        }
        else {
          System.out.println(" You entered a wrong number");}
        
      } 
      else if( selection1 == 2)
      {
        System.out.println(" Press 1 to push the queues");
        System.out.println(" Press 2 to pop the queue ");
        System.out.println(" Press 3 to enqueue an element  the queue");
        System.out.println(" Press 4 to check whether the queue is empty or not");
        System.out.println(" Press 5 to print the queues");
        System.out.println(" Press 6 to dequeue head of the queue");
        selection2 = scan.nextInt();
        if(selection2 ==1)
        {
          System.out.println("Enter the data");
          data = scan.next(); 
          stack.push(data);
        }
        else if(selection2 == 2)
        {
          stack.pop();
        }
        else if(selection2 == 3){
          System.out.println("Enter the data");
          data2 = scan.next(); 
          queue.enqueue(data2);
        }
        else if(selection2 == 4)
        {
          if(queue.isEmpty()== true)
          {
            System.out.println(" The queue is empty");}
          
          else{
            System.out.println(" The queue is not empty");}
          
        }
        else if (selection2 == 5)
        {
          
          System.out.println(stack.toString());
        }
        else if(selection2 == 6)
        {
          System.out.println(queue.dequeue() + " is removed from the queue");
        }
      }
        else {
          System.out.println(" You entered a wrong value" );}
        System.out.println("Do you want to continoue, Press 6" );
        cont = scan.nextInt();
        
      }while( cont == 6);
      
    
  }
  }