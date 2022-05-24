package agenda;

public class App {

	public static void main(String[] args) throws Exception{
	
	ContatosDAO contatosDAO = new ContatosDAO();
	Contatos contatos = new Contatos();
	
	contatos.setNome("Contato 001");
	contatos.setIdade(10);
	contatos.setDataCadastro("2022-05-24");
	
	contatosDAO.salvar(contatos);
	}

}
