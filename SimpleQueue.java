
import java.util.*;

public class SimpleQueue{
 //Properties 
  private Queue<SimpleLinkedList> queue;
  private SimpleLinkedList list = new SimpleLinkedList();
  //Constructors
  public SimpleQueue(){
  
  queue = new PriorityQueue<SimpleLinkedList>();
  queue.add(list);
 }
 //Get and Set Methods

 //Methods
  public void enqueue(String data)
  {
  list.addToTail(data);
  
  
  }
  public String dequeue(){
   
   return list.removeFromHead();
  }
   public boolean isEmpty()
 {
    
  if(list.isEmpty())
    return true;
  else 
    return false;
   
 }
public String toString()
{
  return list.toString();
}
   
   
   
} 
  
  
  
  
  
  
