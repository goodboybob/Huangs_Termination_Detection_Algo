import java.io.*;
import java.util.*;
public class MainClass {
     public static String binadd(String A,String B)
        {
            
            int alen=A.length();
            int blen=B.length();
            int firstoneproduced=0;
            int carry=0;
            String sum=new String();
            
            if(alen==blen)
            {
                for(int i=alen-1;i>=0;i--)
                {
                    if(A.charAt(i)==B.charAt(i))
                    {
                        if(A.charAt(i)=='1')
                        {
                            if(firstoneproduced==1)
                            {
                                if(carry==1)
                                {
                                    // sum=sum+"1";
                                    sum="1"+sum;
                                }
                                else
                                {
                                   // sum=sum+"0";
                                    sum="0"+sum;
                                }
                            }
                            else
                            {
                                if(carry==1)
                                {
                                    // sum=sum+"1";
                                    sum="1"+sum;
                                    firstoneproduced=1;
                                }
                                else
                                {
                                   // sum=sum+"0";
                                   // sum="0"+sum;
                                }
                            }
                            carry=1;
                        }
                        else
                        {
                            if(firstoneproduced==1)
                            {
                                if(carry==1)
                                {
                                    // sum=sum+"1";
                                    sum="1"+sum;
                                }
                                else
                                {
                                   // sum=sum+"0";
                                    sum="0"+sum;
                                }
                            }
                            else
                            {
                                if(carry==1)
                                {
                                    firstoneproduced=1;
                                    //sum=sum+"1";
                                    sum="1"+sum;
                                }
                            }
                            carry=0;
                        }
                    }
                    else
                    {
                        if(firstoneproduced==1)
                        {
                            if(carry==1)
                            {
                               // sum=sum+"0";
                                sum="0"+sum;
                                carry=1;
                            }
                            else
                            {
                                //sum=sum+"1";
                                sum="1"+sum;
                            }
                        }
                        else
                        {
                            if(carry==1)
                            {
                                
                            }
                            else
                            {
                               // sum=sum+"1";
                                sum="1"+sum;
                                firstoneproduced=1;
                            }
                        }
                    }
                }
            }
            else
            {
                int max;
                int min;
                String maxstring=bigstring(A,B);
                if(alen>blen)
                {
                    max=alen;
                    min=blen;
                }
                else
                {
                    max=blen;
                    min=alen;
                }
                while(max>min)
                {
                    if(maxstring.charAt(max-1)=='1')
                    {
                        firstoneproduced=1;
                    }
                    sum=maxstring.charAt(max-1)+sum;
                    max--;
                }
                if(max==min)
                {
                     
            {
                for(int i=max-1;i>=0;i--)
                {
                    if(A.charAt(i)==B.charAt(i))
                    {
                        if(A.charAt(i)=='1')
                        {
                            if(firstoneproduced==1)
                            {
                                if(carry==1)
                                {
                                    // sum=sum+"1";
                                    sum="1"+sum;
                                }
                                else
                                {
                                   // sum=sum+"0";
                                    sum="0"+sum;
                                }
                            }
                            else
                             {
                                if(carry==1)
                                {
                                    // sum=sum+"1";
                                    sum="1"+sum;
                                    firstoneproduced=1;
                                }
                                else
                                {
                                   // sum=sum+"0";
                                   // sum="0"+sum;
                                }
                            }
                            carry=1;
                        }
                        else
                        {
                            if(firstoneproduced==1)
                            {
                                if(carry==1)
                                {
                                    // sum=sum+"1";
                                    sum="1"+sum;
                                }
                                else
                                {
                                   // sum=sum+"0";
                                    sum="0"+sum;
                                }
                            }
                            else
                            {
                                if(carry==1)
                                {
                                    firstoneproduced=1;
                                    //sum=sum+"1";
                                    sum="1"+sum;
                                }
                            }
                            carry=0;
                        }
                    }
                    else
                    {
                        if(firstoneproduced==1)
                        {
                            if(carry==1)
                            {
                               // sum=sum+"0";
                                sum="0"+sum;
                                carry=1;
                            }
                            else
                            {
                                //sum=sum+"1";
                                sum="1"+sum;
                            }
                        }
                        else
                        {
                            if(carry==1)
                            {
                                
                            }
                            else
                            {
                               // sum=sum+"1";
                                sum="1"+sum;
                                firstoneproduced=1;
                            }
                        }
                    }
                }
            }
                }
                    
                
                 
             
            }
            return sum;
            
        }
      public static String bigstring(String A,String B)
      {
          if(A.length()>B.length())
          {
              return A;
          }
          else 
          {
              return B;
          }
      }
    public static String doubletobin(double number)
    {
        String bin;
       
        if(number==1.0)
        {
            bin="1";
            return bin;
        }
        bin="0";                                  
        while(number!=0.0)
        {
            number=number*2.0;
            if(((int)number/1)==1.0)
            {
                bin=bin+"1";
                number=number-1.0;
            }
            else
            {
                bin=bin+"0";
            }
                                       
         }
         return bin;                                                        
    }
     public static double bintodouble(String bin)
    {
        double number=0;
        int two=2;
        char c;
        String ch;
        int bitval;
        /*************************/
        if(bin.equals("1"))
        {
            number=1;
            return number;
        }
        else
        {
            for(int i=0;i<bin.length();i++)
            {
               
                 c=bin.charAt(i);
                 ch=Character.toString(c);
                // System.out.println(ch);/*************************/
                 bitval=Integer.parseInt(ch); 
                // System.out.println(bitval);/*************************/
                 number=number+bitval*(Math.pow(two,(-i))); 
               
            }
        }
        return number;
    }
    public static void writeintoafile(String abc,String filelocation)
    {
         try
         { 
              Writer output = null;
              File file = new File(filelocation+"reports.txt");
              output = new BufferedWriter(new FileWriter(file));
              output.write(abc);
              output.close();
         }
         catch(IOException e)
         {
             System.out.println(e);
         }
    }
    public static BufferedReader getfilehandle(String filename,String filelocation)
	{
		FileInputStream readevents;
		
		try
		{
			readevents=new FileInputStream(filelocation+filename);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File "+filename+" not found "+e);
			return null;
		}
	
		BufferedReader br=new BufferedReader(new InputStreamReader(readevents));
		return br;
	}
	public static void closefile(BufferedReader filehandle)
	{
		try
		{
			filehandle.close();
		}
		catch(IOException e)
		{
			System.out.println("File not found ");
		}
	}
	public static int readone(BufferedReader fh)
	{
		int a;
		try
		{
			a=fh.read();
		}
		catch(IOException e)
		{
			System.out.println("file not found");
			return -1;
		}
		return a;
	}
        
