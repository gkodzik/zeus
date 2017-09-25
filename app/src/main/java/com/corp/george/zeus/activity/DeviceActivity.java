package com.corp.george.zeus.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.corp.george.zeus.R;

import butterknife.BindView;

/**
 * Created by gkodzik on 25/09/2017.
 */

public class DeviceActivity extends BaseActivity
{

	public static final String NAME = "device_name";

	@BindView(R.id.device_image)
	ImageView image;
	@BindView(R.id.device_name)
	TextView name;


	@Override
	int getLayoutResId()
	{
		return R.layout.activity_device;
	}

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		name.setText(getIntent().getStringExtra(NAME));
	}
}
