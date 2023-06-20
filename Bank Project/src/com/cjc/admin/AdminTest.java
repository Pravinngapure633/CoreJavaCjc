package com.cjc.admin;

import java.util.Scanner;

import com.cjc.model.Account;
import com.cjc.service.RBI;
import com.cjc.serviceImpl.SBI;

public class AdminTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account ac = new Account();

		RBI rbi = new SBI();

		boolean flag = true;

		

			while (flag) 
			{
				System.err.println("**********Welcome To The SBI Bank Application**********");
				System.out.println("Enter 1 For Create Account");
				System.out.println("Enter 2 for View Details");
				System.out.println("Enter 3 For Update Details");
				System.out.println("Enter 4 For Deposite Money");
				System.out.println("Enter 5 For Withdrawl Money");
				System.out.println("Enter 6 For Check Balance");
				System.out.println("Enter 7 for CrateUserId");
				System.out.println("Enter 8 for CreatePassword");
				System.out.println("Enter 9 For Exit Application");
				System.out.println("*******************************************************");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					rbi.createAccount();
					break;
				case 2:
					rbi.viewDetails();
					break;
				case 3:
					rbi.updateDetails();
					break;
				case 4:
					rbi.depositeMoney();
					break;
				case 5:
					rbi.withdrawlMoney();
					break;
				case 6:
					rbi.checkBalance();
					break;

				case 7:
					rbi.userId();
					break;
				case 8:
					rbi.password();
				case 9:
					System.err.println("**********THANK YOU FOR BANKING WITH US***********");
					flag = false;
					break;
				default:
					System.out.println("!!!!!!!!!!!WRONG INPUT PROVIDED!!!!!!!!!!");
				}

			}

		}
	

}
