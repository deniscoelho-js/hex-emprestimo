package core.io.hex.emprestimo.application.core.domain;

import core.io.hex.emprestimo.application.core.domain.enums.StatusContrato;

import java.time.LocalDate;
import java.util.List;

public class Emprestimo {
    private Long idParcela;
    private Long idPessoaJuridica;
    private Double valorTotal;
    private Integer quantidadeParcelas;
    private LocalDate dataInicio;
    private StatusContrato statusContrato;
    private List<Parcela> parcelas;
}
