package ca.hiral.regwebser;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by Admin on 12-10-2017.
 */
public interface RegisterAPI {
    @FormUrlEncoded
    @POST("/newsig.php")
    public void insertUser(
            @Field("user_name") String name,
            @Field("user_phone") String username,
            @Field("user_address") String password,
            @Field("user_email") String email,
            @Field("lib_Tag")String name1,
            Callback<Response> callback);
}
