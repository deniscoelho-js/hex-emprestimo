package core.io.hex.emprestimo.application.core.domain;

import core.io.hex.emprestimo.application.core.domain.enums.StatusParcela;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Parcela {
    private Long id;
    private Integer numeroParcela;
    private Double valorParcela;
    private LocalDate dataVencimento;
    private StatusParcela statusParcela;
}
