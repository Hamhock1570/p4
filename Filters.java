package Project4;

/**
 * Created by michael on 10/27/15.
 */
public interface Filters
{

    /**
     * this method will apply the filter to an image and return the filtered image
     * @param image the image to apply filter to
     * @return and image that has been filtered
     */
    Image apply(Image image);

}
