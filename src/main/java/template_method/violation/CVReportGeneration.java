package template_method.violation;

import java.io.File;

public interface CVReportGeneration {

    GeneratedReport generateCVReport(String cvFilePath);
    File readFile(String filePath);

    Data extractData(File file);

    AnalyzedData analyzeData(Data data);
}
