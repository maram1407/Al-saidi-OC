import java.util.*;
import java.util.HashMap;
import java.util.Stack;

 public class Jadro {
	 Stack stack= new Stack();
	//хеш-таблица с вызовами
	public HashMap<Integer, SystemCall> SystemCalls;
	
	public Jadro (Stack stack)
	{
	        this.stack = stack;
	        SystemCalls = new HashMap<>();
	        //добавляем новые вызовы
	        SystemCalls.put(100,new SystemCall("lab1"));
	        SystemCalls.put(1,new SystemCall("1"));
	        SystemCalls.put(20,new SystemCall("operating", "systems", "1"));
	        SystemCalls.put(50,new SystemCall("2", "4"));
	        SystemCalls.put(4,new SystemCall("l", "a", "b","№","1"));
	}
	//метод выполнения вызова
	public void ispolnenie_Call(int id)	{	
		//проверка на то, что индекс есть в таблице
	    if (!SystemCalls.containsKey(id))
	    {
	    	System.out.print("Вызванный номер "+id+" не существует\n");
	        return;
	    }
	    //список аргументов по указанному индексу	    
	    
	    for (int i=SystemCalls.get(id).getArgs().size()-1; i>=0; i--)
	    {	    	
	    	if (!stack.remove(i).equals(SystemCalls.get(id).getArgs().get(i))) 
	        {	    		
	    		System.out.println("Аргументы не совпадают" + " id =" + id);
	            return;
	        }
	    }		    
	
	    System.out.println(SystemCalls.get(id).messedg()+ ": id = " + id + ", аргументы =" + SystemCalls.get(id).getArgs().toString());
	    
	}
	//вывод списка системных вызовов
	public  void printf_Calls()	{		
		
			Set<Integer> keys = SystemCalls.keySet();
			
			for (Integer key : keys) {
				System.out.println(key + " " + SystemCalls.get(key).getArgs().toString());
		}
	}


}
