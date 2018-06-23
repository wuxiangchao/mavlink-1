package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Float;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.List;

/**
 * Sent from simulation to autopilot, avoids in contrast to {@link io.dronefleet.mavlink.common.HilState HilState} singularities. This 
 * packet is useful for high throughput applications such as hardware in the loop simulations. 
 */
@MavlinkMessageInfo(
        id = 115,
        crc = 4
)
public final class HilStateQuaternion {
    /**
     * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
     */
    private final BigInteger timeUsec;

    /**
     * Vehicle attitude expressed as normalized quaternion in w, x, y, z order (with 1 0 0 0 being the 
     * null-rotation) 
     */
    private final List<Float> attitudeQuaternion;

    /**
     * Body frame roll / phi angular speed (rad/s) 
     */
    private final float rollspeed;

    /**
     * Body frame pitch / theta angular speed (rad/s) 
     */
    private final float pitchspeed;

    /**
     * Body frame yaw / psi angular speed (rad/s) 
     */
    private final float yawspeed;

    /**
     * Latitude, expressed as degrees * 1E7 
     */
    private final int lat;

    /**
     * Longitude, expressed as degrees * 1E7 
     */
    private final int lon;

    /**
     * Altitude in meters, expressed as * 1000 (millimeters) 
     */
    private final int alt;

    /**
     * Ground X Speed (Latitude), expressed as cm/s 
     */
    private final int vx;

    /**
     * Ground Y Speed (Longitude), expressed as cm/s 
     */
    private final int vy;

    /**
     * Ground Z Speed (Altitude), expressed as cm/s 
     */
    private final int vz;

    /**
     * Indicated airspeed, expressed as cm/s 
     */
    private final int indAirspeed;

    /**
     * True airspeed, expressed as cm/s 
     */
    private final int trueAirspeed;

    /**
     * X acceleration (mg) 
     */
    private final int xacc;

    /**
     * Y acceleration (mg) 
     */
    private final int yacc;

    /**
     * Z acceleration (mg) 
     */
    private final int zacc;

