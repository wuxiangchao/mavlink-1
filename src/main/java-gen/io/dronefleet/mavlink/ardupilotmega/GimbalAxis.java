package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 * null
 */
@MavlinkEnum
public enum GimbalAxis {
    /**
     * Gimbal yaw axis<dl>
     *
     * </dl>
     */
    @MavlinkEntryInfo(0)
    GIMBAL_AXIS_YAW,

    /**
     * Gimbal pitch axis<dl>
     *
     * </dl>
     */
    @MavlinkEntryInfo(1)
    GIMBAL_AXIS_PITCH,

    /**
     * Gimbal roll axis<dl>
     *
     * </dl>
     */
    @MavlinkEntryInfo(2)
    GIMBAL_AXIS_ROLL
}