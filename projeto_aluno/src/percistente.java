import java.sql.Connection;
import java.sql.PreparedStatement;


public class percistente {
	
	public void save(Alunos aluno) {
		
		String sql = "INSERT INTO tabela_alunos(id, nome, turma) VALUES (1,?,?)";
		
		Connection conn = null;
		PreparedStatement persist = null;
		
		try {
			
			conn = Acessos.createConnectionToMySQL();
			
			persist = (PreparedStatement) conn.prepareStatement(sql);
			
			persist.setString(1, aluno.getNome());
			persist.setString(2, aluno.getTurma());
			
			persist.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (persist != null) {
					persist.close();
				}
				if (conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
