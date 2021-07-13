package com.example.recyclerview_using_retrofit_md;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiController {

    private static final String url = "http://192.168.10.2/api/";
    private static ApiController clientObject;
    private static Retrofit retrofit;

    ApiController() {
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized ApiController getInstance() {
        if (clientObject == null)
            clientObject = new ApiController();

        return clientObject;
    }

    apiset getapi(){
        return retrofit.create(apiset.class);
    }
}
