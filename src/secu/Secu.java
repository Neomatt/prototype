package secu;

import java.util.Scanner;

import javax.print.attribute.standard.NumberUpSupported;


public class Secu {
		
	public static void main(String[] args) {
		
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
		
	// Déclaration des variables
		
		Scanner sc = new Scanner(System.in);/* Lecture les entrées clavier*/
		
		int[] num = new int [13]; 
		int[] nums; //tableau d'entier contenant 13 chiffre
				
		System.out.println("Bienvenu dans l'application qui gère votre numéro de sécurité sociale ");
		System.out.println("Vous allez entrer les treize premiers chiffres votre numéro de sécurité sociale un par un ");
		System.out.println("Nous essayons de minimiser le risque d'erreur. Merci! ");
		System.out.println();
		
		int i= 0; //initialisation de l'index
	  
		// boucles pour la saisie des 13 caracteres
		
		// quand je mets :  for(i=1;i<=(num.length);i++) ou for(i=0;i<(num.length+1);i++), ca me crée une exception sur le nombre de caracteres
		//pourtant ca me semble logique pour parcourir de 1 a 13,  voila l'exception
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 13 at secu.Secu.main(Secu.java:33)
		// et quand je ne mets pas, ca s'arrete a 12
		
		//Cette boucle permet de saisir et sauvegarder le 13 chiffre dans le tableau num
		
		for(i=0; i<num.length; i++) {
			
			 System.out.println("entrer le chiffre "+(i));
			 
			 num[i]=sc.nextInt(); 
		 }
		 
				 
		System.out.println("Voici votre numéro de sécurité sociale: " );
				 
		//Boucles pour l'affichage du tableau (numero de secu)
		
		 for(i=0; i<(num.length); i++) {
			 
			 System.out.print(num[i]);  
		 
		 }
		 
		 System.out.println();
		 
		 boolean j=false;
		  
		do{	
		
			/*if num.length) ){
				System.out.println("Erreur sur la longueur de votre numéro de sécurité sociale, nous voulons les 13 premiers chiffres: " );
			}*/
			

			//check la première valeur du tableau si commence par 1 ou par 2.
			if (j==(num[0]!=1 || num[0]!=2 )) {
				
				System.out.println("Votre numéro de sécurité sociale doit commencer par 1 ou par 2, retaper le premier chiffre");
				
				System.out.println("entrer le prmier chiffre");
				 
				num[0]=sc.nextInt(); //ton index est initialiser à 1 et non 0
				
				
				System.out.println("Voici votre nouveau numéro de sécurité sociale: " );
				
				for(i=0; i<(num.length); i++) {
					 
					System.out.print(num[i]);  
				 
				}
				 
				System.out.println();
					 
			 } 
			 
				
			if (( num[0]==1 )) {

				System.out.println("Vous êtes un homme! sinon veuillez recommencer" );
					
			} else if (num[0]==2) {
				
				System.out.println("Vous êtes un femme! sinon veuillez recommencer" );
			
			}
			
			
			//Check année de naissance
			
			if (((num[1]<0 && num[1]>9) || (num[2]<0 && num[2]>9))) {
				
				
				System.out.print("erreur sur votre année de naissance(2ème et 3ème chiffre), merci de les retaper");
				
				num[1]=sc.nextInt();
				num[2]=sc.nextInt();
				
				 System.out.println("Voici votre nouveau numéro de sécurité sociale: " );
				 
				 for(i=0; i<=(num.length); i++) {
					 
					 System.out.print(num[i]); 
					 
				 }
				 
				 System.out.println();	
			}
			
			//Check année de naissance
			
			if (((num[3]<0 && num[3]>1) || (num[4]<0 && num[4]>9))) {
				
				System.out.println("erreur sur votre mois de naissance(4ème et 5ème chiffre), merci de les retaper");
				
				num[3]=sc.nextInt();
				num[4]=sc.nextInt();
				
				 System.out.println("Voici votre nouveau numéro de sécurité sociale: " );
				 
				 for(i=0; i <=(num.length) ;i++) {
					 
					 System.out.print(num[i]);  
				 }
				 
				 System.out.println();	
			}
			
			
			System.out.println("Vous etes né en "+num[3]+num[4]+"/"+num[1]+num[2]);
			
			
			if(((num[5]<0 && num[5]>9)||(num[6]<0 && num[6]>9))) {
				
				
				System.out.print("erreur sur votre commune de naissance(6ème et 7ème chiffre), merci de les retaper");
				
				num[5]=sc.nextInt();
				num[6]=sc.nextInt();
				
				 System.out.println("Voici votre nouveau numéro de sécurité sociale: " );
				 
				 for(i=0;i<=(num.length);i++) {
					 
					 System.out.println(num[i]);	
					 
					 System.out.print(num[i]);  
				 }
				 
				 System.out.println();	
						 
			} 
			
			System.out.println("Le numéro de votre commune est: "+num[5]+num[6]);
			
		} while (j=true); 
		
			System.out.println("Votre numéro de sécurité sociale semble être correct");
			
			System.out.println("Nous allons maintenant calculer la clé de votre numéro de sécurité social et l'afficher en entier ");
			/*
			 * je n'ai pas trouvé de facon possible pour faire le calcul d'un tableau par un int
			int cle;
			cle= 97-(97%num[i]);
					
			System.out.println("La clé est: " +cle);
			
			System.out.println("Votre votre numéro de sécurité social en entier est: " +num +cle);
			*/
			}
	}
	/*bool r=true;
	 
	 //do{

	// r=numero.substring(0,0).equals("1");
	 //if (r==true)
	 if (numero.substring(0,0).equals("1")){
			 System.out.println("vous etes un homme, si ce n'est pas le cas alors vous vous etes trompé, veuillez vérifier");
			 numero=sc.nextLine();
			 }
	 //r=(numero.substring(0,0).equals("2");
	//if (r==true)
	 else if (numero.substring(0,0).equals("2")){
		 System.out.println("vous etes une femme, si ce n'est pas le cas alors vous vous etes trompé, veuillez vérifier");
		 numero=sc.nextLine();
		 }
	// r=(!numero.substring(0,0).equals("1")) || (!numero.substring(0,0).equals("2"));
	//if (r==true)
	 else if ((!numero.substring(0,0).equals("1")) || (!numero.substring(0,0).equals("2"))){
		 System.out.println("vous vous etes trompé sur le premier chiffre,veuillez vérifier ");
		 numero=sc.nextLine();
		 }
	 
	 else if (numero.substring(3,4)>12){
		 System.out.println("vous etes une femme, si ce n'est pas le cas alors vous vous etes trompé, veuillez vérifier");
		 numero=sc.nextLine();
		 }
	 
	 //}while (r==true)
	 
	 int cle=97-(97% (int)(numero));
	
		
	
		
		
		*/
		
		

