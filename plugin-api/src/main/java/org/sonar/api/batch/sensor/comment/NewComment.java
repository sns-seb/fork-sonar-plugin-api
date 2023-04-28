package org.sonar.api.batch.sensor.comment;

public interface NewComment {
    NewCommentLocation newCommentLocation();

    NewComment at(NewCommentLocation location);

    NewComment setType(Comment.Type type);

    NewComment setText(String text);

    void save();
}
