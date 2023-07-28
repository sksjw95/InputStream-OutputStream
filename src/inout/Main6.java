package inout;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main6 {
    public static void main(String[] args) throws IOException {
        /*File file = new File("C:\\personal\\InputStream-OutputStream\\codestates.txt");
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getCanonicalFile());
        System.out.println(file.canWrite());*/


        // 파일을 새로생성
        File file = new File("C:\\personal\\InputStream-OutputStream","codestates2.txt");
        file.createNewFile();
        // 파일 내용추가 but 덮어쓰기
        try {
            String fileName = "codestates2.txt";
            FileWriter writer = new FileWriter(fileName);

            String str = "내용추가";
            writer.write(str);
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        // 기존 파일의 내용에 이어쓰기
       /* try {
            String fileName = "codestates2.txt";
            FileWriter writer = new FileWriter(fileName, true);
            String str = "이어쓰기 입니다";
            writer.write(str);
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }*/
        //다음은 현재 디렉토리(.)에서 확장자가 .txt인 파일과 파일명이 "code"로 시작하지 않는 파일을 대상으로, 파일명 앞에 “code”라는 문자열을 붙여주는 예제이다.

        File parentDir = new File("./");
        File[] list = parentDir.listFiles();
        String prefix = "code";

        for(int i = 0; i< list.length; i++){
            String fileName = list[i].getName();

            if(fileName.endsWith("txt") && !fileName.startsWith("code")){
                list[i].renameTo(new File(parentDir, prefix + fileName));
            }
        }
    }
}
