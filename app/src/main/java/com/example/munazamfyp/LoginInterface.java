package com.example.munazamfyp;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface LoginInterface
{
    @GET("login/{id}/{name}/{pass}")
    Call<String> Get(@Path("id") String id,@Path("name") String name,@Path("pass") String pass);


    @GET("/sendmail/{id}")
    Call<String> emailverify(@Path("id") String id);



}
