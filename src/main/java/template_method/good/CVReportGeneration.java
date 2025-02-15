package template_method.good;

import java.io.File;

public abstract class CVReportGeneration {

    public GeneratedReport generateCVReport(String cvFilePath){
        var file = readFile(cvFilePath);
        var extractedData = extractData(file);
        var analyzedData = analyzeData(extractedData);
        return generatedReportOf(analyzedData);
    }

    private File readFile(String filePath) {
        System.out.println("reading file from: "+ filePath);
        return null;
    }


    protected abstract Data extractData(File file);


    private AnalyzedData analyzeData(Data data) {
        System.out.println("Analyze Data from: "+ data);
        return null;
    }

    private GeneratedReport generatedReportOf(AnalyzedData analyzedData){
        System.out.println("generate report from: "+ analyzedData);
        return new GeneratedReport(true);
    }
}
