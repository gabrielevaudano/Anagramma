package it.polito.tdp.anagramma.model;

import java.util.List;

public class TestRicerca {

	public static void main(String[] args) {
		Ricerca ric = new Ricerca() ;

		List<String> ana_prg = ric.anagrammi("ciao") ;
		System.out.println(ana_prg) ;

	}

}
