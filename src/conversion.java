public class conversion {
    private Double unitaria;
    private Double result;
    private String base_code;
    private String target_code;
    private Double mount;

    public void setMount(Double mount) {
        this.mount = mount;
    }

    public conversion(datosConsulta conversionResApi) {
        this.unitaria = conversionResApi.conversion_rate();
        this.result = conversionResApi.conversion_result();
        this.base_code = conversionResApi.base_code();
        this.target_code = conversionResApi.target_code();
    }

    @Override
    public String toString() {
        String resupuesta = "----Resultados Conversión----\n1 "+base_code+" equivalen a "+unitaria+" "+target_code+"\n"+mount+" "+base_code +" equivalen a "+result+" "+target_code+"\n------------";
        return resupuesta;
    }
}
