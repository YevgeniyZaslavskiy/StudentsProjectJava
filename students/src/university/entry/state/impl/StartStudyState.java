package university.entry.state.impl;

import university.entry.state.Context;
import university.entry.state.State;

import java.time.LocalDateTime;

public class StartStudyState implements State {
    @Override
    public void doAction(Context context) {
        context.setState(this);
    }

    @Override
    public boolean isStudy() {
        return true;
    }

    public String toString() {
        return "Student is start study " + LocalDateTime.now().toString();
    }
}
