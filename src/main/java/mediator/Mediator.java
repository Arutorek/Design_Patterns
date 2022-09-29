package mediator;

public interface Mediator {
    public void saleOffer(String stock, int shares, int colleague);
    public void buyOffer(String stock, int shares, int colleague);
    public void addColleague(Colleague colleague);

}
