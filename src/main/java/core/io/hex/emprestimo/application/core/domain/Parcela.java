package core.io.hex.emprestimo.application.core.domain;

import core.io.hex.emprestimo.application.core.domain.enums.StatusParcela;

import java.time.LocalDate;

public class Parcela {
    private Long id;
    private Integer numeroParcela;
    private Double valorParcela;
    private LocalDate dataVencimento;
    private StatusParcela statusParcela;
}
