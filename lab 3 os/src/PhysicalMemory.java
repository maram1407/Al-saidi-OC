import java.util.ArrayList;
public class PhysicalMemory {
	private int[] physicalPages;		
	int memorySize = 4096;
	int pageSize = 256;
	public PhysicalMemory() {
		int pagesCount = memorySize/pageSize;// 16 физических страниц	
		physicalPages = new int[pagesCount];// массив страниц
		for(int i = 0; i < physicalPages.length; i++) {
			physicalPages[i] = 0;
		}
	}	
	public void takePhysicalPage(int number) {
		physicalPages[number] = 1;
	}
	
	public void sendPageToDisk(int i) {
		physicalPages[i] = 0;
	} 
	
	public void removePage(int i) {
		physicalPages[i] = 0;
	}	
	
	public int getFreePage() {
		for(int i = 0; i < physicalPages.length; i++) {
			if(physicalPages[i] == 0)
				return i;
		}
		return -1;
	}
	

}
