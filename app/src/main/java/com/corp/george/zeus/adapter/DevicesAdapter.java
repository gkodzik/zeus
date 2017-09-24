package com.corp.george.zeus.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.corp.george.zeus.devices.Device;

import java.util.ArrayList;

/**
 * Created by George on 24.09.2017.
 */

public class DevicesAdapter<T extends Device> extends RecyclerView.Adapter<DevicesAdapter.ViewHolder> {

    ArrayList<T> mDevices;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mDevices.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
