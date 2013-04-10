
public class Process 
{
	public char name;
	public String weight;
	boolean isknown=false;
        char state;//A, active , I idle
	public Process()
	{
            isknown=false;
            state='I';
            weight="0";
	}
	
	public Process(char a)
	{
            name=a;
            isknown=false;
            state='I';
            weight="0";
	}
	public Process(char a,String wt)
	{
            name=a;
            isknown=false;
            state='I';
            weight=wt;
	}
	public void display()
	{
		System.out.println("("+name+","+state+","+isknown+","+weight+")");
	}
}