import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MemoReader {
    public static void main(String[] args){
        try {
            // ファイルを開く（読み込み）
            FileReader fr = new FileReader("memo.txt");

            //バッファで囲む
            BufferedReader br = new BufferedReader(fr);

            String line;

            //数字ではなく文字列で渡してくれる
            while((line = br.readLine())!=null){
                System.out.println("読み込んだ行:"+line);
            }

            br.close();

        }catch (IOException e){
            e.printStackTrace();
        }
            /* ----------バッファを使わない方法-------------
            // ファイルを開く（読み込み）
            FileReader fr = new FileReader("memo.txt");
            
            // 1文字ずつ読んで表示するループ
            int data; // 読み込んだ文字コードを入れる変数
            
            // fr.read() は1文字読み込んでそのコード(数字)を返す。
            // データがなくなると「-1」を返すので、そこまで繰り返す。
            while ((data = fr.read()) != -1) {
                // そのままだと数字なので、(char)で文字に直して表示
                System.out.print((char) data);
            }
            
            System.out.println("\n--- 読み込み終了 ---");
            
            //ファイルを閉じる
            fr.close();

        } catch (IOException e) {
            System.out.println("エラー：ファイルを読み込めませんでした");
            e.printStackTrace();
        }
            */
    }
}
