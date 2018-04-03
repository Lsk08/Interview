package com.tips_new_meta.Mybatis_multi_input_demo;

/**
 * Created by yuan on 2018/1/22.
 */
public class MultiInputDemo {

    //用@Param 节约了输入参数的实体类，允许多参数,否则只能使用javaBean
    //用@Param 或者 Map代替
    //参数少推荐使用@param  Map的话 扩展性好于 javaBean 但是不够直观
    /**
     * <span style="font-size:12px;">Public User selectUser(Map paramMap);</span>


     对应的Mapper.xml

     　<select id=" selectUser" resultMap="BaseResultMap">
     　　select  *  from user_user_t   where user_name = #{userName，jdbcType=VARCHAR} and user_password=#{userPassword,jdbcType=VARCHAR}
     　</select>
     */


    /**
     * Public User selectUser(@param(“userName”)Stringname,@param(“userpassword”)String password);


     对应的Mapper.xml

     复制代码
     <select id=" selectUser" resultMap="BaseResultMap">

     select  *  from user_user_t   where user_name = #{userName，jdbcType=VARCHAR} and user_password=#{userPassword,jdbcType=VARCHAR}

     </select>
     */

    /**  【推荐:参数较少,sql比较简单时使用】
     * package Mapper;


     public interface Mapper {

     @Select("select s_id id,s_name name,class_id classid from student where  s_name= #{aaaa} and class_id = #{bbbb}")
     public Student select(@Param("aaaa") String name,@Param("bbbb")int class_id);

     @Delete......

     @Insert......

     }
     */
}
