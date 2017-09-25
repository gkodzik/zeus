package com.corp.george.zeus.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.corp.george.zeus.R;
import com.corp.george.zeus.adapter.DevicesAdapter;
import com.corp.george.zeus.data.DummyDataProvider;
import com.corp.george.zeus.devices.Device;
import com.corp.george.zeus.devices.SmartSwitch;
import com.corp.george.zeus.interfaces.IOnItemClickListener;

import butterknife.BindView;

public class DevicesListActivity extends BaseActivity implements IOnItemClickListener<Device>
{

	@BindView(R.id.devices_recycler)
    RecyclerView recyclerView;

	@Override
	int getLayoutResId()
	{
		return R.layout.activity_devices_list;
	}

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

		setupRecycler();
    }

	private void setupRecycler()
	{
		RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
		recyclerView.setLayoutManager(layoutManager);
		DevicesAdapter<SmartSwitch> adapter = new DevicesAdapter<>(this, DummyDataProvider.getDummyDevices(10), this);
		recyclerView.setAdapter(adapter);
	}

	@Override
	public void onItemClick(Device object, View pImageView, View pNameView)
	{
		Intent intent = new Intent(this, DeviceActivity.class);
		Pair<View, String> imagePair = Pair.create(pImageView, "device_image");
		Pair<View, String> namePair = Pair.create(pNameView, "device_name");
		intent.putExtra(DeviceActivity.NAME, object.getName());
		ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, imagePair, namePair);
		startActivity(intent, options.toBundle());
	}
}
