import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RPGLoader {
    public static void main(String[] args) {
        System.out.println("セーブデータを読み込みます...");

        //try()に処理を入れることでbr.close()を書く必要が無くなる
        try (BufferedReader br = new BufferedReader(new FileReader("save.csv"))){
            //BufferedReader br = new BufferedReader(new FileReader("save.csv"));
            
            // 文字列として1行読み込む ("Minato,100,50")
            String line = br.readLine();
            //br.close(); // 読み込み終わったらすぐ閉じてOK
            
            if (line != null) {
                System.out.println("読み込んだデータ: " + line);
                
                // カンマ(,)で分割して、配列に入れる
                String[] data = line.split(",");
                // data[0] -> "Minato"
                // data[1] -> "100"
                // data[2] -> "50"
                
                // 文字列から数字に変換する
                String name = data[0];
                int hp = Integer.parseInt(data[1]); // "100" -> 100
                int mp = Integer.parseInt(data[2]); // "50" -> 50
                
                System.out.println("\n--- 勇者復活！ ---");
                System.out.println("名前: " + name);
                System.out.println("HP  : " + hp);
                System.out.println("MP  : " + mp);
                
            } else {
                System.out.println("データが空でした");
            }

        } catch (IOException e) {
            System.out.println("ファイルが見つかりません");
        } catch (NumberFormatException e) {
            // 数字変換に失敗した時はここに来る
            System.out.println("エラー：セーブデータが壊れています");
            System.out.println("（数字が入るべき場所に、変な文字があります）");
        }
    }
}