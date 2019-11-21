package com.example.nahidmapactivity;

import com.example.nahidmapactivity.nearbyhospital.NearbyHospitalResponse;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface NearbyServiceHospital {
    @GET
    Call<NearbyHospitalResponse> getNearbyhospital(@Url String endUrl);
}
