package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    public Manager(String name, int salary) {
        this(name, salary, LocalDate.now());
    }

    public LocalDate getHire() {
        return hireDate;
    }

    @Override 
    public String toString() {
        return super.toString() + ", hire date: " + hireDate; 
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!super.equals(obj))
            return false;
        
        Manager manager = (Manager) obj;
        if (hireDate.equals(manager.hireDate))
            return true;
        return false;
    }


}
