package com.salahtimings.salah.Utilities;

import com.google.gson.Gson;

/**
 * Created by Kannan on 12/12/2018.
 */
public class GsonUtils {
    private static Gson gson = null;
    public static Gson getInstance(){
        if (gson == null)
            gson = new Gson();
        return gson;
    }
}
