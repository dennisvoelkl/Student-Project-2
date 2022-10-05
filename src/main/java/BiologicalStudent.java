public class BiologicalStudent extends Student implements Citizen{
    @Override
    public String getAdress() {
        return "Chicago";
    }

    @Override
    public int getIdentityCardNumber(int cardNumber) {
        return cardNumber;
    }
}
