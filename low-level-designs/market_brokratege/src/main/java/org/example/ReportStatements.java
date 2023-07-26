package org.example;

public class ReportStatements {
    public Integer id;
    public String name;
    public String description;

    public ReportStatements(Integer id, String name, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    /// Get the statement by id
    public ReportStatements getStatement(Integer id) {
        return this;
    }
}
