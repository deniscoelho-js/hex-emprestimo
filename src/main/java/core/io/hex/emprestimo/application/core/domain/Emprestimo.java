package core.io.hex.emprestimo.application.core.domain;

import core.io.hex.emprestimo.application.core.domain.enums.StatusContrato;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Emprestimo {
    private Long idParcela;
    private Long idPessoaJuridica;
    private Double valorTotal;
    private Integer quantidadeParcelas;
    private LocalDate dataInicio;
    private StatusContrato statusContrato;
    private List<Parcela> parcelas;
}
