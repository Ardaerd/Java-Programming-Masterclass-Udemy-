package Section_9_InnerAndAbstractClasses_Interface.Interface_Challenge;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
