package template_method.exercise;

public class FHDVideoEditingRenderer extends VideoEditingRenderer{
    @Override
    protected void enhanceVideoQuality() {
        System.out.println("Enhance FHD video");
    }
}
