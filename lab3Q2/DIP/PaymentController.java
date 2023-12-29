public class PaymentController {

	private Ipayment paymentMethod;
	
	public void setPaymentMethod(Ipayment paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public void pay() {
		paymentMethod.pay();
	}
}
