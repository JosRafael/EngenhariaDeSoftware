package agenda;

public class App {

	public static void main(String[] args) throws Exception{
	
	ContatosDAO contatosDAO = new ContatosDAO();
	Contatos contato = new Contatos();
	
	contato.setId(10);
	contatosDAO.excluir(contato);
	
	
	
	
	
	
	/*c.setNome("teste atualiza");
	c.setIdade(50);
	c.setDataCadastro("2022-06-01");
	c.setId(10);
	contatosDAO.atualizar(c);
	*/
	
	/*
	c.setNome("CONTATO AULA 02");
	c.setIdade(35);
	c.setDataCadastro("2022-06-06");

	contatosDAO.salvar(c);
	*/
	
		
		
	/*
	Contatos contatos2 = new Contatos();
	contatos2.setNome("Contato 001");
	contatos2.setIdade(10);
	contatos2.setDataCadastro("2022-05-24");
	
	contatosDAO.salvar(contatos2);
	*/
	}

}
