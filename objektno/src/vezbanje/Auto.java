package vezbanje;

public class Auto {
	
	private int brzina;
	private String marka;
	private boolean ukljucen;
	
	public Auto (int brzina, String marka, boolean ukljucen) {
		this.brzina = brzina;
		this.marka = marka;
		this.ukljucen = ukljucen;
		
	}
	
	public int getBrzina () {
		return brzina;
	}
	
	public void setBrzina (int brzina) {
		this.brzina = brzina;
		
	}
	
	public String getMarka () {
		return marka;
	}
	
	public void setMarka (String marka) {
		this.marka = marka;
		
	}
	
	
	public boolean isUkljucen () {
		return ukljucen;
	}
	
	public void setUkljucen (boolean ukljucen) {
		this.ukljucen = ukljucen;
		
	}
	
	public void ubrzaj (int brzina) {
		
		
		if (ukljucen = true) {
			
			this.brzina += brzina;
			
		}
	}
		
	public void oAutu() {
		
		System.out.println("Marka:" + marka);
		
		if (ukljucen = true) {
			System.out.println("Auto je ukljucen");
			System.out.println("Trenutna brzina:" + brzina);
		}
		
		else {
			System.out.println("Auto je iskljuen.");
		}
	}
		
	public void stani () {
		
		int vreme = 0;
		if (ukljucen = true) {
			if (brzina < 50) {
				vreme = 4;
			}
			else if (50<brzina && brzina<100) {
				vreme = 8;
			}
			else {
				vreme = 12;
			}
			
		}
		
		System.out.println("Vreme zaustavljanja auta je: " + vreme);
		
		
	}
		
	
	
			
		
	
	
	
	
	
	
	

}
