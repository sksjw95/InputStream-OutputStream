package inout;

import java.io.FileOutputStream;

public class Main3 {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutput = new FileOutputStream("codestates1.txt");
            String word = "code1";

            byte b[] = word.getBytes();
            fileOutput.write(b);
            fileOutput.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
//위 코드를 실행하면, 같은 디렉토리 내에 code1라는 문자열이 입력된 codestates1.txt 파일이 생성됨을 확인할 수 있다.
