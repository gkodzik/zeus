package com.corp.george.zeus.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.corp.george.zeus.R;
import com.corp.george.zeus.devices.Device;
import com.corp.george.zeus.interfaces.IOnItemClickListener;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by George on 24.09.2017.
 */

public class DevicesAdapter<T extends Device> extends RecyclerView.Adapter<DevicesAdapter.ViewHolder> {

	private final IOnItemClickListener<Device> listener;
	Context context;
    ArrayList<T> devices;

    public DevicesAdapter(Context pContext, ArrayList<T> pDevices, IOnItemClickListener<Device> pListener) {
        context = pContext;
        devices = pDevices;
		listener = pListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.cell_device, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final DevicesAdapter.ViewHolder holder, final int position) {
        holder.name.setText(devices.get(position).getName());
        holder.address.setText(devices.get(position).getAddress());
        holder.image.setImageResource(devices.get(position).getType().getResourceId());
		holder.linear.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				listener.onItemClick(devices.get(position), holder.image, holder.name);
			}
		});
    }

    @Override
    public int getItemCount() {
        return devices.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

		@BindView(R.id.cell_device_image)
        ImageView image;
		@BindView(R.id.cell_device_name)
        TextView name;
		@BindView(R.id.cell_device_address)
        TextView address;
		@BindView(R.id.cell_device_switch)
        Switch power;
		@BindView(R.id.cell_device_linear)
		LinearLayout linear;

        public ViewHolder(View itemView) {
            super(itemView);
			ButterKnife.bind(this, itemView);
        }
    }
}
