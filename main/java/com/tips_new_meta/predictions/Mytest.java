package com.tips_new_meta.predictions;

import java.util.HashMap;
import java.util.Map;

import static com.tips_new_meta.predictions.PreConditions.checkNotNull;
/**
 * Created by yuan on 2017/12/27.
 */
public class Mytest {

    public static void main(String[] args) {
//        String s=null;
//        checkNotNull(s,"%s is %s","name","null");

        Map<String,String> map=new HashMap<>();
        map.getOrDefault("aa","bb");

    }
}
