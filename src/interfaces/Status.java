package interfaces;

import exceptions.AlreadyHaveStatusException;

public interface Status {
    void addStatus(String status) throws AlreadyHaveStatusException;
    void removeStatus();
    void printStatus();
    String getStatus();
}