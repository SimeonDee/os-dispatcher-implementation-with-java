package os.dispatcher.simulator;

/********************************************************************
 * Fullname:    ADEYEMI ADEDOYIN SIMEON
 * Matric:      209188
 * Course:      CSC747 (O/S) Assignment
 * Department:  MSc Computer Science Dept, University of Ibadan
 ********************************************************************/

/**
 * A basic enumeration type to represent process state.
 * A process is either Running, Ready, or Blocked.
 */
public enum ProcessStates {
    RUNNING(0), READY(1), BLOCKED(2);

    private final int id;
    ProcessStates(int id) {this.id = id;}
    public int getValue() {return id;}
    
}
