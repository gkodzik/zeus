package com.corp.george.zeus.devices;

import com.corp.george.zeus.enums.DeviceType;

/**
 * Created by George on 24.09.2017.
 */

public class Device {

    private String name;
    private String address;
    private DeviceType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DeviceType getType() {
        return type;
    }

    void setType(DeviceType type) {
        this.type = type;
    }
}
