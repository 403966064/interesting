package com.tiany.alipay;


import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;

/**
 * Created by tian on 17/8/7.
 */
public class alipay {



    public static void alipay() throws AlipayApiException {
        // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
        String app_id = "2016080100143125";

        // 商户私钥，您的PKCS8格式RSA2私钥
        String merchant_private_key = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJsifKJUHfEo5ehFOqzrp9ZRukK0aUy86v8puQYB6w+vj8lhNdqkx8ndNRF5hK8EjiLQXrI/xwbRu88tU5P+548uPQ7loQVfwfjWG3rDfQ1jjR+M97zWW+V8QyLCt9vjSqXS2i7mqqHZnebwZ+KKfkV1YO+NvMxkR0HiA3F17uNFAgMBAAECgYBwI/fQJ9oVD6lRw2lswlRqul1YBq3viMiednyG+TAAALqBqcGSMXcyVrMb1KmzEinkxJcPZsbqCQYn9u3pl2OumGkGR6+ei7VTF94bPuG8GaJV1mjZPx88feixSqmNy9awiO9Jjpxlm3ho9fmVu/Cl1hJ3AWCVeaeErSYsUNeB6QJBAPR5qZWXV+lNF3SySuyyf4F+HwcSxb20g1k2JDzRaJAmau/0ZUhiBOv02qqW7rddKzjt1NaxCAUHmOAvoaLCQacCQQCicqi8zmLA2JkSNMkYs5q3EET2sJUi4A+Bqj/WQtTd5dt1BH1GGsQTAukzLlItgubdF6fBWQw4RWLtTJQ56ZkzAkBjArrpuKeD9xLe0i6B+jClkxyh0rp/ABKKGOFIOE8uwkBg+gvi6r+viDTfDc2UOYl9vuSKJpxm3RLPCLtfnWjVAkEAjaJSpGt9ho5Sx6DmRHczybCRsFQ9c27PlkoN5o3WcrHaKaiEYP8tPTYohMs6MxwSlWnuhZFSKi21FxjRk7ysKQJBAOt4Dmt0gv90g6FMseZpjQnigaGlo7nDfVksnOEuZ78i23jE3DP5IbiJJFRSVFegaqGRveil1Wg0S8MQO1T/Two= ";

        // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
        String alipay_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";

        // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
        String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

        // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
        String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

        // 签名方式
        String sign_type = "RSA";

        // 字符编码格式
        String charset = "utf-8";

        // 支付宝网关
        String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

        // 支付宝网关
        String log_path = "C:\\";
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl, app_id, merchant_private_key,
                "json", charset, alipay_public_key, sign_type);
        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
//    alipayRequest.setReturnUrl(AlipayConfig.return_url);
//    alipayRequest.setNotifyUrl(AlipayConfig.notify_url);notify_url

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = "1231231231";
        //付款金额，必填
        String total_amount = "10.00";
        //订单名称，必填
        String subject = "潮热讽风的";
        //商品描述，可空
        String body = "差点发生大幅度改动";
        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
        //alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
        //		+ "\"total_amount\":\""+ total_amount +"\","
        //		+ "\"subject\":\""+ subject +"\","
        //		+ "\"body\":\""+ body +"\","
        //		+ "\"timeout_express\":\"10m\","
        //		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节

        //请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        System.out.println(result);
    }

    public static void main(String[] args) throws AlipayApiException {
        alipay.alipay();
    }




}
