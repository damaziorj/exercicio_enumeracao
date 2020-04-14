package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class Program {

	public static void main(String[] args) throws ParseException {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	
	System.out.println("Enter cliente data:  ");
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("Email: ");
	String email = sc.nextLine();
	System.out.print("Birth Date (DD/MM/YYYY): ");
	Date birthDate = sdf.parse(sc.next());
	
	Cliente cliente = new Cliente(name,email,birthDate);
	
	
	
	
	
	
	
	sc.close();
	}

}
