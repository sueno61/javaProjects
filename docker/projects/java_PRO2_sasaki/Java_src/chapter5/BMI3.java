class BMI3 {
  public static void main(String[] args) {
  	double height, weight, weightAve, fat;

  	height = 1.75;
  	weight = 71.5;

  	weightAve = 22 * Math.pow(height, 2);
  	fat = (weight - weightAve) / weightAve * 100;

  	System.out.print("あなたの肥満率は");
  	System.out.printf("%2.1f", fat);
  	System.out.println("%です。");

  	if (fat >= 20) {
  		System.out.println("あなたは太り過ぎです。");
  	} else {
  		System.out.println("あなたは太り過ぎではありません。");
  	}
  }
}
