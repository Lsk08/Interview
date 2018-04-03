package mapache;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * Created by yuan on 2018/3/16.
 */
public class LangUtilDemo {

    public static void main(String[] args) {
        String s="test";
        System.out.println(StringUtils.isEmpty(s));//true 代表empty  false代表not empty

        String[] ss=StringUtils.split("a,b,c",",");
        System.out.println(Arrays.toString(ss));

        String[] sss=StringUtils.substringsBetween("<h1>111</h1><h1>111</h1>","<h1>","</h1>");
        System.out.println(Arrays.toString(sss));

        boolean b=StringUtils.isNumeric("01233456");
        System.out.println(b);
    }
}
