package com.corp.george.zeus.rest;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by gkodzik on 25/09/2017.
 */

public interface IRetrofitApi
{

	@GET("on")
	Call<String> turnOnLight();

	@GET("off")
	Call<String> turnOffLight();
}
