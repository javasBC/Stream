public class Movie{
    private String title;
    private double rank;
    private int year ;

    public Movie(String title, double rank, int year) {
        this.title = title;
        this.rank = rank;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRank() {
        return rank;
    }

    public  void setRank(double rank) {
        this.rank = rank;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rank=" + rank +
                ", year=" + year +
                '}';
    }


}
