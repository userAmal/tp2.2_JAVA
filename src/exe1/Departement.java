package exe1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
	private int idDep;
	Set<Employee> LEmployes;

	public int getIdDep() {
		return idDep;
	}
	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}
	public Set<Employee> getLEmployes() {
		return LEmployes;
	}
	public void setLEmployes(Set<Employee> lEmployes) {
		LEmployes = lEmployes;
	}
	public Departement(int idDep) {
		this.idDep=idDep;
		LEmployes = new HashSet<>();
	}
	public void ajoutEmploye(Employee E) {
		if (E.getCin()>0) {
			LEmployes.add(E);
			E.setIdDep(this.idDep);
		}
	}
	// afficher détails du département
	public void afficheDep() {
        for (Employee E : LEmployes) {
        System.out.println(LEmployes.toString());
        }

	}
	// retirer un employe du département courant
	public void retirerEmploye(Employee E) {
		LEmployes.remove(E);
	}
	public boolean existeE(int cin)
	{
		return LEmployes.contains(new Employee(12345678,"",0,0));
	}
	//retourner l'employé qui a le plus grand salaire ds le département
	// pensez un utiliser un treeSet
	public Employee getEmpSalMax()
	{
		TreeSet <Employee> p = new TreeSet (LEmployes);
		return p.first();
	}
}
