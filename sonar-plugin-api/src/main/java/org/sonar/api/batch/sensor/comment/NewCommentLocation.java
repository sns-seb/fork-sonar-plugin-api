package org.sonar.api.batch.sensor.comment;

import org.sonar.api.batch.fs.InputComponent;
import org.sonar.api.batch.fs.TextRange;

public interface NewCommentLocation {

  NewCommentLocation on(InputComponent component);

  NewCommentLocation at(TextRange location);
}
