import java.io.FileWriter;
import java.io.IOException;

public class MemoWriter{
    public static void main(String[] args){
        System.out.println("ファイルへの書き込みを開始します...");

        try{
            //memo.txtというファイルを開く（作る）
            //true 追記、false 上書き
            FileWriter fw = new FileWriter("memo.txt",false);
            fw.write("今日の天気は晴れ。\n");
            fw.write("Javaの勉強中");

            fw.close();

            System.out.println("書き込み終了。(memo.txt)");
        }catch (IOException e){
            System.out.println("エラーが発生しました");
            e.printStackTrace();
        }
    }
}