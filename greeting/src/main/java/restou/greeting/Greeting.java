package restou.greeting;


public class Greeting {

    private String salutation;

    public Greeting() {}

    public Greeting(String salutation) {
        setSalutation(salutation);
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

}