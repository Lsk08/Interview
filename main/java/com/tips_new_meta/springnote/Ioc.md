## Ioc 概述
* Ioc 利用 【反射】 + 【xml配置文件】 解耦了bean的创建,也就是Spring通过解析Xml配置文件中的【全类名】创建类的实例。
* 解耦就是 利用Xml代替了java代码 生成对应的实体类 也就是可以通过替换Xml的形式【改变具体的实现】
* 控制反转 就是生成实体类的动作是Spring完成的，解放手动创建的过程
* Ioc 容器也就是一个 bean工厂的升华


## 依赖注入 DI
* 往类中注入其他对象 【需要一个set方法】
>     <bean name="accountService" class="com.zejian.spring.springIoc.service.impl.AccountServiceImpl">
>                <!--注入accountDao对象,需要set方法-->
>               <property name="accountDao" ref="accountDao"/>
>          </bean>
* 依赖注入的注解情况 = @Autowire = @Resource
* @Resource 有一个name 和 type 属性  默认按照 name配置
* @Value 注入基本类型 配合placeholder使用

## 容器装配XML 和 注解
* 我们采用xml配置文件的方式对bean进行声明和管理，每一个【bean标签】都代表着需要被创建的对象并通过【property标签】可以为该类【注入】其他依赖对象
* Spring 也可以用注解注入,此时 @Configuration=beans标签 @Bean=bean标签
>     @Configuration
>     public class BeanConfiguration { 
>     @Bean
>     public AccountDao accountDao(){
>        return new AccountDaoImpl();
>     }
>     @Bean
>     public AccountService accountService(){
>       AccountServiceImpl bean=new AccountServiceImpl();
>       //注入dao
>       bean.setAccountDao(accountDao());
>       return bean;
>       }
>      }

## Bean的作用域
* 默认是singleton 单例  通过scope设置
> <bean name="accountDao" scope="singleton"    
> class="com.zejian.spring.springIoc.dao.impl.AccountDaoImpl"/>
>  &lt;!--作用域：prototype -->
>  &lt;bean name="accountDao" scope="prototype"     class="com.zejian.spring.springIoc.dao.impl.AccountDaoImpl"/>

## Bean的延迟加载
>     <beans xmlns="http://www.springframework.org/schema/beans"
>      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
>        xmlns:context="http://www.springframework.org/schema/context"
>        xsi:schemaLocation="
>         http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
>         http://www.springframework.org/schema/context
>         http://www.springframework.org/schema/context/spring-context.xsd
>         " default-lazy-init="true">  
>     <!--default-lazy-init="true" xml中全部bean延迟加载 -->
>     <!-- lazy-init="false" 表示非延长加载-->
>     <bean name="accountDao" lazy-init="false"
>           class="com.zejian.spring.springIoc.dao.impl.AccountDaoImpl"/>
>     <!-- 声明accountService对象,交给spring创建 -->
>     <bean name="accountService" class="com.zejian.spring.springIoc.service.impl.AccountServiceImpl">
>           <!-- 注入accountDao对象,需要set方法-->
>           <property name="accountDao" ref="accountDao"/>
>     </bean>
> </beans>`

## ＜context:component-scan/＞与＜context:annotation-config/＞
* ＜context:annotation-config/＞用于自动装配的注解 例如 @Resource @Autowire
* ＜context:component-scan/＞ 包括了组件注解 @Component @Service @Controller 等等,且包含了 ＜context:annotation-config/＞