import java.util.*;
public class SimpleStackWithQueue{
  
//Properties
 SimpleQueue q1; 
 SimpleQueue q2;  
 SimpleQueue temp; 

 //Constructors
  public SimpleStackWithQueue(){
  q1 = new SimpleQueue();
  q2 = new SimpleQueue();
  temp = new SimpleQueue();
}
  
//Get and Set Methods
  
  //Methods 
 public void push(String data){
 q2.enqueue(data);
 while(q1.isEmpty() != true)
 {
 String add = q1.dequeue(); 
 q2.enqueue(add);
 
 } 
 temp = q1;
 q1 = q2 ;
 q2 = temp;
 } 
  public String pop(){
  return q1.dequeue();
  }
  
 public String toString(){
   
 
   return "First queue is " + q1.toString() + "." + "Second queue is" + q2.toString() + "."; 
 }
   
}