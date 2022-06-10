package org.wecancodeit.reviews.repository;

import org.springframework.stereotype.Repository;
import org.wecancodeit.reviews.models.Review;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    // Fields
    private Map<Long, Review> reviews = new HashMap<>();

    // Constructor
    public ReviewRepository() {

    }

    public ReviewRepository(Review ...reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviews.put(review.getId(), review);
        }
    }

    // Methods
    public Review findOne(long id) {
        return reviews.get(id);
    }

    public Collection<Review> findAll() {
        return reviews.values();
    }
}