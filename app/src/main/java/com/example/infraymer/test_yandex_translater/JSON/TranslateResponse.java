package com.example.infraymer.test_yandex_translater.JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by infraymer on 22.03.17.
 */

public class TranslateResponse {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("text")
    @Expose
    private String[] text;

    public String getCode() {
        return code;
    }

    public String getLang() {
        return lang;
    }

    public String[] getText() {
        return text;
    }
}
