package Item16;

public class Time {
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    public final int hour;
    public final int minute;

    public Time(final int hour, final int minute) {
        this.hour = hour;
        this.minute = minute;
    }
}