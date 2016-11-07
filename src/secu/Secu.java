package secu;
import java.util.Scanner;

	public class Secu {
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

	

	int[] num = new int [13];
	
			
	System.out.println("Bienvenu dans l'application qui g�re votre num�ro de s�curit� sociale ");
	System.out.println("Vous allez entrer les treize premiers chiffres votre num�ro de s�curit� sociale un par un ");
	System.out.println("Nous essayons de minimiser le risque d'erreur. Merci! ");
	System.out.println();
	
	int i=1;
  
	// boucles pour la saisie des 13 caracteres
	
	// quand je mets :  for(i=1;i<=(num.length);i++) ou for(i=0;i<(num.length+1);i++), ca me cr�e une exception sur le nombre de caracteres
	//pourtant ca me semble logique pour parcourir de 1 a 13,  voila l'exception
	//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 13 at secu.Secu.main(Secu.java:33)
	// et quand je ne mets pas, ca s'arrete a 12
	
	for(i=1;i<(num.length);i++){
			 System.out.println("entrer le chiffre "+(i));
			 num[i]=sc.nextInt(); 
	 }
	 
			 System.out.println("Voici votre num�ro de s�curit� sociale: " );
//boucles pour l'affichage du tableau (numero de secu)
		 for(i=1;i<(num.length);i++){
		 System.out.print(num[i]);  
		 }
		 System.out.println();
		 
		 boolean j=false;
		 
	do{	//if (j==(num[i]!=num.length)){
		//System.out.println("Erreur sur la longueur de votre num�ro de s�curit� sociale, nous voulons les 13 premiers chiffres: " );
	//}
		
		if (j==(num[0]!=1 || num[0]!=2));
		 {
			System.out.println("Votre num�ro de s�curit� sociale doit commencer par 1 ou par 2, retaper le premier chiffre");
				num[0]=sc.nextInt();
		 System.out.println("Voici votre nouveau num�ro de s�curit� sociale: " );
				 for(i=1;i<(num.length);i++){
				 System.out.print(num[i]);  
				 }
				 System.out.println();
		 }
		 
			if (j==(num[0]==1)){
				System.out.println("Vous �tes un homme! sinon veuillez recommencer" );
			}
			else if (j==(num[0]==2)){
				System.out.println("Vous �tes un femme! sinon veuillez recommencer" );
			}
		
		
		if (j==((num[1]<0 && num[1]>9)||(num[2]<0 && num[2]>9))){
			System.out.print("erreur sur votre ann�e de naissance(2�me et 3�me chiffre), merci de les retaper");
			num[1]=sc.nextInt();
			num[2]=sc.nextInt();
			 System.out.println("Voici votre nouveau num�ro de s�curit� sociale: " );
					 for(i=1;i<=(num.length);i++){
					 System.out.print(num[i]);  
					 }
					 System.out.println();	
		}
		
		if (j==(((num[3]<0 && num[3]>1)||(num[4]<0 && num[4]>9)))){
			System.out.println("erreur sur votre mois de naissance(4�me et 5�me chiffre), merci de les retaper");
			num[3]=sc.nextInt();
			num[4]=sc.nextInt();
			 System.out.println("Voici votre nouveau num�ro de s�curit� sociale: " );
					 for(i=1;i<=(num.length);i++){
					 System.out.print(num[i]);  
					 }
					 System.out.println();	
		}
		
		
		System.out.println("Vous etes n� en "+num[3]+num[4]+"/"+num[1]+num[2]);
		
		if(j=(((num[5]<0 && num[5]>9)||(num[6]<0 && num[6]>9)))){
			System.out.print("erreur sur votre commune de naissance(6�me et 7�me chiffre), merci de les retaper");
			num[5]=sc.nextInt();
			num[6]=sc.nextInt();
			 System.out.println("Voici votre nouveau num�ro de s�curit� sociale: " );
					 for(i=1;i<=(num.length);i++){
					 System.out.print(num[i]);  
					 }
					 System.out.println();	
		} 
		
		System.out.println("Le num�ro de votre commune est: "+num[5]+num[6]);
		
	}while (j=true);
	
		System.out.println("Votre num�ro de s�curit� sociale semble �tre correct");
		
		System.out.println("Nous allons maintenant calculer la cl� de votre num�ro de s�curit� social et l'afficher en entier ");
		/*
		 * je n'ai pas trouv� de facon possible pour faire le calcul d'un tableau par un int
		int cle;
		cle= 97-(97%num[i]);
				
		System.out.println("La cl� est: " +cle);
		
		System.out.println("Votre votre num�ro de s�curit� social en entier est: " +num +cle);
		*/
		}
	}
	/*bool r=true;
	 
	 //do{

	// r=numero.substring(0,0).equals("1");
	 //if (r==true)
	 if (numero.substring(0,0).equals("1")){
			 System.out.println("vous etes un homme, si ce n'est pas le cas alors vous vous etes tromp�, veuillez v�rifier");
			 numero=sc.nextLine();
			 }
	 //r=(numero.substring(0,0).equals("2");
	//if (r==true)
	 else if (numero.substring(0,0).equals("2")){
		 System.out.println("vous etes une femme, si ce n'est pas le cas alors vous vous etes tromp�, veuillez v�rifier");
		 numero=sc.nextLine();
		 }
	// r=(!numero.substring(0,0).equals("1")) || (!numero.substring(0,0).equals("2"));
	//if (r==true)
	 else if ((!numero.substring(0,0).equals("1")) || (!numero.substring(0,0).equals("2"))){
		 System.out.println("vous vous etes tromp� sur le premier chiffre,veuillez v�rifier ");
		 numero=sc.nextLine();
		 }
	 
	 else if (numero.substring(3,4)>12){
		 System.out.println("vous etes une femme, si ce n'est pas le cas alors vous vous etes tromp�, veuillez v�rifier");
		 numero=sc.nextLine();
		 }
	 
	 //}while (r==true)
	 
	 int cle=97-(97% (int)(numero));
	
		
	
		
		
		*/
		
		

