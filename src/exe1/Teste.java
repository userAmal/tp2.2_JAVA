package exe1;

public class Teste {

	public static void main(String[] args) {
		Departement d = new Departement (1);
		Departement d1 = new Departement (2);
		Departement d2 = new Departement (3);
		Employee e1 = new Employee (1,"amal",5000,1);
		Employee e2 = new Employee (12,"SELIM",1000,2);
	    Entreprise e=new Entreprise("amal");
		d.ajoutEmploye(e1);
		d.ajoutEmploye(e2);

		System.out.println("departement :" );
		d.afficheDep();
		
		d.retirerEmploye(e2);
		d.afficheDep();
		System.out.println("L'employe avec le salaire max est : " + d.getEmpSalMax());
		int cin = 12345678;
	    System.out.println("cin est " + cin + " est dans le departement : " + d.existeE(cin));


        e.ajoutDep(d);
        e.ajoutDep(d1);
        e.ajoutDep(d2);
        e.afficheE();
        System.out.println(e.existeD(d1));
        e.DepMinCapacity();
        e.retirerDep(d1);
        e.afficheE();
	}

}
