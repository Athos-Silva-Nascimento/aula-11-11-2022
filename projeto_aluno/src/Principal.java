
public class Principal {

	public static void main(String[] args) {
		
		percistente per = new percistente();
		Alunos alu = new Alunos();
		
		alu.setNome("Flavio");
		alu.setTurma("A3");
		
		per.save(alu);
	}

}
