package university.entry.state.impl;

import university.entry.state.Context;
import university.entry.state.State;

import java.time.LocalDateTime;

public class StopStudyState implements State {
    @Override
    public void doAction(Context context) {
        context.setState(this);
    }

    @Override
    public boolean isStudy() {
        return false;
    }

    public String toString() {
        return "Student not study " + LocalDateTime.now().toString();
    }
}
