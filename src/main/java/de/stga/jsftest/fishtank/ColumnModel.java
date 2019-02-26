package de.stga.jsftest.fishtank;

import java.io.Serializable;

public class ColumnModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String header;

    private String property;

    public ColumnModel(final String header, final String property) {
        this.header = header;
        this.property = property;
    }

    public String getHeader() {
        return this.header;
    }

    public String getProperty() {
        return this.property;
    }

}
