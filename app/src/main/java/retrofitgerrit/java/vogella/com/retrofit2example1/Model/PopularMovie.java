package retrofitgerrit.java.vogella.com.retrofit2example1.Model;


import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import retrofitgerrit.java.vogella.com.retrofit2example1.Model.Movie;

public class PopularMovie {

    @SerializedName("page")
    @Expose
    public int page;
    @SerializedName("total_results")
    @Expose
    public int totalResults;
    @SerializedName("total_pages")
    @Expose
    public int totalPages;
    @SerializedName("results")
    @Expose
    List<Movie> results = null;

    public List<Movie> getResults() {
        return results;
    }
}