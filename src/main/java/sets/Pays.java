package sets;

import java.util.*;

import tri.Comparable;

public class Pays implements java.lang.Comparable<Pays>, Comparable<Pays>{
	private String nom;
	private long nHabit;
	private int pib;

	public Pays(String nom, long nHabit, int pib){
		 this.nom=nom;
		 this.nHabit=nHabit;
		 this.pib=pib;
	};
	public void add(String nom, long nHabit, int pib){};
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getnHabit() {
		return nHabit;
	}

	public void setnHabit(long nHabit) {
		this.nHabit = nHabit;
	}

	public int getPib() {
		return pib;
	}

	public void setPib(int pib) {
		this.pib = pib;
	}
	public String toString(){
		return nom+" "+nHabit+" "+pib;
	}
	

	public static void main(String[] args) {
		Set <Pays> setPays = new HashSet<Pays>();
		setPays.add(new Pays ("USA",325084756,59939)); //2017 WorldBank
		setPays.add(new Pays ("France",64842509,39827));
		setPays.add(new Pays ("Allemagne",82658409,44680));
		setPays.add(new Pays ("UK",66727461,39532));
		setPays.add(new Pays ("Italie",60673701,32038));
		setPays.add(new Pays ("Japon",127502725,38214));
		setPays.add(new Pays ("Chine",1421021791,8612));
		setPays.add(new Pays ("Russie",145530082,10846));
		setPays.add(new Pays ("Inde",1338676785,1980));
		
		int max = 0;
		for (Pays a: setPays){
			int pib = a.getPib();
			if (pib > max){
				max=pib;
			}
		}
		System.out.println("Le PIB per capita le plus important est "+max);
		
		long maxT = 0;
		long minT=0;
		String maxPays = null;
		String minPays = null;
		for (Pays a: setPays){
			int pib = a.getPib();
			long nHab = a.getnHabit();
			if (nHab*pib > maxT){
				maxT = nHab*pib;
				maxPays = a.getNom();
			}else{
				minT = nHab*pib;
				minPays = a.getNom();
			}
			
		}

		System.out.println("Le PIB total le plus important est "+maxT+" "+maxPays);
		
		System.out.println("Le PIB total le plus important est "+minT+" "+minPays);
		
		for (Pays p: setPays){
			if(p.getNom().equals(minPays)){
	        	p.setNom(minPays.toUpperCase());
			}
			System.out.println(p.toString());
		}

		Iterator it = setPays.iterator();
		while(it.hasNext()){
	        Pays p = (Pays)it.next();
	        if(p.getNom().equals(minPays.toUpperCase())){
	        	it.remove();
	        }
		}
		System.out.println("\r");
		for (Pays a: setPays){
			System.out.println(a.toString());
		}
		
	}
	/*	@Override
	public int compareTo(Pays p) {
		return this.nom.compareTo(p.getNom());
	}*/
	
	@Override
	public int compareTo(Pays p) {
		if (this.pib>p.getPib()){
			return -1;
		}else if (this.pib<p.getPib()){
			return 1;
		}
		return 0;
	}
	

}
