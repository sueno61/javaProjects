/*
 * 学生番号: G99999202x
 * プログラム名: ArgumentTest 
 * プログラムの説明: 名前をコマンドライン引数から入力して挨拶 
 * 作成日: 2023  
 */

public class ArgumentTest {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("こんにちは、" + args[i]);
        }
    }
}
