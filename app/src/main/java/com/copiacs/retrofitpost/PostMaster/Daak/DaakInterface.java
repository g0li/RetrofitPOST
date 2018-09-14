package com.copiacs.retrofitpost.PostMaster.Daak;

import com.copiacs.retrofitpost.PostMaster.Lifafa.Lifafa;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface DaakInterface {
    @POST("InsertPartRequestctrl")
    Call<Daak> getRoots(@Body Lifafa lifafa);
}
