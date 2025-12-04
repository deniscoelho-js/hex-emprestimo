package core.io.hex.emprestimo.application.core.domain.enums;

public enum StatusParcela {
    ABERTO(0, "Em aberto"),
    VENCIDA(1, "Vencida"),
    FINALIZADA(2, "Finalizada");

    private final Integer codigo;
    private final String descricao;


    StatusParcela(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
