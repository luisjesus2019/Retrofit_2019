package com.example.santos.webservice;

import com.example.santos.model.Data;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface WebServiceClient {

    @GET("books")
    Call<Data> getPersonajes();

    @GET()
    Call<Data> getPersonajes(@Url String url);

    @GET("books")
    Observable<Data> getPersonajesObservable();

    @GET()
    Observable<Data> getPersonajesObservable(@Url String url);
}
