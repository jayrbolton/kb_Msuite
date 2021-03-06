
package us.kbase.kbmsuite;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: CheckMResults</p>
 * <pre>
 * checkM_results_folder: folder path that stores the CheckM results
 * report_name: report name generated by KBaseReport
 * report_ref: report reference generated by KBaseReport
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "checkM_results_folder",
    "report_name",
    "report_ref"
})
public class CheckMResults {

    @JsonProperty("checkM_results_folder")
    private String checkMResultsFolder;
    @JsonProperty("report_name")
    private String reportName;
    @JsonProperty("report_ref")
    private String reportRef;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("checkM_results_folder")
    public String getCheckMResultsFolder() {
        return checkMResultsFolder;
    }

    @JsonProperty("checkM_results_folder")
    public void setCheckMResultsFolder(String checkMResultsFolder) {
        this.checkMResultsFolder = checkMResultsFolder;
    }

    public CheckMResults withCheckMResultsFolder(String checkMResultsFolder) {
        this.checkMResultsFolder = checkMResultsFolder;
        return this;
    }

    @JsonProperty("report_name")
    public String getReportName() {
        return reportName;
    }

    @JsonProperty("report_name")
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public CheckMResults withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    @JsonProperty("report_ref")
    public String getReportRef() {
        return reportRef;
    }

    @JsonProperty("report_ref")
    public void setReportRef(String reportRef) {
        this.reportRef = reportRef;
    }

    public CheckMResults withReportRef(String reportRef) {
        this.reportRef = reportRef;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((("CheckMResults"+" [checkMResultsFolder=")+ checkMResultsFolder)+", reportName=")+ reportName)+", reportRef=")+ reportRef)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
