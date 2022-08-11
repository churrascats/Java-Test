package code.JavaReflection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClassReflection {
    
    public String program;

    public ClassReflection() {
    }

    public ClassReflection(String program, Integer displayOrder) {
        this.program = program;
        this.displayOrder = displayOrder;
    }

    public Integer displayOrder;
}
