package template_method.exercise;

public class HDVideoEditingRenderer extends VideoEditingRenderer{
    @Override
    protected void enhanceVideoQuality() {
        System.out.println("Enhance HD video");
    }
}
