package retrofitgerrit.java.vogella.com.retrofit2example1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
//[{"key":"","value":"befc7872520fd736c58948abb2f4a53c","description":""}]

public class Controller  {

private static final String BASE_URL="https://api.themoviedb.org/3/";

    Gson gson= new GsonBuilder()
            .setLenient()
            .create();

    Retrofit rentrofit=new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();

    MovieApi mMovieApi =rentrofit.create(MovieApi.class);


}
