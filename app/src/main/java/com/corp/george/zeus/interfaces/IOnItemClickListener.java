package com.corp.george.zeus.interfaces;

import android.view.View;

/**
 * Created by gkodzik on 25/09/2017.
 */

public interface IOnItemClickListener<T>
{
	void onItemClick(T object, View image, View name);
}
