public class Bmi {
    public static void main(String[] args) {
        String input, msg;
        int height, weight, bmi;

        input = System.console().readLine("身長(cm)を入力して下さい：");
        height = Integer.parseInt(input);
        input = System.console().readLine("体重(kg)を入力して下さい：");
        weight = Integer.parseInt(input);

        if (height <= 0 || weight <= 0) {
            msg = "身長または体重、あるいはその両方の入力が間違っています。";

        } else {
            bmi = (int) (weight / Math.pow(height / 100.0, 2.0));
            System.out.println("あなたのBMIは" + bmi + "です。");

            if (bmi <= 0) {
                msg = "身長または体重、あるいはその両方の入力が間違っています。";
            } else if (bmi < 18) {
                msg = "痩せすぎです。";
            } else if (bmi < 25) {
                msg = "普通です。";
            } else {
                msg = "肥満です。";
            }
        }
        System.out.println(msg);

    }
}
