import java.util.*;
public class Channel 
{
    public char source;
    LinkedList<message> msg=new LinkedList<message>();
    public Channel()
    {
     
    }
    public Channel(char a)
    {
        source=a;
    }
    public void add(char destination,String wt)
    {
        message temp=new message(destination,wt);
        msg.add(temp);
    }
    public String getweightandremove(char destination)
    {
        int size=msg.size();
        message temp;
        String weight="0";
        for(int i=0;i<size;i++)
        {
           temp=msg.get(i);
          
           if(temp.destination==destination)
           {
               weight=temp.weight;
               
               msg.remove(i);
               
           }
           
        }
        return weight;
    }
}
