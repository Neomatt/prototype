package secu;

import java.util.Scanner;

public class SecuString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/* le differents points a analyser:
		 * est ce que le num comporte bien treize caracteres
		 * est ce que la num ne comporte que des nombre
		 * est ce que ca commence par 1 ou par 2
		 * est ce si cest l'un ou l'autre cest une femme ou cest un homme
		 * est ce que les 2e et 3e chiffres sont des annees valides
		 * est ce que le 4e et le 5 e chiffres sont bien des mois entre 1 et 12
		 * est ce que le 6e et le 7e sont bien des numeros de communes entre 1 et 97
		 * calcul de la cle cle= 97-(num%97)
		 * affichage numero
		 */
		
		
		
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
			 

			 if(numero.substring(0,1).equals("1") || numero.substring(0,1).equals("1") ) {
				
				System.out.println("vous etes un homme! Sauf si vous vous êtes trompé");
				
				String a= numero.substring(1,3);
				
				if (Integer.parseInt(a) < 0 || Integer.parseInt(a) > 99 ) {
						 
					System.out.println("Erreur sur votre année de naissance");
					
					System.out.println("Veuillez recommencer");
				} else {
					
					System.out.println("Good année de naissance");
					
					String t= numero.substring(3,5);
					
					if (Integer.parseInt(t) < 0 || Integer.parseInt(t) > 13) {
						
						 System.out.println("Erreur sur le mois de naissance");
						 
						 System.out.println("Veuillez recommencer");
						 
					} else {
						
						System.out.println("Good le mois de naissance");
						
						String d= numero.substring(5,7);
						 
						if (Integer.parseInt(d) < 0 || Integer.parseInt(d) > 97) {
							
							
							 System.out.println("Erreur sur votre département de naissance");
							 
							 System.out.println("Veuillez recommencer");
							 
						} else {
							
							System.out.println("Good département de naissance");
							
							System.out.println("Bon numéro de sécu");
						}
					}
				}
				
			} else 
				
				System.out.println("vous n'etes ni un homme ni une femme ! Veuillez recommencer");

			 
			}
				
		 } while (r==false);
		 
		
	

	}

}
