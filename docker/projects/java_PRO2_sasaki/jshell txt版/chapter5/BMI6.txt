{
	double height, weight, weightAve, fat;

	height = 1.75;
	weight = 70.0;

	weightAve = 22 * Math.pow(height, 2);
	fat = (weight - weightAve) / weightAve * 100;

	System.out.print("あなたの肥満率は");
	System.out.print(fat);
	System.out.println("%です。");

	if ((fat > -10) && (fat < 20)) {
		System.out.println("あなたは普通です。");
	}
}