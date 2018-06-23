package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Override;
import java.lang.String;

/**
 * Read out the safety zone the MAV currently assumes. 
 */
@MavlinkMessageInfo(
        id = 55,
        crc = 3
)
public final class SafetyAllowedArea {
    /**
     * x position 1 / Latitude 1 
     */
    private final float p1x;

    /**
     * y position 1 / Longitude 1 
     */
    private final float p1y;

    /**
     * z position 1 / Altitude 1 
     */
    private final float p1z;

    /**
     * x position 2 / Latitude 2 
     */
    private final float p2x;

    /**
     * y position 2 / Longitude 2 
     */
    private final float p2y;

    /**
     * z position 2 / Altitude 2 
     */
    private final float p2z;

    /**
     * Coordinate frame, as defined by {@link io.dronefleet.mavlink.common.MavFrame MavFrame} enum. Can be either global, GPS, right-handed with Z 
     * axis up or local, right handed, Z axis down. 
     */
    private final MavFrame frame;

    private SafetyAllowedArea(float p1x, float p1y, float p1z, float p2x, float p2y, float p2z,
            MavFrame frame) {
        this.p1x = p1x;
        this.p1y = p1y;
        this.p1z = p1z;
        this.p2x = p2x;
        this.p2y = p2y;
        this.p2z = p2z;
        this.frame = frame;
    }

    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "SafetyAllowedArea{frame=" + frame
                 + ", p1x=" + p1x
                 + ", p1y=" + p1y
                 + ", p1z=" + p1z
                 + ", p2x=" + p2x
                 + ", p2y=" + p2y
                 + ", p2z=" + p2z + "}";
    }

    /**
     * x position 1 / Latitude 1 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4
    )
    public final float p1x() {
        return p1x;
    }

    /**
     * y position 1 / Longitude 1 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4
    )
    public final float p1y() {
        return p1y;
    }

    /**
     * z position 1 / Altitude 1 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final float p1z() {
        return p1z;
    }

    /**
     * x position 2 / Latitude 2 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4
    )
    public final float p2x() {
        return p2x;
    }

    /**
     * y position 2 / Longitude 2 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4
    )
    public final float p2y() {
        return p2y;
    }

    /**
     * z position 2 / Altitude 2 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4
    )
    public final float p2z() {
        return p2z;
    }

    /**
     * Coordinate frame, as defined by {@link io.dronefleet.mavlink.common.MavFrame MavFrame} enum. Can be either global, GPS, right-handed with Z 
     * axis up or local, right handed, Z axis down. 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1
    )
    public final MavFrame frame() {
        return frame;
    }

    public static class Builder {
        private float p1x;

        private float p1y;

        private float p1z;

        private float p2x;

        private float p2y;

        private float p2z;

        private MavFrame frame;

        private Builder() {
        }

        /**
         * x position 1 / Latitude 1 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4
        )
        public final Builder p1x(float p1x) {
            this.p1x = p1x;
            return this;
        }

        /**
         * y position 1 / Longitude 1 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4
        )
        public final Builder p1y(float p1y) {
            this.p1y = p1y;
            return this;
        }

        /**
         * z position 1 / Altitude 1 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder p1z(float p1z) {
            this.p1z = p1z;
            return this;
        }

        /**
         * x position 2 / Latitude 2 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4
        )
        public final Builder p2x(float p2x) {
            this.p2x = p2x;
            return this;
        }

        /**
         * y position 2 / Longitude 2 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4
        )
        public final Builder p2y(float p2y) {
            this.p2y = p2y;
            return this;
        }

        /**
         * z position 2 / Altitude 2 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4
        )
        public final Builder p2z(float p2z) {
            this.p2z = p2z;
            return this;
        }

        /**
         * Coordinate frame, as defined by {@link io.dronefleet.mavlink.common.MavFrame MavFrame} enum. Can be either global, GPS, right-handed with Z 
         * axis up or local, right handed, Z axis down. 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1
        )
        public final Builder frame(MavFrame frame) {
            this.frame = frame;
            return this;
        }

        public final SafetyAllowedArea build() {
            return new SafetyAllowedArea(p1x, p1y, p1z, p2x, p2y, p2z, frame);
        }
    }
}