package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity // indica que é uma entidade
@Data //getter e setter
@Builder // padrão de construção
@AllArgsConstructor //inserção de constructors
@NoArgsConstructor
public class Phone {

    @Id // chave primária, outra condição para entidade
    // delegar a função de cadastrar Ids
    // ao generatedvalue, com a opção identity sendo incremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Indicação dos valores de phonetype
    @Enumerated(EnumType.STRING)
    @Column(nullable=false) //regra de banco de dados, dado obrigatório
    private PhoneType type;

    @Column(nullable=false)
    private String number;

}
