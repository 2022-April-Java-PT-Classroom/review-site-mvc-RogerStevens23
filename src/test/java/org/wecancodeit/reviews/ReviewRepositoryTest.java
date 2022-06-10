package org.wecancodeit.reviews;

import org.wecancodeit.reviews.models.Review;
import org.wecancodeit.reviews.repository.ReviewRepository;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, ReviewCategory.MOBO,"B450 Pro Max Ultra Plus", "src/main/resources/static/images/MOBO",
            "The top of the line motherboard of the AM4 socket processors by AMD. With 3 M.2 ports, and 10 sata ports, it's sure to give you plenty of storage at insane read write speeds.");
    private Review reviewTwo = new Review(2L, ReviewCategory.CPU,"Ryzen 8000 26000 1000xx AM4", "src/main/resources/static/images/CPU",
            "The top tier AM4 processor made it part with AMD technology! This is the best of the best of the best CPU on the market for the AM4 socket type. 128 cores, 256 threads for total god-like performance!");

    @Test
    public void shouldFindOneReview() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindAllReviewsInACollection() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }
}