    private HilStateQuaternion(BigInteger timeUsec, List<Float> attitudeQuaternion, float rollspeed,
            float pitchspeed, float yawspeed, int lat, int lon, int alt, int vx, int vy, int vz,
            int indAirspeed, int trueAirspeed, int xacc, int yacc, int zacc) {
        this.timeUsec = timeUsec;
        this.attitudeQuaternion = attitudeQuaternion;
        this.rollspeed = rollspeed;
        this.pitchspeed = pitchspeed;
        this.yawspeed = yawspeed;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.indAirspeed = indAirspeed;
        this.trueAirspeed = trueAirspeed;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
    }

    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "HilStateQuaternion{timeUsec=" + timeUsec
                 + ", attitudeQuaternion=" + attitudeQuaternion
                 + ", rollspeed=" + rollspeed
                 + ", pitchspeed=" + pitchspeed
                 + ", yawspeed=" + yawspeed
                 + ", lat=" + lat
                 + ", lon=" + lon
                 + ", alt=" + alt
                 + ", vx=" + vx
                 + ", vy=" + vy
                 + ", vz=" + vz
                 + ", indAirspeed=" + indAirspeed
                 + ", trueAirspeed=" + trueAirspeed
                 + ", xacc=" + xacc
                 + ", yacc=" + yacc
                 + ", zacc=" + zacc + "}";
    }

    /**
     * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 8
    )
    public final BigInteger timeUsec() {
        return timeUsec;
    }

    /**
     * Vehicle attitude expressed as normalized quaternion in w, x, y, z order (with 1 0 0 0 being the 
     * null-rotation) 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4,
            arraySize = 4
    )
    public final List<Float> attitudeQuaternion() {
        return attitudeQuaternion;
    }

    /**
     * Body frame roll / phi angular speed (rad/s) 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4
    )
    public final float rollspeed() {
        return rollspeed;
    }

    /**
     * Body frame pitch / theta angular speed (rad/s) 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final float pitchspeed() {
        return pitchspeed;
    }

    /**
     * Body frame yaw / psi angular speed (rad/s) 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4
    )
    public final float yawspeed() {
        return yawspeed;
    }

    /**
     * Latitude, expressed as degrees * 1E7 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4,
            signed = true
    )
    public final int lat() {
        return lat;
    }

    /**
     * Longitude, expressed as degrees * 1E7 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4,
            signed = true
    )
    public final int lon() {
        return lon;
    }

    /**
     * Altitude in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 4,
            signed = true
    )
    public final int alt() {
        return alt;
    }

    /**
     * Ground X Speed (Latitude), expressed as cm/s 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 2,
            signed = true
    )
    public final int vx() {
        return vx;
    }

    /**
     * Ground Y Speed (Longitude), expressed as cm/s 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 2,
            signed = true
    )
    public final int vy() {
        return vy;
    }

    /**
     * Ground Z Speed (Altitude), expressed as cm/s 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 2,
            signed = true
    )
    public final int vz() {
        return vz;
    }

    /**
     * Indicated airspeed, expressed as cm/s 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 2
    )
    public final int indAirspeed() {
        return indAirspeed;
    }

    /**
     * True airspeed, expressed as cm/s 
     */
    @MavlinkFieldInfo(
            position = 13,
            unitSize = 2
    )
    public final int trueAirspeed() {
        return trueAirspeed;
    }

    /**
     * X acceleration (mg) 
     */
    @MavlinkFieldInfo(
            position = 14,
            unitSize = 2,
            signed = true
    )
    public final int xacc() {
        return xacc;
    }

    /**
     * Y acceleration (mg) 
     */
    @MavlinkFieldInfo(
            position = 15,
            unitSize = 2,
            signed = true
    )
    public final int yacc() {
        return yacc;
    }

    /**
     * Z acceleration (mg) 
     */
    @MavlinkFieldInfo(
            position = 16,
            unitSize = 2,
            signed = true
    )
    public final int zacc() {
        return zacc;
    }

    public static class Builder {
        private BigInteger timeUsec;

        private List<Float> attitudeQuaternion;

        private float rollspeed;

        private float pitchspeed;

        private float yawspeed;

        private int lat;

        private int lon;

        private int alt;

        private int vx;

        private int vy;

        private int vz;

        private int indAirspeed;

        private int trueAirspeed;

        private int xacc;

        private int yacc;

        private int zacc;

        private Builder() {
        }

        /**
         * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 8
        )
        public final Builder timeUsec(BigInteger timeUsec) {
            this.timeUsec = timeUsec;
            return this;
        }

        /**
         * Vehicle attitude expressed as normalized quaternion in w, x, y, z order (with 1 0 0 0 being the 
         * null-rotation) 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4,
                arraySize = 4
        )
        public final Builder attitudeQuaternion(List<Float> attitudeQuaternion) {
            this.attitudeQuaternion = attitudeQuaternion;
            return this;
        }

        /**
         * Body frame roll / phi angular speed (rad/s) 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4
        )
        public final Builder rollspeed(float rollspeed) {
            this.rollspeed = rollspeed;
            return this;
        }

        /**
         * Body frame pitch / theta angular speed (rad/s) 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder pitchspeed(float pitchspeed) {
            this.pitchspeed = pitchspeed;
            return this;
        }

        /**
         * Body frame yaw / psi angular speed (rad/s) 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4
        )
        public final Builder yawspeed(float yawspeed) {
            this.yawspeed = yawspeed;
            return this;
        }

        /**
         * Latitude, expressed as degrees * 1E7 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4,
                signed = true
        )
        public final Builder lat(int lat) {
            this.lat = lat;
            return this;
        }

        /**
         * Longitude, expressed as degrees * 1E7 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4,
                signed = true
        )
        public final Builder lon(int lon) {
            this.lon = lon;
            return this;
        }

        /**
         * Altitude in meters, expressed as * 1000 (millimeters) 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 4,
                signed = true
        )
        public final Builder alt(int alt) {
            this.alt = alt;
            return this;
        }

        /**
         * Ground X Speed (Latitude), expressed as cm/s 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 2,
                signed = true
        )
        public final Builder vx(int vx) {
            this.vx = vx;
            return this;
        }

        /**
         * Ground Y Speed (Longitude), expressed as cm/s 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 2,
                signed = true
        )
        public final Builder vy(int vy) {
            this.vy = vy;
            return this;
        }

        /**
         * Ground Z Speed (Altitude), expressed as cm/s 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 2,
                signed = true
        )
        public final Builder vz(int vz) {
            this.vz = vz;
            return this;
        }

        /**
         * Indicated airspeed, expressed as cm/s 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 2
        )
        public final Builder indAirspeed(int indAirspeed) {
            this.indAirspeed = indAirspeed;
            return this;
        }

        /**
         * True airspeed, expressed as cm/s 
         */
        @MavlinkFieldInfo(
                position = 13,
                unitSize = 2
        )
        public final Builder trueAirspeed(int trueAirspeed) {
            this.trueAirspeed = trueAirspeed;
            return this;
        }

        /**
         * X acceleration (mg) 
         */
        @MavlinkFieldInfo(
                position = 14,
                unitSize = 2,
                signed = true
        )
        public final Builder xacc(int xacc) {
            this.xacc = xacc;
            return this;
        }

        /**
         * Y acceleration (mg) 
         */
        @MavlinkFieldInfo(
                position = 15,
                unitSize = 2,
                signed = true
        )
        public final Builder yacc(int yacc) {
            this.yacc = yacc;
            return this;
        }

        /**
         * Z acceleration (mg) 
         */
        @MavlinkFieldInfo(
                position = 16,
                unitSize = 2,
                signed = true
        )
        public final Builder zacc(int zacc) {
            this.zacc = zacc;
            return this;
        }

        public final HilStateQuaternion build() {
            return new HilStateQuaternion(timeUsec, attitudeQuaternion, rollspeed, pitchspeed, yawspeed, lat, lon, alt, vx, vy, vz, indAirspeed, trueAirspeed, xacc, yacc, zacc);
        }
    }
}