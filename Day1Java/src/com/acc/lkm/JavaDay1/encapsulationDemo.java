package com.acc.lkm.JavaDay1;

public class encapsulationDemo {
	public String getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	private String account_holder;
	private int CVV;
	private double balance;
	private int otp;

	public static void main(String[] args) {
		encapsulationDemo encap=new encapsulationDemo();
		encap.setAccount_holder("Soumyadeep");
		encap.setBalance(0000.0);
		encap.setCVV(212);
		encap.setOtp(123);
		System.out.println(encap.getAccount_holder()+"\n"+encap.getBalance()+"\n"+encap.getCVV()+"\n"+encap.getOtp());
	}

}
