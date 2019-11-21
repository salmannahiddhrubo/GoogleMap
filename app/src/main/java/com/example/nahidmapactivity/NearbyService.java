package com.example.nahidmapactivity;

import com.example.nahidmapactivity.nearbyplace.NearbyResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface NearbyService {
    @GET
    Call<NearbyResponse> getNerbyplaces(@Url String endUrl);
}
