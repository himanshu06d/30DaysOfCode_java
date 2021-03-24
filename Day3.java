
public class Day3 {
	double tip = (tip_percent * meal_cost) / 100;
    double tax = (tax_percent * meal_cost) / 100;
    int total_cost = (int) Math.round(meal_cost + tip + tax);
    System.out.println(total_cost);
}
