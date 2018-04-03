package mapache;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by yuan on 2018/3/16.
 */
public class BeanutilsDemo {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        Player player=new Player();
        player.setName("xiaoming");
        player.setAge(12);

        System.out.println(BeanUtils.getProperty(player,"name"));
        Object obj=BeanUtils.cloneBean(player);
        Object obj2=player;

        System.out.println(obj==player);
        System.out.println(obj2==player);
    }
}
