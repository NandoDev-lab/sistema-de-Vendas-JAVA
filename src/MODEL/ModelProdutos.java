
package MODEL;
public class ModelProdutos {
    private int idProduto;
    private String prodNome;
    private Double prodValor;
    private int proEstoque;

    /**
     * @return the idPrduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idPrduto the idPrduto to set
     */
    public void setIdProduto(int idPrduto) {
        this.idProduto = idPrduto;
    }

    /**
     * @return the prodNome
     */
    public String getProdNome() {
        return prodNome;
    }

    /**
     * @param prodNome the prodNome to set
     */
    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }

    /**
     * @return the prodValor
     */
    public Double getProdValor() {
        return prodValor;
    }

    /**
     * @param prodValor the prodValor to set
     */
    public void setProdValor(Double prodValor) {
        this.prodValor = prodValor;
    }

    /**
     * @return the proEstoque
     */
    public int getProEstoque() {
        return proEstoque;
    }

    /**
     * @param proEstoque the proEstoque to set
     */
    public void setProEstoque(int proEstoque) {
        this.proEstoque = proEstoque;
    }
    
    
    
}
