package com.example.nahidmapactivity;

import com.example.nahidmapactivity.nearbyatm.NearbyAtmResponse;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface NearbyserviceAtm {
    @GET
    Call<NearbyAtmResponse> getNearbyatm(@Url String endUrl);
}
