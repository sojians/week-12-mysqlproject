package entity;

public class Restaurants {
	private int restaurant_id;
	private int user_id;
	private String resta_name;
	private String visit_date;
	private short resta_score;
	private String resta_city;
	
	public Restaurants(int restaurant_id, int user_id, String resta_name, String visit_date, short resta_score, String resta_city) {
		this.restaurant_id = restaurant_id;
		this.user_id = user_id;
		this.resta_name = resta_name;
		this.visit_date = visit_date;
		this.resta_score = resta_score;
		this.resta_city = resta_city;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public String getResta_name() {
		return resta_name;
	}
	public String getVisit_date() {
		return visit_date;
	}
	public short getResta_score() {
		return resta_score;
	}
	public String getResta_city() {
		return resta_city;
	}
}