
package com.tsobu.ona.core.dto.json.register;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RECORDS"
})
@Generated("jsonschema2pojo")
public class SgRegisterHh {

    @JsonProperty("RECORDS")
    public List<Record> records = new ArrayList<Record>();

}