        public static int createprocessrecord(String filelocation,LinkedList P,LinkedList PNAMES)
	{
		String fname="events.txt";
                int nops=0;
		BufferedReader fh=getfilehandle(fname,filelocation);
		int ch;
                boolean isthefirstprocess=true;
                int tabcount=0;
		ch=readone(fh);	
		while(ch>=0)/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author winay143
 */
		{	
			while(ch!=10 && ch!=13)
			{
                            if(ch==9)
                            {
                                tabcount++;
                            }
                            if(tabcount==0)
                            {
                       

                                if((ch>=65 && ch<=90))
				{
                                    int index=PNAMES.indexOf(Character.toString((char)ch));
                                    if(index==-1)
                                    {
                                        if(isthefirstprocess==true)
                                        {
                                            Process Ptemp=new Process((char)ch,"1");
                                            P.add(Ptemp);
                                            PNAMES.add(Character.toString((char)ch));
                                            isthefirstprocess=false;
                                            tabcount++;
                                            nops++;
                                            
                                        }
                                        else
                                        {
                                            Process Ptemp=new Process((char)ch,"0");
                                            P.add(Ptemp);
                                            PNAMES.add(Character.toString((char)ch));
                                            tabcount++;
                                            nops++;
                                        }
					
                                    }
                                }
                            }
                            ch=readone(fh);
			}
                        tabcount=0;
			ch=readone(fh);
		}
		closefile(fh);
		return nops;
		
	}
        public static int createchannelrecord(int nop, LinkedList PNAMES,ChannelRecord[][] CRecord,char[] processes)
        {
            int channelno=0;
            for(int i=0;i<nop;i++)
            {
                char sender;              
              //  sender=((String)PNAMES.get(i)).charAt(0);
                sender=processes[i];
          
                for(int j=0;j<nop;j++)
                {
                    char receiver;
                   // receiver=((String)PNAMES.get(j)).charAt(0);
                    receiver=processes[j];
                    {
                        CRecord[i][j]=new ChannelRecord(sender,receiver,channelno);
                       
                        channelno++;
                        
                    }
                }
                
            }
            return channelno;
        }
        
