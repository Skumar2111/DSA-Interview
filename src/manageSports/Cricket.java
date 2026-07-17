package manageSports;

public class Cricket implements Sports{

    public Cricket() {

    }

    @Override
    public String getPracticeInputs() {
        return "For Cricket : Practice bowling and batting";
    }

    @Override
    public int rate() {
        return 5;
    }

    @Override
    public String getSportsDescription() {
        return "Cricket is a team sport";
    }

}
