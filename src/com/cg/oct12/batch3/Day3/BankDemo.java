package com.cg.oct12.batch3.Day3;


class HdfcBank
{
static String ifsc;
double balance;

void checkBalance()
{
	System.out.println(this.balance);}
}
public class BankDemo {
public static void main(String[] args) {
	HdfcBank H1=new HdfcBank();
			
			H1.balance=10000;
			H1.checkBalance();
		//	HdfcBank.ifsc="HDFC000111";
			//System.out.println(HdfcBank.ifsc);
			H1.ifsc="123";
			System.out.println(H1.ifsc);
}
}
