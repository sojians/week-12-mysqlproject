package entity;

public class Restaurants {

	private int restaId;
	private String restaName;
	private String visitDate;
	private int restaScore;
	private String restaCity;
	
	public Restaurants (int restaId, String restaName, String visitDate, int restaScore, String restaCity) {
		this.restaId = restaId;
		this.restaCity = restaCity;
		this.restaName = restaName;
		this.visitDate = visitDate;
		this.restaScore = restaScore;
	}
	
	public int getRestaId() {
		return restaId;
	}

	public String getRestaName() {
		return restaName;
	}

	public String getVisitDate() {
		return visitDate;
	}

	public int getRestaScore() {
		return restaScore;
	}

	public String getRestaCity() {
		return restaCity;
	}

}