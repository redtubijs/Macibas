package lv.jak.rutins;

public class MainClass {

	public static void main(String[] args) {
		
		Holiday h1 = new Holiday();
		h1.setName("Vecgada diena");
		h1.setDay(31);
		h1.setMonth("decembris");

		Holiday h2 = new Holiday("Ziemassvētki",25 ,"Decembris", false );
		System.out.println("Ziemassvētki un Vecgada vakars ir viena mēnesī:" +inSameMonth(h1, h2));
	}
	
 public static boolean inSameMonth(Holiday h1, Holiday h2) {
	 if(h1.getMonth().equalsIgnoreCase(h2.getMonth()) ) {
		 return true;
	 }
	 else {
		 
	 
		return true;
	}
  }

}
