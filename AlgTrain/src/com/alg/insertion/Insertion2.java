package com.alg.insertion;

import javax.sound.midi.SoundbankResource;
import java.util.Arrays;

/**
 * 把list[i]插入list[i-1]
 *  首先保存list[i]->cur
 *  然后遍历list[0] -> list[i-1]  如果 list[i]>cur 把list[i]向后移动 list[i+1]=list[i] 否则退出遍历
 *  list[i+1]=cur
 *
 *  向后移动 list[i+1]=list[i]
 *  退出遍历 break; 或者 for 条件
 * Created by yuan on 2018/7/2.
 */
public class Insertion2 {

    public static void main(String[] args) {

        int[] list={1,3,54,2,66};

        for(int i=1;i<list.length;i++){
            int cur=list[i];
            int pos;
//            for(pos=i-1;pos>=0;pos--){
//                if(list[pos]>cur){
//                    list[pos+1]=list[pos];
//                }else{
//                    break;
//                }
//            }
            for(pos=i-1;pos>=0 && list[pos]>cur;pos--){
                list[pos+1]=list[pos];
            }
            list[pos+1]=cur;
        }

        System.out.println(Arrays.toString(list));


    }
}
