import java.util.ArrayList;

public class MemoryManager {

	PhysicalMemory physicalMemory;
	SubstitutionAlgorythm clock;
	
	public MemoryManager() {
		physicalMemory = new PhysicalMemory();		
	}
	
	// метод, вызываемый при обращении к странице
	public void implementPage(int address, ArrayList<Record> Table) {			
			if(Table.get(address).isInPhysicalMemory() == true) {
				System.out.println("Страница № " + address + "отображена на физическую старницу" + Table.get(address).getNumberOfPhysicalPage());				
				}
			else {
				//загружаем страницу в память								
				int physicalPage = physicalMemory.getFreePage();
				//если есть место, то на свободную страниц
				if(physicalPage!= -1) {
					physicalMemory.takePhysicalPage(physicalPage);
					Table.get(address).sendToPhysicalMemory();
					Table.get(address).setNumberOfPhysicalPage(physicalPage);
					System.out.println("Виртуальная страница № " + address + " отображена на физическую страницу № " + physicalPage);
				}
				else{
					System.out.println("Все физические страницы заняты, запускаем алгоритм замещения страниц");
					clock = new SubstitutionAlgorythm(Table, physicalMemory);
					clock.start();// если нет места, то используем алгоритм замещения страниц
					implementPage(address,Table);//после выполнения, ещё раз пытаемся разместить страницу в физической памяти
				}		
			}	
			// устанавливаем признак обращения к странице
			Table.get(address).r(true);
				
	}
		
}	

