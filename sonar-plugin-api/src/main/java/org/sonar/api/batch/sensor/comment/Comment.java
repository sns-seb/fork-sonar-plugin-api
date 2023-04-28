package org.sonar.api.batch.sensor.comment;

public interface Comment {
    enum Type {
        LINE, BLOCK
    }

    CommentLocation getLocation();

    Type getType();

    String getText();
}
