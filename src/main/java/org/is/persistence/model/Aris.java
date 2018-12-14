package org.is.persistence.model;

import lombok.Data;
import javax.persistence.*;

@Table(name = "ARIS")
@SequenceGenerator(name = "SQ_ARIS", sequenceName = "SQ_ARIS")
@Entity
@Data
public class Aris {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "SQ_ARIS", allocationSize = 1, name ="CUST_SEQ")
    private long id;

    @Column(name = "macro_proceso")
    private String macroProcess;

    @Column(name = "sub_proceso")
    private String subProcess;

    @Column(name = "proceso")
    private String process;

    @Column(name = "id_proc")
    private String idProcess;

}
