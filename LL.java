import java.util.*;
class LL 
{
    public static void main(String args[])
    {
        LinkedList<Integer>LL=new LinkedList();
        Scanner s=new Scanner (System.in);
        int value,choice,position,input;
        do {
            System.out.println("Menu");
            System.out.println("1 Insert at end");
            System.out.println("2 delete at specific point");
            System.out.println("3 print linklist");
            System.out.println("4 Insert at beginning ");
           System.out.println("5 Deleted at the end ");
          System.out.println("6 Insertion at specific point ");
           
            
            choice=s.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Enter the value you want to insert");
                        value=s.nextInt();
                        LL.add(value);
                        break;
                case 2: System.out.println("Enter the position ");
                        position=s.nextInt();
                        LL.remove(position-1);
                        break;
                case 3: System.out.println("Linklist"+LL);
                        break;
                case 4: System.out.println("Enter the value you want to insert at beg");
                        value=s.nextInt();
                        LL.addFirst(value);
                        break;
               case 5: System.out.println("Deleted at end ");
                        int len=LL.size();
                        LL.remove(len-1);
                        break;
               case 6: System.out.println("Enter the value ");
                        value=s.nextInt();
                       System.out.println("Enter the position ");
                        position=s.nextInt();
                        LL.add(position-1,value);
                        break;
                                
            }
            
            System.out.println("Enter 1 to continue and 0 for not");
            input=s.nextInt();
        }
        while(input==1);
        
        
        
        
    }
    
}
