import java.io.File;
import java.net.URI;
import java.util.Arrays;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/23 21:25
 */
public class deleteFile {

    public static void main(String[] args) {
        dd("D:\\cc");
    }
    public static void dd(String name){
        File file = new File(name);
        if(file.isFile()){
           //file.delete();
            System.out.println(file.getName());
        }else{
            File[] files = file.listFiles();
            if(files.length==0){
                System.out.println(file.getName());
                //file.delete();
            }else{
                for(File file1:files){
                    if(file1.isFile()){
                        System.out.println(file1.getName());
                        //file1.delete();
                    }else{
                        dd(file1.getAbsolutePath());
                        System.out.println(file1.getName());
                        //file1.delete();
                    }
                }
            }
        }
    }
}
