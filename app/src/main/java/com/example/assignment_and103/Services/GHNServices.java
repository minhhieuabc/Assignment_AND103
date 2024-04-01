package com.example.assignment_and103.Services;

import com.example.assignment_and103.Model.District;
import com.example.assignment_and103.Model.DistrictRequest;
import com.example.assignment_and103.Model.Province;
import com.example.assignment_and103.Model.ResponeGHN;
import com.example.assignment_and103.Model.Ward;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GHNServices {
    public static String GHN_URL = "https://dev-online-gateway.ghn.vn/";
    @GET("shiip/public-api/master-data/province")
    Call<ResponeGHN<ArrayList<Province>>> getListProvince();
    @GET("shiip/public-api/master-data/district")
    Call<ResponeGHN<ArrayList<District>>> getListDistrict(@Body DistrictRequest districtRequest);
    @GET("shiip/public-api/master-data/ward")
    Call<ResponeGHN<ArrayList<Ward>>> getListWard(@Query("district_id") int district_id);
}
