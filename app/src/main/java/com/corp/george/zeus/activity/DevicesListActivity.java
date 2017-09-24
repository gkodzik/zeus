package com.corp.george.zeus.activity;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.corp.george.zeus.R;
import com.corp.george.zeus.adapter.DevicesAdapter;
import com.corp.george.zeus.data.DummyDataProvider;

public class DevicesListActivity extends BaseActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices_list);
        recyclerView = (RecyclerView) findViewById(R.id.devices_recycler);
    }

    @Override
    protected void onResume() {
        super.onResume();

        recyclerView.setAdapter(new DevicesAdapter<>(this, DummyDataProvider.getDummyDevices(10)));
    }
}
