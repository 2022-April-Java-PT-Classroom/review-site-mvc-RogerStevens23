package org.wecancodeit.reviews.models;
import org.wecancodeit.reviews.ReviewCategory;

public class Review {

    // Fields
    private long id;
    private ReviewCategory reviewCategory;
    private String title, imageUrl, content;

    // Getters
    public long getId() {return id;}
    public String getTitle() {return title;}
    public String getImageUrl() {return imageUrl;}
    public String getContent() {return content;}

    // Constructor
    public Review(long id, String title, String imageUrl, String content) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.content = content;
    }
}