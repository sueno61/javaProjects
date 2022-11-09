class BMI4 {
  public static void main(String[] args) {
		double height, weight, weightAve, fat;

		height = 1.75;
		weight = 71.5;

		weightAve = 22 * Math.pow(height, 2);
		fat = (weight - weightAve) / weightAve * 100;

		System.out.print("あなたの肥満率は");
		System.out.printf("%2.1f", fat);
		System.out.println("%です。");

		System.out.print("あなたは太り過ぎで");
		System.out.println(fat >= 20 ? "す。": "はありません。");
	}
}
