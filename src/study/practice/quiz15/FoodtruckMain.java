package study.practice.quiz15;

public class FoodtruckMain {

	public static void main(String[] args) {
		
		Food f1 = new Food("김밥", 1000);
		Food f2 = new Food("라면", 3000);
		Food f3 = new Food("짜장면", 5000);
		
		f1.setStock(50);
		f2.setStock(100);
		f3.setStock(70);
		
		FoodTruck foodTruckList = new FoodTruck();
		foodTruckList.addFood(f1);
		foodTruckList.addFood(f2);
		foodTruckList.addFood(f3);
		
		foodTruckList.startSales();

	}

}
