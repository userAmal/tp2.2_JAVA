package exe1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Entreprise {
	private String nomEntreprise;
	HashMap<Integer, Departement> Liste_Deps;
	
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public Entreprise(String nomEntreprise) {
		super();
		this.nomEntreprise = nomEntreprise;
	}
	
	public void ajoutDep(Departement d)
	{
		Liste_Deps.put(d.getIdDep(), d);
	}
	public void retirerDep(Departement d)
	{
		Liste_Deps.remove(d.getIdDep());
	}
	public void afficheE()
	{
		Set<Integer> s= Liste_Deps.keySet();
		Iterator<Integer> i1=s.iterator();
		while(i1.hasNext()) {
			int id=i1.next();
			System.out.println(id+":"+Liste_Deps.get(id));
		}
		//Set<Integer> lk=Liste_Deps.keySet();
		//for(Integer id:lk) {
			//System.out.println(id+""+ld.get(id));
		//}
		//set<Entry<Integer,departement>> le=Liste_Deps.entrySet();
		//for(<Entry<Integer,departement>> e :le)){
			//System.out.println(e.getkey()+":"+e.getvalue());
		//}
	}
	public boolean existeD(Departement d)
	{
		return Liste_Deps.containsKey(d.getIdDep());
		//Liste_Deps.containsvalue(d); 
	}
	public void UpdateDep(Employee E, int idDep){
		Departement currentdep=Liste_Deps.get(E.getIdDep());
		if(currentdep!=null){
			currentdep.retirerEmploye(E);
		}
		Departement newdep=Liste_Deps.get(E.getIdDep());
		if(newdep!=null){
			newdep.ajoutEmploye(E);
		}

	}
	public void DepMinCapacity()
	{
		
	}
	
}
