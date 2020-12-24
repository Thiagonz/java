public class Main {
	public static void main(String[] args){
		// string of conection and database acess
		String servidor = "jdbc:sqlserver://localhost:1433;databaseName=auto_store";
		String usuario = "administrador";
		String senha = "admin";

		//connection
		Connection conexao;
		
		//instruction SQL
		Statement instrucaoSQL
		
		//results
		ResultSet resultados;

		try{

			//conected to database
			conexao = DriverManager.getConnection(servidor, usuario, senha);

			//creating a intruction SQL
			instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			resultados = instrucaoSQL.executeQuery("SELECT * FROM Carros");

			while(resultados.next()){
				
				int id = resultados.getInt("id");
				String nome = resultados.getString("nome");
				String modelo = resultados.getString("modelo");
				String motor = resultados.getString("motor");
				String fabricante = resultados.getString("fabricante");
				int anoFabricacao = resultados.getInt("anoFabricacao");
				int anoModelo = resultados.getInt("anoModelo");
				String cor = resultados.getString("cor");

				System.out.println("id: " + id);
				System.out.println("nome: " + nome);
				System.out.println("modelo: " + modelo);
				System.out.println("motor: " + motor);
				System.out.println("fabricante: " + fabricante);
				System.out.println("anoFabricacao: " + anoFabricacao);
				System.out.println("anoModelo: " + anoModelo);
				System.out.println("cor: " + cor);
				System.out.println("==============");

			}

		}catch(SQLException erro){
			System.out.println(erro.getMessage());
		}

	}
}