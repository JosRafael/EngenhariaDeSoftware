package com.mycompany.agenda2;

/**
 *
 * @author franc
 */
public class Agenda2 {

    public static void main(String[] args) throws Exception{
        ContatosDAO contatosDAO = new ContatosDAO();

        System.out.println(contatosDAO.consultarPorId(5).getNome());
    }
}
