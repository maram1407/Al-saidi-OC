
public class Thread {private String description = "Поток ";
private int maxTime;
private int currentTime = 0;
private int requiredTime;

public Thread(String description, int requiredTime, int maxTime) {
	this.description += description;
	this.maxTime = maxTime;
	this.requiredTime = requiredTime;
}
public int getRequiredTime() {
	return requiredTime;
}

public int getCurrentTime() {
	return currentTime;
}

public int getMaxTime() {
	return maxTime;
}

public String getDescription() {
	return description;
}

public void executeThread() {
	currentTime++;
	System.out.println(getInfo());
}	

public boolean needTime() {
	return requiredTime > currentTime;
}

public boolean haveTime() {
	return maxTime > currentTime;
}
public String getInfo() {
	return description + " maxTime:" + maxTime + " currentTime:" + currentTime + " requiredTime:" + requiredTime;
}

}
