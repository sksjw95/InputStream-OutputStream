package inout;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Main2 {
    public static void main(String[] args) {

        try{
            FileInputStream fileInput = new FileInputStream("codestates.txt");
            // BufferedInputStream이라는 보조 스트림을 사용하면 성능이 향상되기 때문에, 대부분은 이를 사용한다.
            // 버퍼란 바이트 배열로서, 여러 바이트를 저장하여 한 번에 많은 양의 데이터를 입출력할 수 있도록 도와주는 임시 저장 공간이라고 이해하면 된다.
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
            int i = 0;
            while((i= fileInput.read()) != -1){
                System.out.println((char)i);
            }
            fileInput.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
