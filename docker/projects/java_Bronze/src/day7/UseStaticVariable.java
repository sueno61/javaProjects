package day7;

public class UseStaticVariable {
    public static void main(String[] args) {

        StaticVariable.num = 10; // インスタンス生成前に使用
        StaticVariable sample = new StaticVariable();
        System.out.println(StaticVariable.num);

        sample.num = 11;
        System.out.println(sample.num);
    }

}
