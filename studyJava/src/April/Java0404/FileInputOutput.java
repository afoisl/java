package April.Java0404;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        File file = new File(FileObject.CURRENT + "/fileio.txt");
        if (file.exists()) {
            file.createNewFile();
        }
        OutputStream os = new FileOutputStream(file, false);
//        byte[] arrayByte = "Hello World. Let's study Spring framework.".getBytes();
        byte[] arrayByte = "안녕하세요.".getBytes(StandardCharsets.UTF_8);
        os.write(arrayByte);
        os.flush();
        os.close();

        // 읽기
        InputStream is = new FileInputStream(file);
        int data;
        byte[] buffer = new byte[1000];
        String str = "";
        while ((data = is.read(buffer)) != -1) {
            str = str + new String(buffer, 0, data,
                    StandardCharsets.UTF_8);
        }
        System.out.println(str);
        is.close();
    }
}
