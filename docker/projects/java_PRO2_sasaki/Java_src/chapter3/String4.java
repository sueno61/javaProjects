class String4 {
  public static void main(String[] args) {
		String s = "Hello.";
		char c = s.charAt(1);

		System.out.println(s + "の2文字目は" + c + "です。");

		String s2 = s.toLowerCase();
		System.out.println(s + "を小文字にすると" + s2 + "です。");

		String s3 = s.toUpperCase();
		System.out.println(s + "を大文字にすると" + s3 + "です。");

		System.out.println("s2とHello.は等しい:" + s2.equals("Hello."));
		System.out.println("s2とHello.は等しい:" + s2.equalsIgnoreCase("Hello."));
	}
}
