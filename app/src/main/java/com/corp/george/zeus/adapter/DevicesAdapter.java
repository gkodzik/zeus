package com.corp.george.zeus.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.corp.george.zeus.R;
import com.corp.george.zeus.devices.Device;

import java.util.ArrayList;

/**
 * Created by George on 24.09.2017.
 */

public class DevicesAdapter<T extends Device> extends RecyclerView.Adapter<DevicesAdapter.ViewHolder> {

    Context mContext;
    ArrayList<T> mDevices;

    public DevicesAdapter(Context pContext, ArrayList<T> mDevices) {
        this.mContext = pContext;
        this.mDevices = mDevices;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.cell_device, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DevicesAdapter.ViewHolder holder, int position) {
        holder.name.setText(mDevices.get(position).getName());
        holder.address.setText(mDevices.get(position).getAddress());
        holder.image.setImageResource(mDevices.get(position).getType().getResourceId());
    }

    @Override
    public int getItemCount() {
        return mDevices.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name;
        TextView address;
        Switch power;

        public ViewHolder(View itemView) {
            super(itemView);
            image = ((ImageView) itemView.findViewById(R.id.device_image));
            name = ((TextView) itemView.findViewById(R.id.device_name));
            address = ((TextView) itemView.findViewById(R.id.device_address));
            power = ((Switch) itemView.findViewById(R.id.device_switch));
        }
    }
}
