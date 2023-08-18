package DesignPatterns;

enum PaymentTypes {
	CreditCard, Epayment, UPIPayment,
}

public class StretegyDesignPattern {
	public static void main(String args[]) {
		Payment payment = PaymentFactory.getPaymentFactory(PaymentTypes.CreditCard.toString());
		payment.payAmount();
		payment = PaymentFactory.getPaymentFactory(PaymentTypes.Epayment.toString());
		payment.payAmount();
		payment = PaymentFactory.getPaymentFactory(PaymentTypes.UPIPayment.toString());
		payment.payAmount();
	}
}

class PaymentFactory {
	public static Payment getPaymentFactory(String paymentType) {
		if(PaymentTypes.CreditCard.toString().equals(paymentType)) {
			return new CreditCardPayment();
		} else if(PaymentTypes.Epayment.toString().equals(paymentType)) {
			return new Epayment(); 
		} else {
			return new UPIPayment();
		}
	}
}


interface Payment {
	void payAmount();
}

class CreditCardPayment implements Payment {
	@Override
	public void payAmount() {
		// TODO Auto-generated method stub
		System.out.println("Printing creditCardpayment online");
	}
}

class Epayment implements Payment {
	@Override
	public void payAmount() {
		// TODO Auto-generated method stub
		System.out.println("Printing Epayment online");
		
	}
}

class UPIPayment implements Payment {
	@Override
	public void payAmount() {
		System.out.println("Printing UPIPayment online");
	}
}