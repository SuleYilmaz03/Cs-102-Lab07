import java.util.LinkedList;

public class SimpleLinkedList
{
  //Properties
 private LinkedList<Node> list;
  
  //Constructors
  public SimpleLinkedList(){
  
  list = new LinkedList<Node>();
  
  }
  
  
  //Get and Set Methods
 

//Methods 
 public boolean isEmpty()
 {
  boolean empty =  true;;
  for(int i = 0; i < list.size(); i++)
  {
    if(list.get(i) != null)
    {
     empty = false;
    }
  }
  return empty;
   
 }  
  public void addToTail(String data)
 {
 Node x = new Node(data);
 list.addLast(x);
 }
 
 public String removeFromHead()
 {
 return list.remove().getData();
 }
 public Node get(int index){
  Node y = list.get(index);
  if(y == null){
    return null;}
  else{ 
    return y;}
 }
 public String toString(){
   String data = "";
   
   for(int i = 0; i < list.size(); i++)
  {
    if(list.get(i) != null)
    {
    data = data + list.get(i).getData();
    }
   }
return data;
 }


}