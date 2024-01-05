package interfaces;

import exceptions.AlreadyHaveStatusException;

public interface Status {
    public void addStatus(String status) throws AlreadyHaveStatusException;
    public void removeStatus();
    public void printStatus();
    public String getStatus();
}