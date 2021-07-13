package com.example.recyclerview_using_retrofit_md;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiset {

     @GET("json_user_fetch.php")
     Call<List<ResponseModel>> getUser();

}
