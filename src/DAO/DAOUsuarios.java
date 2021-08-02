package DAO;

import CONEXOES.ConexaoMySql;
import java.util.ArrayList;
import model.ModelUsuarios;
/**
*
* @author Fernando
*/
public class DAOUsuarios extends ConexaoMySql {

    /**
    * grava Usuarios
    * @param pModelUsuarios
    * @return int
    */
    public int salvarUsuariosDAO(ModelUsuarios pModelUsuarios){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_usuario ("                 
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha"
                + ") VALUES ("                   
                    + "'" + pModelUsuarios.getUsuNome() + "',"
                    + "'" + pModelUsuarios.getUsuLogin() + "',"
                    + "'" + pModelUsuarios.getUsuSenha() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Usuarios
    * @param pIdUsuario
    * @return ModelUsuarios
    */
    public ModelUsuarios getUsuariosDAO(int pIdUsuario){
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_usuario, "
                    + "usu_nome, "
                    + "usu_login, "
                    + "usu_senha "
                    + " FROM "
                    + " tbl_usuario "
                    + "WHERE "
                    + "id_usuario = '" + pIdUsuario + "'"
                    + ";"
                
            );

            while(this.getResultSet().next()){
                modelUsuarios.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuarios.setUsuNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuLogin(this.getResultSet().getString(3));
                modelUsuarios.setUsuSenha(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuarios;
    }

    /**
    * recupera uma lista de Usuarios
        * @return ArrayList
    */
    public ArrayList<ModelUsuarios> getListaUsuariosDAO(){
        ArrayList<ModelUsuarios> listamodelUsuarios = new ArrayList();
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_usuario,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha"
                 + " FROM"
                     + " tbl_usuario"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuarios = new ModelUsuarios();
                modelUsuarios.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuarios.setUsuNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuLogin(this.getResultSet().getString(3));
                modelUsuarios.setUsuSenha(this.getResultSet().getString(4));
                listamodelUsuarios.add(modelUsuarios);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuarios;
    }

    /**
    * atualiza Usuarios
    * @param pModelUsuarios
    * @return boolean
    */
    public boolean atualizarUsuariosDAO(ModelUsuarios pModelUsuarios){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_usuario SET "
                    + "id_usuario = '" + pModelUsuarios.getIdUsuario() + "',"
                    + "usu_nome = '" + pModelUsuarios.getUsuNome() + "',"
                    + "usu_login = '" + pModelUsuarios.getUsuLogin() + "',"
                    + "usu_senha = '" + pModelUsuarios.getUsuSenha() + "'"
                + " WHERE "
                    + "id_usuario = '" + pModelUsuarios.getIdUsuario() + "'"
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
    * exclui Usuarios
    * @param pIdUsuario
    * @return boolean
    */
    public boolean excluirUsuariosDAO(int pIdUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_usuario "
                + " WHERE "
                    + "id_usuario = '" + pIdUsuario + "'"
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