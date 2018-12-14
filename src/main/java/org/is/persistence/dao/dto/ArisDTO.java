package org.is.persistence.dao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArisDTO {

    private long id;
    private String macroProcess;
    private String subProcess;
    private String process;
    private String idProcess;

}
