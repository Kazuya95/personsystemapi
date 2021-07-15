package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
// Tipos de telefones
public enum PhoneType {

    HOME("Home"), // telefone de casa
    MOBILE("Mobile"), // Celular
    COMMERCIAL("Commercial"); // telefone comercial

    private final String description;

}
