package DAO;

import CONEXOES.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCliente;
/**
*
* @author Fernando
*/
public class DAOCliente extends ConexaoMySql {

  
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_cliente("                   
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                + ") VALUES ("                    
                    + "'" + pModelCliente.getCliNome() + "',"
                    + "'" + pModelCliente.getCliEndereco() + "',"
                    + "'" + pModelCliente.getCliBairro() + "',"
                    + "'" + pModelCliente.getCliCidade() + "',"
                    + "'" + pModelCliente.getCliUf() + "',"
                    + "'" + pModelCliente.getCliCep() + "',"
                    + "'" + pModelCliente.getCliTelefone() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    public ModelCliente getClienteDAO(int IdCliente){
        ModelCliente modelCliente = new ModelCliente();
        try{
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idCliente, "
                    + "cli_nome, "
                    + "cli_endereco, "
                    + "cli_bairro, "
                    + "cli_cidade, "
                    + "cli_uf, "
                    + "cli_cep, "
                    + "cli_telefone "
                    + "FROM tbl_cliente WHERE "
                    + "idCliente = '" + IdCliente + "'"
                    + ";"
                    
            );

            while(this.getResultSet().next()){
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliUf(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliTelefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
    * recupera uma lista de Cliente
        * @return ArrayList
    */
    public ArrayList<ModelCliente> retornarListaClienteDAO(){
           ArrayList<ModelCliente> listamodelCliente = new ArrayList<>();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
        
            this.executarSQL("SELECT idCliente, cli_nome, cli_endereco, cli_bairro, cli_cidade, cli_uf, cli_cep, cli_telefone FROM tbl_cliente;");
            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliUf(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliTelefone(this.getResultSet().getString(8));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_cliente SET "
                    + "idCliente = '" + pModelCliente.getIdCliente()+ "',"
                    + "cli_nome = '" + pModelCliente.getCliNome() + "',"
                    + "cli_endereco = '" + pModelCliente.getCliEndereco() + "',"
                    + "cli_bairro = '" + pModelCliente.getCliBairro() + "',"
                    + "cli_cidade = '" + pModelCliente.getCliCidade() + "',"
                    + "cli_uf = '" + pModelCliente.getCliUf() + "',"
                    + "cli_cep = '" + pModelCliente.getCliCep() + "',"
                    + "cli_telefone = '" + pModelCliente.getCliTelefone() + "'"
                + " WHERE "
                    + "idCliente = '" + pModelCliente.getIdCliente()+ "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Cliente
    * @param pIdCod
    * @return boolean
    */
    public boolean excluirClienteDAO(int pIdCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_cliente "
                + " WHERE "
                    + "idCliente= '" + pIdCliente + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}