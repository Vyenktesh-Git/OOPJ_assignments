package BMICalculator;

public class BMITracker {

	private double weight;
	private double height;
	private double bmi;
	public BMITracker(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
		this.bmi = calculateBMI();
	}
	public BMITracker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	
	private double calculateBMI() {
        return weight / (height * height);
    }

    public String category() {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
	@Override
	public String toString() {
		return "BMITracker [weight=" + weight + ", height=" + height + ", bmi=" + bmi + "]";
	}
    
    
}
