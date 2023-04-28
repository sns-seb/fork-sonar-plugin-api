package org.sonar.api.batch.sensor.comment;

import org.sonar.api.batch.fs.InputComponent;
import org.sonar.api.batch.fs.TextRange;

public interface CommentLocation {

  InputComponent getComponent();

  TextRange getRange();
}
