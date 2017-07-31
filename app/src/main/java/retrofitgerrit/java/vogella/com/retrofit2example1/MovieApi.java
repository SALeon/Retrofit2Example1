package retrofitgerrit.java.vogella.com.retrofit2example1;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofitgerrit.java.vogella.com.retrofit2example1.Model.PopularMovie;

public interface MovieApi {

    @GET("movie/top_rated?api_key={key}")
    Call<PopularMovie> request(@Path("key")String key);

}
