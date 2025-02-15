package template_method.violation;

import java.io.File;

public class ImageCVReportGeneration implements CVReportGeneration{
    @Override
    public GeneratedReport generateCVReport(String cvFilePath) {
        var file = readFile(cvFilePath);
        var extractedData = extractData(file);
        var analyzedData = analyzeData(extractedData);
        return generatedReportOf(analyzedData);
    }

    private GeneratedReport generatedReportOf(AnalyzedData analyzedData){
        System.out.println("generate report from: "+ analyzedData);
        return new GeneratedReport(true);
    }

    @Override
    public File readFile(String filePath) {
        System.out.println(" reading file from: "+ filePath);
        return null;
    }

    @Override
    public Data extractData(File file) {
        System.out.println(" File Extracting data from: Img");
        return null;
    }

    @Override
    public AnalyzedData analyzeData(Data data) {
        System.out.println(" Analyze Data from: "+ data);
        return null;
    }
}
