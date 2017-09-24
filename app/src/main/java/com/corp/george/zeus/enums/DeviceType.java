package com.corp.george.zeus.enums;

import com.corp.george.zeus.R;

/**
 * Created by George on 24.09.2017.
 */

public enum DeviceType {
    PLUG(R.mipmap.lightbulb_off);

    int resourceId;

    DeviceType(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getResourceId() {
        return resourceId;
    }
}
