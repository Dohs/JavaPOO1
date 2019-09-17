public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder (String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }

    private boolean isAware() {
        return aware;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
    
    public String whoAmI() {
        if (isAware() == true) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        }

        else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
    }
}