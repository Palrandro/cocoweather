package android.cocoweather.com.cocoweather.gson;

import android.text.style.UpdateAppearance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by junjp on 2017/3/25.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

   public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
