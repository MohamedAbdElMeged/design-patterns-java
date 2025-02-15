package template_method.good;

import java.io.File;

public class WordCVReportGeneration extends CVReportGeneration {

    @Override
    protected Data extractData(File file) {
        System.out.println(" File Extracting data from: Word");
        return null;
    }
}
