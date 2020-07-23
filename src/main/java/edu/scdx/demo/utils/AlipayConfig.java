package edu.scdx.demo.utils;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000116669686";

	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCA0BaYeD3Qpp+s1baGwzLyEih9y8Fmmc73MOBSzpSx74ds6lgA7InzXJfTH3V0QJmkEyHF2pZ0U9JFRvZ4s32+z+JeJRMrI1Y5w4Hk7e98ZL4aE4+Nthp7jkemDSk+8hsYMXhtPSMYGJ37pN645mK1b4wDXtU27HDJlP4XjTtval0s0UJoDZapTk5fmNyyAEGp97l7r15Nn2jwy4vlEOCgKoKG/iu2uQTfJ5cpyuc3SWMiNpI58fFfiVmqTXDItRw2GFXE5h2SqoDylXT6jOeeeV3Poh9kpqyxJgaVZQJc23GqJpBKOWknnQm3UQu5CU3/lvWWTm/bdkGfucm9+S5pAgMBAAECggEAVY9iYtYDYTM7/mZZ/ftsPIQ5Jw2PIeJqKaDqb7ZN6D7M+lhSKhLzspU/N3m+34AFTYlztmLx6sS+d0uibRv0GykkGBqSN+YZ4PZusiwlFcAo0VNK1/ssbgNcrfwx+GCCBLjfX9frFpdLYJnrYm+NAyzbmGWGRBwa8pqnh+dEokTVh4nrtuo+ZQFvAkKbTbAUcWixtNGmSbwhPxwCjiIUOoEcmhKmolB5qWJgtLRK0amh2CKou26dGvpavgcU1A9MdTPopj+EOhwj4PbpiWkkvseH3Y3KuqG56HJGudSG4DykQMm6IQaAIqK5dXBIb2/Fk9tg7F+kSD/ZwUEU3xzUHQKBgQDRHoTiT0XKw1XYVYaNq6ZdAdbiiVs/ENYqwZcckt007kYY1kin6APbQR5euI0V7DbghtpLN6wEcnLZvuyKlsvZCcQetuhB2LFjF0CaNDoCh/MHlIPgwBWfLcKtWz2HddJbfQLZpMzbA4M2MZAKadxsIKQdhvlEIPhFCj9LPXudnwKBgQCdsLyrRduH5XpB8swcgaWq2dCeOP2yOLhP32TiJmpBN+dGtbTPlqgPZTcAo2lBpcCrR8LPofRLwGoD+NjDjMmXREALZ+u+EMjIJ37sYU9fDr+l4YHseQ6qODxDZxOgxVFD99Xf8u+ghhg233TQN6sUacpNdgno1ZKfYiCyziGm9wKBgE8GV3UmO9uZ4ZD1EPnsidvP3CKTgZXdiPFzYuV7YnikKn0sTRyWgw6SFyX4W+iS8VH74/ZUvX6YuWoryju9LJ+CH0j0GeT4PGCT4ufjIKDgOyj8KLIAJKuYoV7dgez0y1+jaDZTHs8NDsKmDCbDRnbeBubZoMzsIKYGb1DBlTtFAoGAamk2mBl3EFiRzOkMRfxTEF0WA3+P63GNJxEoIdgsgcA4yKWb0y3mUSVLHZooUE2LG8o8MyMmGOxKXk3R8PwTmYlL8qZ5FfR7mV3Vr6vnBM2OFGF97Fawx7tVJ2LqguZEdapL4GkuvVNgCb93M38taoQNKYKLI1zkKbvtNtwVJ3cCgYBfoMZR4udX4KDYPtkmaI/JZjXI2NcsXIY6mCb9cD+DmTubsJc2RvDZHnlDGYR4Rnrok5AREJo78vpUSxYmvf9FzlC4Muj8n1rbO6VqfF/3dgIUCJuVwUU5QJ3U7I1ARN8EcCwhD0RvlWVeyrxysJqdfUF2dnB2fVQYHD2YUk/EcQ==";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhQYruzgDr7+vM8XEMVAR2cfATb/p+dvkCR7ji0EgBvGFI5HiCwnclLxOiXx8o3nFLgGYFtq1cyv4FAJh4uDCbkBVLnMZmG4J9kQHBudjKPXMKOY/iobKcfmHj5ks9jd1n5oo9G2MW/jNX6gN3VKho0UL9eiI7qRsbVtmwMZ4yCarvsCM0arv9+BuNbRkwAqLEa5B4KUZG69gaGw5fB/b8XPRgM/uAbv4tTBCNmnTAb4zqLxxgTJxTS3q+CYkiKxw5STxDh03ktVGO57AMiiU10N81ygbaijxQm6ob3YSUOyXWSMJmBEGKsqiOhtBoWKnz6mZHYYcKJKs+22/tKY+IwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/alipay/alipayNotifyNotice";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/alipay/alipayReturnNotice";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

