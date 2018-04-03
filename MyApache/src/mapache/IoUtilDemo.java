package mapache;


import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by yuan on 2018/3/16.
 */
public class IoUtilDemo {

    public static void main(String[] args) throws IOException {
//        byte[] bytes = new byte[4];
//        InputStream is = IOUtils.toInputStream("hello world");
//        IOUtils.read(is, bytes);
//        System.out.println(new String(bytes));
//
//        bytes = new byte[10];
//        is = IOUtils.toInputStream("hello world");
//        IOUtils.read(is, bytes, 2, 4);
//        System.out.println(new String(bytes));

        //读取文件
//        InputStream is=new FileInputStream("/d:/reports.xml");
//        List<String> data=IOUtils.readLines(is,"gbk");
//        for(String s:data){
//            System.out.println(s);
//        }

        //String data=FileUtils.readFileToString(new File("/d:/reports.xml"),"gbk");
        //System.out.println(data);
//        List<String> datas=FileUtils.readLines(new File("/d:/reports.xml"),"gbk");
//        datas.stream().forEach(s-> System.out.println(s));

            //FileUtils.write(new File("/d:/ioutils.xml"),"hello world");

//        String[] ss={"xml"};
//        List list= (List) FileUtils.listFiles(new File("/d:/"),ss,false);
//        System.out.println(list);

        String baseName=FilenameUtils.getBaseName("/d:/reports.xml");
        System.out.println(baseName);

        String extension=FilenameUtils.getExtension("/d:/reports.xml");
        System.out.println(extension);

        String fullPath=FilenameUtils.getFullPath("/d:/reports.xml");
        System.out.println(fullPath);

        //seperator转化
        String unixPath=FilenameUtils.normalize("D:\\eclipse3",true);
        System.out.println(unixPath);

    }
}
