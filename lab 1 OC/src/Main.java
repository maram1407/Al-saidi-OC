
public class Main {
	public static void main(String[] args) 
{
	Stack stack = new Stack();
	Jadro jadro = new Jadro(stack);
	
    jadro.ispolnenie_Call(5);
    
    stack.add("2");
    stack.add("4");	     	     
    jadro.ispolnenie_Call(50);
    
    stack.add("2");
    stack.add("4");
    jadro.ispolnenie_Call(4);
    
    stack.add("1");	    
    jadro.ispolnenie_Call(1);
    
    stack.add("operating");
    stack.add("systems");
    stack.add("1");
    jadro.ispolnenie_Call(20);
    
    jadro.printf_Calls();  
   
}


}
