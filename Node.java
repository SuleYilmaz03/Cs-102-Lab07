public class Node{

  //properties
  private String data; 
  private Node next;

  //Constructors
  public Node(String data){
   this.data = data;
   next = null;
  }
  //Get and Set Methods
  public String getData()
  {return data;}
  public Node getNext()
  {return next;}
  public void setData(String data)
  { this.data = data;}
  public void setNext(Node next)
  {this.next = next;}
  //Methods
}