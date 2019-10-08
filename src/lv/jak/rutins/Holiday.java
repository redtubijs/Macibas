package lv.jak.rutins;

public class Holiday {
	
	public String name;
	public int day;
	public String month;
	public boolean national = false;
	
	public Holiday(String name, int day, String month, boolean national) {
		this.name = name;
		this.day = day;
		this.month = month;
		this.national = national;
	}
	
	public Holiday() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public boolean isNational() {
		return national;
	}

	public void setNational(boolean national) {
		this.national = national;
	}
	
	
}
