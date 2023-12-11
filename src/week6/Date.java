package week6;

public class Date {
    int date;
    String month;
    int year;

    @Override
    public String toString() {
        return "Date{" +
                "date=" + date +
                ", month='" + month + '\'' +
                ", year=" + year +
                '}';
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date(int date, String month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
}
