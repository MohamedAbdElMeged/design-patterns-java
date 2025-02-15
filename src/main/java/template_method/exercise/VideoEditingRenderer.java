package template_method.exercise;

public abstract class VideoEditingRenderer {

    private void renderVideo(){
        System.out.println("Rendering video for");
    }

    public void editVideo(){
        readVideo();
        enhanceAudio();
        enhanceVideoQuality();
        applySomeFilter();
        renderVideo();

    }

    private void readVideo(){
        System.out.println("Reading video");
    }
    private  void enhanceAudio(){
        System.out.println("Enahncing audio");
    }

    protected abstract void enhanceVideoQuality();

    private  void applySomeFilter(){
        System.out.println("applySomeFilter..");
    }




}
