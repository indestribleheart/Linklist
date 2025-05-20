import java.util.*;
public class demo {
  public static void main(String[] args){
    Linklist list=new Linklist();
    list.add(45);
    list.add(5);
    list.add(8);
    list.add(12);
    list.removeLastEle();
    list.printk();
  }
}
class Linklist{

  Node head;
  void add(int xyz){
    if(head==null){
    head=new Node(xyz);
    return;
  }

  Node temp=head;
  while(temp.next!=null){
    temp=temp.next;  
  }
  temp.next=new Node(xyz);
  }
  void printk(){
    if(head==null){
      System.out.println("no element found");
      return;
    }
    Node temp=head;
    while(temp.next!=null){
      System.out.println(temp.data);
      temp=temp.next;
    }
    System.out.println(temp.data);
  }
  void removeLastEle(){
    if(head ==null){
      return;
    }
    if(head.next==null){
      head=null;
      return;
    }
    Node temp=head;
    while(temp.next.next!=null){
      temp=temp.next;
    }
  }
}

class Node{
  int data;
  Node next;

  Node(int data){
    this.data=data;
    this.next=null;
  }
}
