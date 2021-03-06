package retrofitgerrit.java.vogella.com.retrofit2example1.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;



public class Movie {

    @SerializedName("vote_count")
    @Expose
    public int voteCount;
    @SerializedName("id")
    @Expose
    public int id;
    @SerializedName("video")
    @Expose
    public boolean video;
    @SerializedName("vote_average")
    @Expose
    public float voteAverage;

    @SerializedName("title")
    @Expose
    String title;

    public String getTitle() {
        return title;
    }

    @SerializedName("popularity")
    @Expose
    public float popularity;
    @SerializedName("poster_path")
    @Expose
    public String posterPath;
    @SerializedName("original_language")
    @Expose
    public String originalLanguage;
    @SerializedName("original_title")
    @Expose
    public String originalTitle;
    @SerializedName("genre_ids")
    @Expose
    public List<Integer> genreIds = null;
    @SerializedName("backdrop_path")
    @Expose
    public String backdropPath;
    @SerializedName("adult")
    @Expose
    public boolean adult;
    @SerializedName("overview")
    @Expose
    public String overview;
    @SerializedName("release_date")
    @Expose
    public String releaseDate;

}
