

package os.dispatcher.simulator;
import java.util.Objects;

/********************************************************************
 * Fullname:    ADEYEMI ADEDOYIN SIMEON
 * Matric:      209188
 * Course:      CSC747 (O/S) Assignment
 * Department:  MSc Computer Science Dept, University of Ibadan
 ********************************************************************/

public class MyProcess implements Comparable{
    
    private final int pid;
    private final int priority;
    private ProcessStates status;
    
    public MyProcess(){
    pid = -1;
    priority = -1;
    status = ProcessStates.BLOCKED;
    }
    
    /**
     * Main constructor
     * @param pid an integer value for the PID, should be handled by the program via a counter.
     * @param priority an integer value for the priority.
     * @param status a ProcessStatus enum type, ProcessStatus.READY, ProcessStatus.RUNNING, ProcessStatus.BLOCKED
     */
    public MyProcess(int pid, int priority, ProcessStates status){
        this.pid = pid;
        this.priority = priority;
        this.status = status;
    }
    
    public MyProcess(MyProcess other){
        this.pid = other.pid;
        this.priority = other.priority;
        this.status = other.status;
    }
    
    @Override
    public boolean equals(Object ob){
        if(ob == null) return false;
        else if (!(ob instanceof MyProcess)) return false;
        else return this.pid == ((MyProcess)ob).pid;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.pid;
        hash = 79 * hash + this.priority;
        hash = 79 * hash + Objects.hashCode(this.status);
        return hash;
    }

    @Override
    public int compareTo(Object ob){
        if(this.priority == ((MyProcess)ob).priority)
            return 0;
        else if(this.priority < ((MyProcess)ob).priority)
            return 1;
        else return -1;
    }
    
    public int getPid() {return this.pid;}
    
    public int getPriority() {return this.priority;}
    
    public ProcessStates getStatus() {return this.status;}
    
    public void setStatus(ProcessStates status) {this.status = status;}
    
}