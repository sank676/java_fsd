package collections;

import java.util.LinkedList;
public class Midll 
{
  public static void main(String[] args)
  {
   
    LinkedList<Integer> linkedlist = new LinkedList<Integer>();
    linkedlist.add(2);
    linkedlist.addFirst(3);
    linkedlist.addLast(5);
    linkedlist.addLast(6);
    linkedlist.addLast(8);
    linkedlist.addLast(13);
    linkedlist.addLast(18);
    System.out.println("LinkedList: " +  linkedlist);
    int middle =  linkedlist.get( linkedlist.size()/2);
    System.out.println("Middle Element: " + middle);
    }
}