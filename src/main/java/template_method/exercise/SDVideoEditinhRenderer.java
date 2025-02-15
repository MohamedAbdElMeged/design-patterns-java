package template_method.exercise;

public class SDVideoEditinhRenderer extends VideoEditingRenderer{
    @Override
    protected void enhanceVideoQuality() {
        System.out.println("Enhance SD video ");
    }
}
