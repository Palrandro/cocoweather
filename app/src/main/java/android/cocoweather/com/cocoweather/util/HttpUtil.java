package android.cocoweather.com.cocoweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by junjp on 2017/3/25.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
