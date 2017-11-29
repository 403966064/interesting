package com.tiany;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tiany on 2017/7/18.
 */
@RestController
@EnableAutoConfiguration
public class TestController {
//    @Autowired
//    private RedisUtil redisUtil;
//    @RequestMapping("/test")
//    String test(){
//        System.out.println(redisUtil.getValue("test"));
//        return redisUtil.getValue("test");
//    }
    private boolean doSome(StringBuffer str){
        str.append("今天非常好");
        return true;
    }

    private boolean doSome(String str){
        str = "今天非常不好";
        return true;
    }

    public static void main(String[] args) {
        /*StringBuffer str = new StringBuffer();
        TestController test = new TestController();
        test.doSome(str);
        System.out.println("str-------->"+str);*/

        String str = new String();
        TestController test = new TestController();
        test.doSome(str);
        System.out.println("str-------->"+str);
    }

}
