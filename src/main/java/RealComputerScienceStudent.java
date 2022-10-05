public class RealComputerScienceStudent extends ComputerScienceStudent implements Citizen{
    public String gender(String gender) {
        return gender;
    }


    @Override
    public String getAdress() {
        return null;
    }

    @Override
    public int getIdentityCardNumber(int cardNumber) {
        return cardNumber;
    }
}
