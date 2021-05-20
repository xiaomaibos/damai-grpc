package cn.ecnu.damai.util;

import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.common.HttpHeader;
import com.arronlong.httpclientutil.common.HttpMethods;
import com.arronlong.httpclientutil.common.HttpResult;
import com.arronlong.httpclientutil.exception.HttpProcessException;
import org.apache.http.Header;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 大麦网爬取类
 *
 * @author zzzz76
 */
public class DamaiCrawler {

    private HttpClientFactory httpClientFactory = HttpClientFactory.httpClientFactory;

    // 爬取演出，场次，票档
    public HttpResult crawlProgram(String code) throws HttpProcessException {
        String url = "https://detail.damai.cn/subpage?apiVersion=2.0&dmChannel=pc@damai_pc&bizCode=ali.china.damai&scenario=itemsku&callback=__jp0&itemId=" + code;

        //配置Header
        Header[] headers = HttpHeader.custom()
                .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36")
                .acceptLanguage("en-GB,en;q=0.8")
                .referer("https://detail.damai.cn/item.htm?&id=" + code)
                .build();

        //配置请求参数
        HttpConfig config = HttpConfig.custom()
                .headers(headers)
                .timeout(1000)
                .url(url)
                .encoding("utf-8")
                .client(httpClientFactory.build())
                .method(HttpMethods.GET);

        return HttpClientUtil.sendAndGetResp(config);
    }

    // 下载图片
    public void downImage(String sourUrl, File destUrl) throws HttpProcessException, FileNotFoundException {
        //配置Header
        Header[] headers = HttpHeader.custom()
                .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36")
                .acceptLanguage("en-GB,en;q=0.8")
                .build();

        //配置请求参数
        HttpConfig config = HttpConfig.custom()
                .headers(headers)
                .timeout(1000)
                .url(sourUrl)
                .encoding("utf-8")
                .client(HttpClientFactory.httpClientFactory.build())
                .method(HttpMethods.GET)
                .out(new FileOutputStream(destUrl));

        HttpClientUtil.down(config);
    }

}
