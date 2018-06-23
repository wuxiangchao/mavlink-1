package io.dronefleet.mavlink.matrixpilot;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Override;
import java.lang.String;

/**
 * Acknowldge sucess or failure of a flexifunction command 
 */
@MavlinkMessageInfo(
        id = 158,
        crc = 208
)
public final class FlexifunctionCommandAck {
    /**
     * Command acknowledged 
     */
    private final int commandType;

    /**
     * result of acknowledge 
     */
    private final int result;

    private FlexifunctionCommandAck(int commandType, int result) {
        this.commandType = commandType;
        this.result = result;
    }

    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "FlexifunctionCommandAck{commandType=" + commandType
                 + ", result=" + result + "}";
    }

    /**
     * Command acknowledged 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 2
    )
    public final int commandType() {
        return commandType;
    }

    /**
     * result of acknowledge 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 2
    )
    public final int result() {
        return result;
    }

    public static class Builder {
        private int commandType;

        private int result;

        private Builder() {
        }

        /**
         * Command acknowledged 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 2
        )
        public final Builder commandType(int commandType) {
            this.commandType = commandType;
            return this;
        }

        /**
         * result of acknowledge 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 2
        )
        public final Builder result(int result) {
            this.result = result;
            return this;
        }

        public final FlexifunctionCommandAck build() {
            return new FlexifunctionCommandAck(commandType, result);
        }
    }
}