package manageSports;

public class Soccer implements Sports{
    @Override
    public String getPracticeInputs() {
        return "Practice goalkeeping and hits";
    }

    @Override
    public int rate() {
        return 5;
    }

    @Override
    public String getSportsDescription() {
        return "Football is amazing game";
    }
}
