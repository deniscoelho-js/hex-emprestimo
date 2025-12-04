package core.io.hex.emprestimo.application.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaJuridica {
    private Long idPessoaJuridica;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private String email;
    private String telefone;
    private String site;
    private DadosFinanceiros dadosFinanceiros;
}
