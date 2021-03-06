package rayacevedo45.c4q.nyc.accessfoodnyc.api.yelp.service;

import rayacevedo45.c4q.nyc.accessfoodnyc.api.yelp.models.Business;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Hoshiko on 8/21/15.
 */
public interface YelpBusinessSearchService {

    public static final String BASE_URL = "https://api.yelp.com";

    @GET("/v2/business/{id}")
    void searchBusiness (@Path("id") String businessId, Callback<Business> businessResult);

}
