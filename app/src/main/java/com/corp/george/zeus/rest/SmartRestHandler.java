package com.corp.george.zeus.rest;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by gkodzik on 25/09/2017.
 */

public class SmartRestHandler
{

	private IRetrofitApi mRetrofitApi;

	public SmartRestHandler(String pBaseURL)
	{
		try
		{
			OkHttpClient.Builder builder = new OkHttpClient.Builder();

			HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
			logging.setLevel(HttpLoggingInterceptor.Level.BODY);
			builder.addInterceptor(logging);

			Retrofit retrofit = new Retrofit.Builder()
					.baseUrl(pBaseURL + "/")
					.addConverterFactory(GsonConverterFactory.create())
					.client(builder.build())
					.build();
			mRetrofitApi = retrofit.create(IRetrofitApi.class);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
