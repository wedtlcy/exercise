package com.xgdfin.exercise.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xgdfin.exercise.bean.User;
import org.junit.Test;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/** 
* @description:  Jackson工具使用
* @author: chuanyin.li
* @date: 2019/5/7 
*/ 
public class JacksonTest implements Serializable {

    private ObjectMapper mapper = new ObjectMapper();

    /**
     * ObjectMapper是JSON操作的核心，Jackson的所有JSON操作都是在ObjectMapper中实现。
     * ObjectMapper有多个JSON序列化的方法，可以把JSON字符串保存File、OutputStream等不同的介质中。
     * writeValue(File arg0, Object arg1)把arg1转成json序列，并保存到arg0文件中。
     * writeValue(OutputStream arg0, Object arg1)把arg1转成json序列，并保存到arg0输出流中。
     * writeValueAsBytes(Object arg0)把arg0转成json序列，并把结果输出成字节数组。
     * writeValueAsString(Object arg0)把arg0转成json序列，并把结果输出成字符串。
     */
    /**
     * @description:
     * @param: []
     * @return: void
     * @author: chuanyin.li
     * @date: 2019/5/7
     */
    @Test
    public void javaObj2Json() throws Exception {

        User user = new User();
        user.setName("zhangsan");
        user.setEmail("zhangsan@163.com");
        user.setAge(20);

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        user.setBirthday(dateformat.parse("1996-10-01"));

        //User类转JSON
        //输出结果：{"name":"zhangsan","age":20,"birthday":844099200000,"email":"zhangsan@163.com"}
        String json = mapper.writeValueAsString(user);
        System.out.println(json);

    }

    /**
     * @description: Java集合转JSON
     * @param: []
     * @return: void
     * @author: chuanyin.li
     * @date: 2019/5/7
     */
    @Test
    public void javaSet2Json() throws Exception {
        User user = new User();
        user.setName("zhangsan");
        user.setEmail("zhangsan@163.com");
        user.setAge(20);

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        user.setBirthday(dateformat.parse("1996-10-01"));
        //Java集合转JSON
        //输出结果：[{"name":"zhangsan","age":20,"birthday":844099200000,"email":"zhangsan@163.com"}]
        List<User> users = new ArrayList<User>();
        users.add(user);
        String jsonlist = mapper.writeValueAsString(users);
        System.out.println(jsonlist);
    }

    /**
     * @description: JSON反序列化
     * @param: []
     * @return: void
     * @author: chuanyin.li
     * @date: 2019/5/7
     */
    @Test
    public void jsonDeSerializable() throws Exception {
        String json = "{\"name\":\"zhangsan\",\"age\":20,\"birthday\":844099200000,\"email\":\"zhangsan@163.com\"}";
        /**
         * ObjectMapper支持从byte[]、File、InputStream、字符串等数据的JSON反序列化。
         */
        User user = mapper.readValue(json, User.class);
        System.out.println(user);
    }

    /**
     * @description: JSON2List集合
     * @param: []
     * @return: void
     * @author: chuanyin.li
     * @date: 2019/5/7
     */
    @Test
    public void json2List() throws Exception {
        String json = "[{\"name\":\"zhangsan\",\"age\":20,\"birthday\":844099200000,\"email\":\"zhangsan@163.com\"}]";
        List<User> beanList = mapper.readValue(json, new TypeReference<List<User>>() { });
        System.out.println(beanList);
    }
}
