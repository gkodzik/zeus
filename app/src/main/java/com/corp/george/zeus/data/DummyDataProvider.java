package com.corp.george.zeus.data;

import android.util.Log;

import com.corp.george.zeus.devices.SmartSwitch;
import com.corp.george.zeus.enums.DeviceType;

import java.util.ArrayList;

/**
 * Created by George on 24.09.2017.
 */

public class DummyDataProvider {

    public static ArrayList<SmartSwitch> getDummyDevices(int pCount)
    {
        ArrayList<SmartSwitch> devices = new ArrayList<>();
        for (int i = 0; i < pCount; i++)
        {
            SmartSwitch device = new SmartSwitch();
            device.setName("Device " + i);
            device.setAddress("192.168.8." + i);
            devices.add(device);
        }
        return devices;
    }
}
