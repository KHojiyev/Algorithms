package developer.rating;


public class Book {

    private String title;
    private int year;
    private double rate;


    public Book(String title, int year, double rate) {
        this.title = title;
        this.year = year;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", rate=" + rate +
                '}';
    }
}
