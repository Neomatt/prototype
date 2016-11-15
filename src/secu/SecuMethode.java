package secu;

import java.util.Scanner;

public class SecuMethode {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean r=true;
		String numero;
		
		System.out.println("Veuillez entrer votre numéro de sécurité sociale");
		numero=sc.nextLine();

		 
		 do{
			 
			if (numero.length()!=13) {
				
				if (numero.length() < 13) {
					
					 System.out.println("Votre numéro de sécurité sociale doit avoir 13 chiffres,il est trop court, veuillez recommencer");

				} else if (numero.length() > 13 ) {
					
					 System.out.println("Votre numéro de sécurité sociale doit avoir 13 chiffres,il est trop long, veuillez recommencer");
				}

			} else {
			 
					
			Boolean b_sexe = CheckSexe(numero.substring(0,1));
			Boolean b_anne_naissance = CheckAnneeNaissance(numero.substring(1,3));
			Boolean b_mois_naissance = CheckMoiNaissance(numero.substring(3,5));
			Boolean b_departement = CheckDepartement(numero.substring(5,7));
			
			String sexe =null;
				
			 if(b_sexe) {
				 
				sexe = GetSexe(numero.substring(0,1));
				
				System.out.println("vous etes un"+sexe+"! Sauf si vous vous êtes trompé");
				
				
				if(!b_anne_naissance){
					
					System.out.println("Erreur sur votre année de naissance");
					
				} else {
						
					System.out.println("Année de naissance Valide");
					
					if(!b_mois_naissance) {
						
						System.out.println("Erreur sur le mois de naissance");
						
					} else {
						
						System.out.println("Mois de naissance Valide");
						
						if(!b_departement) {
							
							System.out.println("Erreur sur votre département de naissance");
							
						} else {
							
						}
							System.out.println("Département de naissance Valide");
							
					}
				}
				
			 } else {
				 System.out.println("vous n'etes ni un homme ni une femme ! Veuillez recommencer");
			 }
					 
			}
				
		 } while (r==false);
		 
		
	

	}

	
	private static Boolean CheckSexe(String numero) {
		 
		boolean flag = true;
		
		 if(numero.equals("1") || numero.equals("2") ) {
			 flag =true;
		 } else {
			 flag = false;
		 }
		 
		 return flag;
	}
	
	private static Boolean CheckAnneeNaissance(String numero) {
		 
		boolean flag = true;
		
		if (Integer.parseInt(numero) < 0 || Integer.parseInt(numero) > 99 ) {
			 flag =false;
		 } else {
			 flag = true;
		 }
		 
		 return flag;
	}
	
	private static Boolean CheckMoiNaissance(String numero) {
		 
		boolean flag = true;

		if (Integer.parseInt(numero) < 0 || Integer.parseInt(numero) > 13 ) {
			 flag =false;
		 } else {
			 flag = true;
		 }
		 
		 return flag;
	}
	
	private static Boolean CheckDepartement(String numero) {
		 
		boolean flag = true;

		if (Integer.parseInt(numero) < 0 || Integer.parseInt(numero) > 97 ) {
			 flag =false;
		 } else {
			 flag = true;
		 }
		 
		 return flag;
	}
	
	private static String GetSexe(String numero) {
		 
		String sexe = null;
		
		 if(numero.equals("1")) {
			 
			 sexe ="Homme";
		 } else {
			 sexe ="Femme";
		 }
		 
		 return sexe;
	}
	
	//Afaire rajouter GetDepartement() GetMoiNaissance GetAnneeNaissance() et les affichés :-)
	
}
