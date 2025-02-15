package template_method.good;

public class GeneratedReport {
    private boolean isPassed;

    public GeneratedReport(boolean isPassed) {
        this.isPassed = isPassed;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }
}
