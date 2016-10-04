package Rubrica;
import java.util.*;

public class Rubrica {
	private String nome;
	private List<Voce> contatti;
	
	public Rubrica(){
	}

	public Rubrica(String nome) {
		this.nome = nome;
		contatti = new ArrayList<Voce>();;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Voce> getContatti() {
		return contatti;
	}

	public void setContatti(List<Voce> contatti){
		this.contatti = contatti;
	}
	
	public void inserisciVoce(Voce v){
		contatti.add(v);
	}
	
}
