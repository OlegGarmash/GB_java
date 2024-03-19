package Tester.s3.home_work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFile {

    public void writeToFile(String path, Human human){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(String.valueOf(human));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
//    public void writeToFile(String path, Human human) {
////        FileWriter fw = null;
//        BufferedWriter bw = null;
//        try {
////            fw = new FileWriter(path);
//            bw = new BufferedWriter(new FileWriter(path));
//            bw.write(String.valueOf(human));
////            fw.append(String.valueOf(human));
////            for (String arg : args) {
////                fw.write(arg + "\n");
////            }
//            bw.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                bw.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}
