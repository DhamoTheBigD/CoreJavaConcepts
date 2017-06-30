package test.handson;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Thankyou {

	public static void main(String[] args) {
//		System.out.println("Thank you Mum & Dad..");
//		FirefoxDriver webDriver =  new FirefoxDriver();
		infoBox("Sss", "Ss");
	}
	public static void infoBox(String infoMessage, String titleBar) {
			JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
		}
		

}
