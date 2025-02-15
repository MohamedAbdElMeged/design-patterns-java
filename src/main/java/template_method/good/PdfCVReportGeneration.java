package template_method.good;

import java.io.File;

public class PdfCVReportGeneration extends CVReportGeneration {


    @Override
    public Data extractData(File file) {
        System.out.println("Extracting data from: PDF ");
        return null;
    }


}