        public static Channel[] createchannels(int nop,LinkedList PNAMES,Channel[] channel)
	{
		
                System.out.println(nop);
		for(int i=0;i<nop;i++)
                {
                    channel[i]=new Channel(((PNAMES.get(i)).toString()).charAt(0));
                }
                return channel;
		
	}
       
        public static String readevents(String filelocation,LinkedList P,int nop,char controlprocess,int noofchannels,channelist[] Clists,ChannelRecord[][] CRecord,LinkedList PNAMES,char[] processes)
	{
		String fname="events.txt";
                String output=new String();
		BufferedReader fh=getfilehandle(fname,filelocation);
		int ch;
                boolean isthefirstprocess=true;
                int firstline=0;
                int tabcount=0;
                int reportcount=0;
                char currentprocess='0';
                int digitcount=0;
                int eventnumber=-1;
                char eventtype='0';
		ch=readone(fh);	
                /********************************************/
                /*Initializing the channel list objects*/
                /*******************************************/
                for(int z=0;z<noofchannels;z++)
                {
                    Clists[z]=new channelist();
                }
                /********************************************/
		while(ch>=0)
		{	
			while(ch!=10 && ch!=13)
			{
                             if(ch==9)
                            {
                                tabcount++;
                            }
                            if(tabcount==0 && ch!=9)
                            {
                               if((ch>=65 && ch<=90))
				{
                                        if(isthefirstprocess==true)
                                        {
                                           
                                            isthefirstprocess=false;
                                            currentprocess=(char)ch;
                                            
                                        }
                                        else
                                        {
                                            currentprocess=(char)ch;
                                        }
                                        updateisknown((char)ch,P,PNAMES);
                                }
                                if(ch==116)//last character of report
                                {
                                    //report the scores
                                    reportcount++;
                                   output=output+display(P,Clists,CRecord,nop,processes);
                                   Process temp=(Process)(P.get(0));
                                  
                                   if(temp.weight.equals("1") ==false || firstline==0)
                                   {
                                       
                                       output=output+'\n';
                                       firstline=1;
                                   }
                                    
                                }
                            }
                            if(tabcount==1 && ch!=9)
				{
					digitcount++;
					if(digitcount==1)
					{
						eventnumber=Character.getNumericValue(ch);
					}
					if(digitcount>=2)
					{
						eventnumber=(eventnumber*10)+Character.getNumericValue(ch);
					}
                                       
				}
                            if(tabcount==2 && ch!=9)
                            {
                                eventtype=(char)ch;
                            }
                            if(eventtype=='A')
                            {
                              
                                if(isthefirstprocess==true)
                                {
                                    //assign weight 1 to the process
                                    isthefirstprocess=false;
                                }
                                else
                                {
                                    // what all is possible for an atomic event
                                }
                                
                                
                            }
                            if(eventtype=='S')
                            {
                                
                                //CONTINUE READING AND LOAD THE INFO ON THE SENDER'S CHANNEL
                                if(tabcount>=3 && ch!=9)
                                {
                                    //load the sender process's channel with the info
                                      int size=P.size();
                                      String weight="0";
                                       Process temp;
                                       
                                      for(int j=0;j<size;j++)
                                      {
                                            temp=(Process)(P.get(j));
                                            if(temp.name==currentprocess)
                                            {                    
                                                if(temp.weight.equals("0")==false)
                                                {
                                                 
                                                 temp.weight=temp.weight="0"+temp.weight;
                                                 weight=temp.weight;
                                                }                                            
                                            }
                                      }
                                      
                                    // now we have the weight of sending process
                                     int cn= getchannelno(currentprocess,(char)ch,nop,CRecord);
                                    
                                           
                                     
                                     Clists[cn].listofchannels.add(weight);
                                  
         
                                     updateisknown((char)ch,P,PNAMES);
                                    
                                }
                                
                            }
                            if(eventtype=='I')
                            {
                              
                                      Process temp,controltemp;
                                      String weightholder="0"; 
                                      int size=P.size();
                                      controltemp=(Process)(P.get(0));
                                      if(currentprocess!=controltemp.name)
                                      {
                                         for(int j=0;j<size;j++)
                                          {
                                            temp=(Process)(P.get(j));
                                            if(temp.name==currentprocess)
                                            {                                           
                                                 weightholder=temp.weight;
                                                 temp.weight="0";     
                                                 break;
                                            }
                                        }
                                      }
                                    
                                      if(currentprocess!=controltemp.name)
                                      {
                                         int cn= getchannelno(currentprocess,controltemp.name,nop,CRecord);
                                          
                                           Clists[cn].listofchannels.add(weightholder);      
                                         
                                               
                                      }  
                                     
                                                                          
                            }
                            if(eventtype=='R')
                            {
                              
                                if(tabcount>=3 && ch!=9)
                                {    
                                    //removing from the sender process's channeland adding the weight to the current process.
                                    int cn= getchannelno((char)ch,currentprocess,nop,CRecord);
                                    
                                     String receivedweight="0";
                                     try
                                     {
                                        
                                        
                                         receivedweight=Clists[cn].listofchannels.remove();  
                                        
                                                
                                     }
                                     catch(NoSuchElementException e)
                                     {                                                             
                                     }                                                                              
                                           // NOW USE THIS WEIGHT AND DO STUFF WITH IT..
                                            int size=P.size();
                                             Process temp;                                      
                                            for(int j=0;j<size;j++)
                                            {
                                              temp=(Process)(P.get(j));
                                              if(temp.name==currentprocess)
                                                {      
                                                    String tempwt=temp.weight;
                                                    temp.weight=binadd(tempwt,receivedweight);  
                                                    if(currentprocess=='A')
                                                {
                                                    
                                                   
                                                    
                                                }
                                                     
                                                }
                                             } 
                                     updateisknown((char)ch,P,PNAMES);// this updates the isknown       
                                }
                                
                                
                            }
                            ch=readone(fh);
			}
                        tabcount=0;
                        eventtype='0';
                        digitcount=0;
                        currentprocess='0';
                        eventnumber=-1;
			ch=readone(fh);
		}
		closefile(fh);
                return output;
	
		
	}
        public static int getchannelno(char sender,char receiver,int nop,ChannelRecord[][] CRecord)
        {
            int channelnumber=-1;
            int i=0;
            int j=0;
            for(i=0;i<nop;i++)
            {
                
                for(j=0;j<nop;j++)
                {
                    if(CRecord[i][j].sender==sender &&CRecord[i][j].receiver==receiver)
                    {
                        channelnumber=CRecord[i][j].channelno;
                    }
                }
            }
            return channelnumber;
        }
        public static void print(String s)
        {
            System.out.println(s);
        }
        public static void updateisknown(char process,LinkedList P,LinkedList PNAMES)
        {
            String pname= new String();
            int indexofprocess;
            Process temp;
            pname=Character.toString(process);
            indexofprocess=PNAMES.indexOf(pname);
            temp=(Process)P.get(indexofprocess);
            temp.isknown=true;          
        }
        public static String display(LinkedList P,channelist[] Clists,ChannelRecord[][] CRecord,int nop,char[] processes)
        {
            
            int psize=P.size();
            char s;
            char r;
            int cnumber;
            int printcount=0;
            int channelsize;
            String report=new String();
            
            for(int alpha=0;alpha<psize;alpha++)
            {
                for(int i=0;i<psize;i++)
                {
                   Process temp=(Process)P.get(i);
                   if(temp.name==processes[alpha])
                   {                   
                        if(temp.isknown==true)
                        {
                              if(printcount>=1)
                              {
                                  //System.out.print('\t');
                                  report=report+'\t';
                                  
                              }
                             // System.out.print(temp.name+"="+doubletobin(temp.weight));
                           
                              report=report+temp.name+"="+temp.weight;
                              printcount++;                                                           
                        }
                   
                   }
                   // print the channels here                
                }
            }    
                        
            for(int p=0;p<nop;p++)
                  {
                      for(int q=0;q<nop;q++)
                      {
                          String channelweight="0";
                          s=CRecord[p][q].sender;
                          r=CRecord[p][q].receiver;
                          cnumber=CRecord[p][q].channelno;
                        // try
                          {
                                 channelsize=Clists[cnumber].listofchannels.size();
                                 for(int x=0;x<channelsize;x++)
                                 {
                                     String wt=Clists[cnumber].listofchannels.get(x);
                                  //   System.out.print(channelsize);
                                   //  System.out.println('\t'+"c"+s+r+"="+wt);
                                     String channelweightcopy=channelweight;
                                     
                                     channelweight=binadd(channelweightcopy,wt);
                                    // System.out.println("CHANNELWEIGHT "+(channelweight));
                                    
                                }
                                 
                                if(channelweight.equals("0")==false)
                                {
                                     
                                   
                                    report=report+'\t'+"c"+s+r+"="+(channelweight);
                                    
                                }
                          }
                         // catch(NullPointerException e)
                          {
                          
                          }                       
                      }
                     
                  }
            return report;
           // System.out.print('\n');
            
           
        }
    public static void main(String[] args)
    {
        String filelocation="";
        int nop=0;
        char controlprocess;
        String output;
        int noofchannels=0;
        LinkedList<String> PNAMES=new LinkedList<String>();
        LinkedList<Process> P=new LinkedList<Process>();
        nop=createprocessrecord(filelocation,P,PNAMES);
        
        controlprocess=PNAMES.getFirst().charAt(0);
        
        /*********************************************************************/
            /*I am going to get an array of processes which is sorted*/
        char[] processes=new char[PNAMES.size()];
            int pcounter=0;
            for(int c=((int)'A');c<=(int)'Z';c++)
            {           
                for(int zz=0;zz<PNAMES.size();zz++)
                {
                        char a=(PNAMES.get(zz)).charAt(0);       
                        
                        if(a==(char)c)
                        {
                            processes[pcounter]=a;
                            pcounter++;
                            zz=PNAMES.size();
                        }
                   
                }
                
            }
            /**************************************************/
        ChannelRecord[][] CRecord=new ChannelRecord[nop][nop];
        noofchannels=createchannelrecord(nop,PNAMES,CRecord,processes);
        
        channelist[] Clist=new channelist[noofchannels];
        

       output=readevents(filelocation,P,nop,controlprocess,noofchannels,Clist,CRecord,PNAMES,processes);
       
       writeintoafile(output,filelocation);
       
        
    }
    
}
