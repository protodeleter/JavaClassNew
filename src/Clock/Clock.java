package Clock;

public class Clock {

    private int hour;
    private int minute;


    public Clock(int hour, int min) {

        this.hour = hour;
        this.minute = min;


    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if (hour >= 1 && hour <= 24) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {

        if (minute >= 1 && minute <= 60) {
            this.minute = minute;
        }

    }

    public boolean isTheSameHour(Clock O) {

        return this.hour == O.hour && this.minute == O.minute;
    }

    public String toString() {

        String str = "";


        if (this.hour < 10) {
            str += "0";
        }
        str += this.hour + ":";

        if (this.minute < 10) {
            str += "0";
        }
        str += this.minute;
        return str;

    }
}
