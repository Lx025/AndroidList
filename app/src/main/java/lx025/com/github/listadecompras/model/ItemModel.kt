package lx025.com.github.listadecompras.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity // Anotação que indica que esta classe é uma entidade, ou seja, uma tabela no banco de dados.
data class ItemModel(

    /**
     * A chave primária da tabela. Cada item na tabela terá um ID único.
     * A anotação @PrimaryKey indica que este campo é a chave primária da tabela.
     * A propriedade autoGenerate é definida como true, o que significa que o Room irá gerar automaticamente um valor único para cada novo item.
     */
    @PrimaryKey(autoGenerate = true)    // Anotação que indica que este campo é a chave primária da tabela.
    val id: Int = 0,    // O valor padrão é 0, mas será substituído pelo valor gerado automaticamente pelo Room.

    /**
     * O nome do item. Este campo será preenchido pelo usuário.
     * Não há anotações especiais neste campo, então ele será uma coluna regular na tabela.
     */
    val name: String
)