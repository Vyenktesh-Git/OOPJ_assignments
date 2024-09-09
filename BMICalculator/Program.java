package BMICalculator;

public class Program {

	public static void main(String[] args) {
		BMITrackerUtil.menu();

		BMITracker bmi = BMITrackerUtil.acceptRecord();
		BMITrackerUtil.printRecord(bmi);
	}
}
