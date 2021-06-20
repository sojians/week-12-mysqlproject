package entity;

public class Dishes {

	private int dishId;
	private String dishName;
	private String orderDate;
	private String dishComment;
	private double dishPrice;
	private int dishScore;
	
	public Dishes (int dishId, String dishName, String orderDate, 
			String dishComment, double dishPrice, int dishScore) {
		this.dishId = dishId;
		this.dishName = dishName;
		this.orderDate = orderDate;
		this.dishComment = dishComment;
		this.dishPrice = dishPrice;
		this.dishScore = dishScore;
	}
	
	public int getDishId() {
		return dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public String getDishComment() {
		return dishComment;
	}

	public double getDishPrice() {
		return dishPrice;
	}

	public int getDishScore() {
		return dishScore;
	}

}