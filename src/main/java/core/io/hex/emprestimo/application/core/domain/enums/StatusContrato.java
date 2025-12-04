package core.io.hex.emprestimo.application.core.domain.enums;

public enum StatusContrato {
    ATIVO(0, "Ativo"),
    VENCIDO(1, "Vencido"),
    FINALIZADO(2, "Finalizado");

    private final Integer codigo;
    private final String descricao;

    StatusContrato(Integer codigo, String descricao) {
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
