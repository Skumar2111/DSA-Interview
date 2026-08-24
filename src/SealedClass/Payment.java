package SealedClass;

public sealed class Payment permits CreditCardPayment {

    public void creatingPayment()
    {
        System.out.println("Creating Payment");
    }

}
