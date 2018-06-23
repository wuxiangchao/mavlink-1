package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;
import java.math.BigInteger;

/**
 * The RAW pressure readings for the typical setup of one absolute pressure and one differential 
 * pressure sensor. The sensor values should be the raw, UNSCALED ADC values. 
 */
@MavlinkMessage(
    id = 28,
    crc = 67
)
public final class RawPressure {
  private final BigInteger timeUsec;

  private final int pressAbs;

  private final int pressDiff1;

  private final int pressDiff2;

  private final int temperature;

  private RawPressure(BigInteger timeUsec, int pressAbs, int pressDiff1, int pressDiff2,
      int temperature) {
    this.timeUsec = timeUsec;
    this.pressAbs = pressAbs;
    this.pressDiff1 = pressDiff1;
    this.pressDiff2 = pressDiff2;
    this.temperature = temperature;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
   */
  @MavlinkMessageField(
      position = 1,
      length = 8
  )
  public final BigInteger timeUsec() {
    return timeUsec;
  }

  /**
   * Absolute pressure (raw) 
   */
  @MavlinkMessageField(
      position = 2,
      length = 2
  )
  public final int pressAbs() {
    return pressAbs;
  }

  /**
   * Differential pressure 1 (raw, 0 if nonexistant) 
   */
  @MavlinkMessageField(
      position = 3,
      length = 2
  )
  public final int pressDiff1() {
    return pressDiff1;
  }

  /**
   * Differential pressure 2 (raw, 0 if nonexistant) 
   */
  @MavlinkMessageField(
      position = 4,
      length = 2
  )
  public final int pressDiff2() {
    return pressDiff2;
  }

  /**
   * Raw Temperature measurement (raw) 
   */
  @MavlinkMessageField(
      position = 5,
      length = 2
  )
  public final int temperature() {
    return temperature;
  }

  public class Builder {
    private BigInteger timeUsec;

    private int pressAbs;

    private int pressDiff1;

    private int pressDiff2;

    private int temperature;

    private Builder() {
    }

    /**
     * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
     */
    @MavlinkMessageField(
        position = 1,
        length = 8
    )
    public final Builder timeUsec(BigInteger timeUsec) {
      this.timeUsec = timeUsec;
      return this;
    }

    /**
     * Absolute pressure (raw) 
     */
    @MavlinkMessageField(
        position = 2,
        length = 2
    )
    public final Builder pressAbs(int pressAbs) {
      this.pressAbs = pressAbs;
      return this;
    }

    /**
     * Differential pressure 1 (raw, 0 if nonexistant) 
     */
    @MavlinkMessageField(
        position = 3,
        length = 2
    )
    public final Builder pressDiff1(int pressDiff1) {
      this.pressDiff1 = pressDiff1;
      return this;
    }

    /**
     * Differential pressure 2 (raw, 0 if nonexistant) 
     */
    @MavlinkMessageField(
        position = 4,
        length = 2
    )
    public final Builder pressDiff2(int pressDiff2) {
      this.pressDiff2 = pressDiff2;
      return this;
    }

    /**
     * Raw Temperature measurement (raw) 
     */
    @MavlinkMessageField(
        position = 5,
        length = 2
    )
    public final Builder temperature(int temperature) {
      this.temperature = temperature;
      return this;
    }

    public final RawPressure build() {
      return new RawPressure(timeUsec, pressAbs, pressDiff1, pressDiff2, temperature);
    }
  }
}