package principles.srp.core.reporting;

/**
 * Created by jasnab on 11/30/15.
 */
public class ReportFormatter {

    private String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        switch (formatType) {
            case XML:
                convertObjectToXML(object);
                break;
            case CSV:
                convertObjectToCSV(object);
                break;
        }

    }
    private String convertObjectToXML(Object object) {
        return "XML: <title>" + object.toString() + "</title>";
    }

    private String convertObjectToCSV(Object object) {
        return "CSV: ,,, " + object.toString() + "...";
    }

    public String getFormattedValue() { return formattedOutput;}
}
