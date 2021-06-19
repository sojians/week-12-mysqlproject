package entity;

public class Dishes {
	private int dish_id;
	private int user_id;
	private int restaurant_id;
	private String dish_name;
	private String order_date;
	private String dish_comment;
	private float dish_price;
	private short resta_score;
	
	public Dishes(int dish_id, int user_id, int restaurant_id, String dish_name, String order_date, String dish_comment, float dish_price, short resta_score) {
		this.dish_id = dish_id;
		this.user_id = user_id;
		this.restaurant_id = restaurant_id;
		this.dish_name = dish_name;
		this.order_date = order_date;
		this.dish_comment = dish_comment;
		this.dish_price = dish_price;
		this.resta_score = resta_score;
	}

	public int getDish_id() {
		return dish_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public int getRestaurant_id() {
		return restaurant_id;
	}
	public String getDish_name() {
		return dish_name;
	}
	public String getOrder_date() {
		return order_date;
	}
	public String getDish_comment() {
		return dish_comment;
	}
	public float getDish_price() {
		return dish_price;
	}
	public short getResta_score() {
		return resta_score;
	}
	
}