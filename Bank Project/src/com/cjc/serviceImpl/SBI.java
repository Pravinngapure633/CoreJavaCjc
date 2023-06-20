package com.cjc.serviceImpl;

import java.util.Scanner;

import com.cjc.model.Account;
import com.cjc.service.RBI;

public class SBI  implements RBI {
	
	Account ac=new Account();
	
	Scanner sc=new Scanner(System.in);
	

	@Override
	public void createAccount() 
	{
		
		System.out.println("Enter Account Holder No :");
		ac.setAcNo(sc.nextDouble());
		
		System.out.println("Enter Account Holder Name :");
		ac.setAcName(sc.next()+sc.nextLine());
		
		System.out.println("Enter Accound Holder Address :");
		ac.setAddress(sc.next()+sc.nextLine());
		
		System.out.println("Enter Account Holder MobileNo : ");
		ac.setMobileNo(sc.nextLong());
		
		System.out.println("Enter Account Holder AdharNo :");
		ac.setAdharNo(sc.nextLong());
		
		System.out.println("Enter Account Holder PanNo :");
		ac.setPanNo(sc.next());
		
		System.out.println("Enter Account Holder Balance :");
		ac.setBalance(sc.nextDouble());
		
		System.out.println("Enter Account Holder Gender :");
		ac.setGender(sc.next());
		
		System.out.println("Enter Account UserId");
		ac.setUserId(sc.nextLong());
		
		System.out.println("Enter Account Password");
		ac.setPassword(sc.next());
		
		System.out.println("============================================");
		
	}

	@Override
	public void viewDetails() 
	{
		System.out.println(ac.toString());
		ac.getAcNo();
		ac.getAcName();
		ac.getAddress();
		ac.getMobileNo();
		ac.getAdharNo();
		ac.getPanNo();
		ac.getBalance();
		ac.getGender();
		ac.getUserId();
		ac.getPassword();
		
		System.out.println("============================================");
	}

	@Override
	public void updateDetails() 
	{
		boolean flag=true;
		while(flag) 
		{
		System.out.println("Enter 1 for Update Mobile No");
		System.out.println("Enter 2 for Update Address");
		System.out.println("Enter 3 for Exit Update ");
		
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println("Enter your new mobile no");
				long newmobno=sc.nextLong();
				ac.setMobileNo(newmobno);
				System.out.println("Your Profile will be Updated");
			break;
			
		case 2: System.out.println("Enter your new Address");
				String newAddress=sc.next()+sc.nextLine();
				ac.setAddress(newAddress);
				System.out.println("Your Profile will be Updated");
				
			break;
				
		case 3:
				flag=false;
				System.out.println("Thank you for banking");
				break;
				
			default: System.out.println("Wrong input Provided");
					
		}
		}
		
		
		
	}

	@Override
	public void depositeMoney() 
	{
		System.out.println("Enter Amount to deposite :");
		int useramount=sc.nextInt();
		
		if(useramount >=100)
		{
			double newbalance=ac.getBalance()+useramount;
			ac.setBalance(newbalance);
			System.out.println("Amount Deoposite Successfully : "+useramount);
			System.out.println("Available Balance Is :"+ac.getBalance());
		}
		else
		{
			System.out.println("Please Enter Amount Greater Than 100 Rs.");
		}
		
		System.out.println("============================================");
	}

	@Override
	public void withdrawlMoney() 
	{
		System.out.println("Enter Amount to Withdrawl");
		
		int useramount=sc.nextInt();
		if(useramount>=100)
		{
			if(useramount<=ac.getBalance())
			{
				double newbalance=ac.getBalance()-useramount;
				ac.setBalance(newbalance);
				System.out.println("Amount Withdrawl Sucessfully  "+useramount);
				System.out.println("Available Balance Is :"+ac.getBalance());
			}
			else 
			{
				System.out.println("!!!!!!!!!!Your Have Insfficient Fund!!!!!!!!!!"+ac.getBalance());
			}
		}
		else
		{
			System.out.println("Please Enter Amount Greater than 100 Rs.");
		}
		
		System.out.println("============================================");
	}

	@Override
	public void checkBalance() 
	{
		System.out.println("Your Balance Is :"+ac.getBalance());
		System.out.println("============================================");	
	}
	
	@Override
	public void userId()
	{
		System.out.println("Enter User Id");
		long userId=sc.nextLong();
		ac.getUserId();
		
		
		
	}

	@Override
	public void password()
	{
		System.out.println("Enter User Password");
		String password=sc.next();
		ac.getPassword();
	}

}
