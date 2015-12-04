package principles.srp.core.reporting;

import principles.srp.core.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);

    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}
