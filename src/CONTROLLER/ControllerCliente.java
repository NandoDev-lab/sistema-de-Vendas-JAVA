package controller;

import DAO.DAOCliente;
import java.util.ArrayList;
import model.ModelCliente;

/**
*
* @author Fernando
*/
public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();

    public int salvarClienteController(ModelCliente modelCliente){
        return this.daoCliente.salvarClienteDAO(modelCliente);
    }
    public ModelCliente getClienteController(int IdCod){
        return this.daoCliente.getClienteDAO(IdCod);
    }    
    public ArrayList<ModelCliente> getListaClienteController(){
        return this.daoCliente.retornarListaClienteDAO();
    }
    public boolean atualizarClienteController(ModelCliente ModelCliente){
        return this.daoCliente.atualizarClienteDAO(ModelCliente);
    }
    public boolean excluirClienteController(int IdCod){
        return this.daoCliente.excluirClienteDAO(IdCod);
    }
}