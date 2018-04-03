package com.yp.predictions;

/**
 * Created by yuan on 2017/12/27.
 */
//PreCondition的意义在于   如果遇到不可恢复的错误，应该立即尝试在第一时间throw，以避免【盲目容错】
// 也就是考虑 到底是否允许 所需的数据为null， 如果不允许就直接抛出异常
    // 尽量使用if else 判断业务逻辑  用 default【恢复】/throw 处理异常
//也就是按照用法把if-else分为  业务逻辑-直接使用  容错-封装 例如 userId=withDefault(userId,-1) = userId!=null?userId:-1;
//也就是 先checkNotNull -->  业务逻辑 ---> withDefault容错
/**例如
 * userInfo = withDefault(userInfo,fetchUserInfo(userId));
   Assert.assertNotNull(userInfo,"userInfo not exist.");
   if(userInfo.isVip()){
     couponing(userInfo,100);
    } else {
    return;
 }
 */
public final class PreConditions {

    public static void checkArgment(boolean expression){
        if(!expression){
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgment(boolean expression,String msg){
        if(!expression){
            throw new IllegalArgumentException(msg);
        }
    }

    public static void checkArgment(boolean expression,String msgTemple,Object... args){
        if(!expression){
            throw new IllegalArgumentException(String.format(msgTemple,args));
        }
    }

    public static void checkState(boolean expression){
        if(!expression){
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean expression,Object msg){
        if(!expression){
            throw new IllegalStateException(msg.toString());
        }
    }

    public static void checkState(boolean expression,String msgTemple,Object... args){
        if(!expression){
            throw new IllegalStateException(String.format(msgTemple,args));
        }
    }

    public static <T> T checkNotNull(T reference){
        if(reference==null){
            throw new NullPointerException();
        }
        return reference;
    }

    public static <T> T checkNotNull(T reference,Object msg){
        if(reference==null){
            throw new NullPointerException(msg.toString());
        }
        return reference;
    }

    public static <T> T checkNotNull(T reference,String msgTemple,Object... args){
        if(reference==null){
            throw new NullPointerException(String.format(msgTemple,args));
        }
        return reference;
    }

    public int checkIndex(int position,int size){
        if(size<0||position>size){
            throw new IndexOutOfBoundsException();
        }

        return -1;
    }


}
